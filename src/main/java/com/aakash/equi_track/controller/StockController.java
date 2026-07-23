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

    @GetMapping("/{ticker}")
    public ResponseEntity<Stock> trackStock(@PathVariable String ticker) {
        Stock stock = stockService.fetchAndSaveStock(ticker);
        return ResponseEntity.ok(stock);
    }

    @GetMapping
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @DeleteMapping("/{ticker}")
    public ResponseEntity<String> deleteStock(@PathVariable String ticker) {
        stockService.deleteStock(ticker);
        return ResponseEntity.ok("Stock " + ticker.toUpperCase() + " removed from tracking.");
    }

    @PutMapping("/{ticker}/refresh")
    public ResponseEntity<Stock> refreshStock(@PathVariable String ticker) {
        Stock updatedStock = stockService.fetchAndSaveStock(ticker);
        return ResponseEntity.ok(updatedStock);
    }
}