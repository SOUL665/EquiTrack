package com.aakash.equi_track.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "stocks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String ticker;

    private Double currentPrice;
    private Double highPriceOfDay;
    private Double lowPriceOfDay;
    private Double openPriceOfDay;
    private Double previousClosePrice;

    private LocalDateTime lastUpdated;
}
