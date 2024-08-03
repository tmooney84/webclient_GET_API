package org.example.getapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//Needed Data from each JSON>>> forecastLocation>longitude & latitude

// humanRelation
// RATING:
// SWELLS:
// TIDES:
//OPEN-METRO: "weather_code","temperature_2m","wind_speed_10m", "wind_direction_10m"

//SurfLine_surf will give object with hourly updates on
// hourly updates on: data>>>surf>>>timestamp, surf.min & surf.max & surf.plus(boolean),
public class SurfLine_surf {
   //timestamp should be the identifier for the particular row in the database
   @JsonProperty("timestamp")
   Long timestamp;

    final Integer PST_UTCOffset = -7;

    @JsonProperty("min")
    Integer min;
    @JsonProperty("max")
    Integer max;
    @JsonProperty("plus")
    Boolean plus;
    @JsonProperty("humanRelation")
    String humanRelation;
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