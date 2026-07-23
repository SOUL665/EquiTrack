package com.aakash.equi_track.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FinnhubQuoteDto {

    @JsonProperty("c")
    private Double currentPrice;

    @JsonProperty("h")
    private Double highPriceOfDay;

    @JsonProperty("l")
    private Double lowPriceOfDay;

    @JsonProperty("o")
    private Double openPriceOfDay;

    @JsonProperty("pc")
    private Double previousClosePrice;
}
