package org.example.getapi.service;

import org.example.getapi.dto.SurfLine_rating_DTO;
import org.example.getapi.model.SurfLine_rating;
import org.springframework.web.reactive.function.client.WebClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;

public class SurfLine_rating_Service implements Serializable {
    private final WebClient webClient;
    private final ObjectMapper objectMapper;

    public SurfLine_rating_Service() {
        this.webClient = WebClient.builder().build();
        this.objectMapper = new ObjectMapper();
    }

// public SurfLineRatingDTO getSurfLineRating(String spotId) throws Exception {
    //                                      why this? ^^^

    //Webclient to a GET method and pull the JSON for mapping
    public SurfLine_rating_DTO getSurfLineRating() throws Exception {
        String surfLineRating_LowerTrestles = "https://services.surfline.com/kbyg/spots/forecasts/rating?spotId=5842041f4e65fad6a770888a&days=5&intervalHours=1&cacheEnabled=trued";

        String response = webClient.get()
                .uri(surfLineRating_LowerTrestles)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        // Deserialize the JSON response to the SurfLine_rating_DTO class
        SurfLine_rating_DTO surfLineRating = objectMapper.readValue(response, SurfLine_rating_DTO.class);
        return surfLineRating;
    }
}