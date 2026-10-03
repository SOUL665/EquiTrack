package com.aakash.equi_track.controller;

import com.aakash.equi_track.entity.Stock;
import com.aakash.equi_track.service.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    // Fetch and save stock details
    @GetMapping("/{ticker}")
    public ResponseEntity<Stock> getStockDetails(@PathVariable String ticker) {
        Stock stock = stockService.fetchAndSaveStock(ticker.toUpperCase());
        return ResponseEntity.ok(stock);
    }

    // Get all tracked stocks
    @GetMapping
    public ResponseEntity<List<Stock>> getAllStocks() {
        List<Stock> stocks = stockService.getAllStocks();
        return ResponseEntity.ok(stocks);
    }

    // Remove stock from tracking
    @DeleteMapping("/{ticker}")
    public ResponseEntity<String> removeStock(@PathVariable String ticker) {
        stockService.deleteStock(ticker.toUpperCase());
        return ResponseEntity.ok(
                "Stock " + ticker.toUpperCase() + " removed from tracking."
        );
    }

    // Refresh stock information
    @PutMapping("/{ticker}/refresh")
    public ResponseEntity<Stock> refreshStockData(@PathVariable String ticker) {
        Stock updatedStock = stockService.fetchAndSaveStock(ticker.toUpperCase());
        return ResponseEntity.ok(updatedStock);
    }
}
