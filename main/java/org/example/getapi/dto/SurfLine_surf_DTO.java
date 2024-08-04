package org.example.getapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class SurfLine_surf_DTO {

    // Getters and Setters
    @JsonProperty("associated")
    private Associated associated;

    @JsonProperty("data")
    private Data data;

    // Nested classes

    @Setter
    @Getter
    public static class Associated {
        // Getters and Setters
        @JsonProperty("units")
        private Units units;

        @JsonProperty("location")
        private Location location;

        @JsonProperty("forecastLocation")
        private ForecastLocation forecastLocation;

        @JsonProperty("runInitializationTimestamp")
        private long runInitializationTimestamp;

    }

    @Setter
    @Getter
    public static class Units {
        // Getters and Setters
        @JsonProperty("waveHeight")
        private String waveHeight;

    }

    @Setter
    @Getter
    public static class Location {
        // Getters and Setters
        @JsonProperty("lon")
        private double lon;

        @JsonProperty("lat")
        private double lat;

    }

    @Setter
    @Getter
    public static class ForecastLocation {
        // Getters and Setters
        @JsonProperty("lon")
        private double lon;

        @JsonProperty("lat")
        private double lat;

    }

    @Setter
    @Getter
    public static class Data {
        // Getters and Setters
        @JsonProperty("surf")
        private List<Surf> surf;

    }

    @Setter
    @Getter
    public static class Surf {
        // Getters and Setters
        @JsonProperty("timestamp")
        private long timestamp;

        @JsonProperty("utcOffset")
        private int utcOffset;

        @JsonProperty("surf")
        private SurfDetails surfDetails;

    }

    @Setter
    @Getter
    public static class SurfDetails {
        // Getters and Setters
        @JsonProperty("min")
        private double min;

        @JsonProperty("max")
        private double max;

        @JsonProperty("plus")
        private boolean plus;

        @JsonProperty("humanRelation")
        private String humanRelation;

        @JsonProperty("raw")
        private Raw raw;

    }

    @Setter
    @Getter
    public static class Raw {
        // Getters and Setters
        @JsonProperty("min")
        private double min;

        @JsonProperty("max")
        private double max;

    }
}


/*
Example surf JSON output from https://services.surfline.com/kbyg/spots/forecasts/surf?cacheEnabled=true&days=5&intervalHours=1&spotId=5842041f4e65fad6a770888a&units%5BwaveHeight%5D=FT
{
    "associated": {
        "units": {
            "waveHeight": "FT"
        },
        "location": {
            "lon": -117.58843,
            "lat": 33.38143999849023
        },
        "forecastLocation": {
            "lat": 33.35,
            "lon": -117.65
        },
        "runInitializationTimestamp": 1722664800
    },
    "data": {
        "surf": [
            {
                "timestamp": 1722668400,
                "utcOffset": -7,
                "surf": {
                    "min": 3,
                    "max": 5,
                    "plus": false,
                    "humanRelation": "Waist to head",
                    "raw": {
                        "min": 3.40007,
                        "max": 5.25504
                    }
                }
            },
            {
                "timestamp": 1722672000,
                "utcOffset": -7,
                "surf": {
                    "min": 4,
                    "max": 5,
                    "plus": false,
                    "humanRelation": "Chest to head",
                    "raw": {
                        "min": 3.69301,
                        "max": 5.37228
                    }
                }
            },
            {
                "timestamp": 1722675600,
                "utcOffset": -7,
                "surf": {
                    "min": 4,
                    "max": 5,
                    "plus": false,
                    "humanRelation": "Chest to head",
                    "raw": {
                        "min": 3.8219,
                        "max": 5.35829
                    }
                }
            },
            {
                "timestamp": 1722679200,
                "utcOffset": -7,
                "surf": {
                    "min": 4,
                    "max": 5,
                    "plus": false,
                    "humanRelation": "Chest to head",
                    "raw": {
                        "min": 3.85236,
                        "max": 5.27867
                    }
                }
            },
 */