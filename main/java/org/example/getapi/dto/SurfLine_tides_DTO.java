package org.example.getapi.dto;

public class SurfLine_tides_DTO {
   Long lowTideTimeStamp1;

   //may want to change others to this as well
   final Integer PST_UTCOffset = -7;

   Long highTideTimeStamp1;

    Long lowTideTimeStamp2;

    Long highTideTimeStamp2;
}


/*Example sunlight JSON Data: https://services.surfline.com/kbyg/spots/forecasts/tides?spotId=5842041f4e65fad6a770888a&days=6&cacheEnabled=true&units%5BtideHeight%5D=FT
{
        "associated": {
        "utcOffset": -7,
        "units": {
        "tideHeight": "FT"
        },
        "tideLocation": {
        "name": "San Clemente, California",
        "min": -3.51,
        "max": 8.89,
        "lon": -117.6166,
        "lat": 33.4167,
        "mean": 0
        }
        },
        "data": {
        "tides": [
        {
        "timestamp": 1722668400,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 3.08
        },
        {
        "timestamp": 1722672000,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 1.5
        },
        {
        "timestamp": 1722675600,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 0.16
        },
        {
        "timestamp": 1722679200,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": -0.71
        },
        {
        "timestamp": 1722682237,
        "utcOffset": -7,
        "type": "LOW",
        "height": -0.95
        },
        {
        "timestamp": 1722682800,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": -0.93
        },
        {
        "timestamp": 1722686400,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": -0.51
        },
        {
        "timestamp": 1722690000,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 0.44
        },
        {
        "timestamp": 1722693600,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 1.66
        },
        {
        "timestamp": 1722697200,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 2.83
        },
        {
        "timestamp": 1722700800,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 3.71
        },
        {
        "timestamp": 1722704400,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 4.11
        },
        {
        "timestamp": 1722705404,
        "utcOffset": -7,
        "type": "HIGH",
        "height": 4.13
        },
        {
        "timestamp": 1722708000,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 4.01
        },
        {
        "timestamp": 1722711600,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 3.54
        },
        {
        "timestamp": 1722715200,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 2.89
        },
        {
        "timestamp": 1722718800,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 2.33
        },
        {
        "timestamp": 1722722400,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 2.07
        },
        {
        "timestamp": 1722722862,
        "utcOffset": -7,
        "type": "LOW",
        "height": 2.07
        },
        {
        "timestamp": 1722726000,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 2.25
        },
        {
        "timestamp": 1722729600,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 2.9
        },
        {
        "timestamp": 1722733200,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 3.89
        },
        {
        "timestamp": 1722736800,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 4.98
        },
        {
        "timestamp": 1722740400,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 5.87
        },
        {
        "timestamp": 1722744000,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 6.29
        },
        {
        "timestamp": 1722744726,
        "utcOffset": -7,
        "type": "HIGH",
        "height": 6.3
        },
        {
        "timestamp": 1722747600,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 6.1
        },
        {
        "timestamp": 1722751200,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 5.29
        },
        {
        "timestamp": 1722754800,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 3.98
        },
        {
        "timestamp": 1722758400,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 2.43
        },
        {
        "timestamp": 1722762000,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 0.93
        },
        {
        "timestamp": 1722765600,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": -0.21
        },
        {
        "timestamp": 1722769200,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": -0.79
        },
        {
        "timestamp": 1722770528,
        "utcOffset": -7,
        "type": "LOW",
        "height": -0.82
        },
        {
        "timestamp": 1722772800,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": -0.7
        },
        {
        "timestamp": 1722776400,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 0.01
        },
        {
        "timestamp": 1722780000,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 1.13
        },
        {
        "timestamp": 1722783600,
        "utcOffset": -7,
        "type": "NORMAL",
        "height": 2.36
        },
 */