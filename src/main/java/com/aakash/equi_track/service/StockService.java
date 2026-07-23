package com.aakash.equi_track.service;

import com.aakash.equi_track.dto.FinnhubQuoteDto;
import com.aakash.equi_track.entity.Stock;
import com.aakash.equi_track.exception.StockNotFoundException;
import com.aakash.equi_track.repository.StockRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StockService {

    private final StockRepository stockRepository;
    private final RestTemplate restTemplate;

    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.url}")
    private String apiUrl;

    public StockService(StockRepository stockRepository, RestTemplate restTemplate) {
        this.stockRepository = stockRepository;
        this.restTemplate = restTemplate;
    }

    public Stock fetchAndSaveStock(String ticker) {
        // This null check stops IntelliJ from forcing an @ symbol
        if (ticker == null) {
            throw new IllegalArgumentException("Ticker cannot be null");
        }

        String url = String.format("%s?symbol=%s&token=%s", apiUrl, ticker.toUpperCase(), apiKey);

        FinnhubQuoteDto quote = restTemplate.getForObject(url, FinnhubQuoteDto.class);

        if (quote == null || quote.getCurrentPrice() == null || quote.getCurrentPrice() == 0) {
            throw new RuntimeException("Failed to fetch stock data or invalid ticker: " + ticker);
        }

        Stock stock = stockRepository.findByTicker(ticker.toUpperCase())
                .orElse(Stock.builder().ticker(ticker.toUpperCase()).build());

        stock.setCurrentPrice(quote.getCurrentPrice());
        stock.setHighPriceOfDay(quote.getHighPriceOfDay());
        stock.setLowPriceOfDay(quote.getLowPriceOfDay());
        stock.setOpenPriceOfDay(quote.getOpenPriceOfDay());
        stock.setPreviousClosePrice(quote.getPreviousClosePrice());
        stock.setLastUpdated(LocalDateTime.now());

        return stockRepository.save(stock);
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public void deleteStock(String ticker) {
        if (ticker == null) {
            throw new IllegalArgumentException("Ticker cannot be null");
        }

        Stock stock = stockRepository.findByTicker(ticker.toUpperCase())
                .orElseThrow(() -> new StockNotFoundException("Stock not found: " + ticker));

        stockRepository.delete(stock);
    }
}