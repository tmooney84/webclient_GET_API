package org.example.getapi;

import org.example.getapi.dto.SurfLine_wind_DTO;
import org.example.getapi.service.SurfLine_wind_Service;

public class SLWindTester {
    public static void main(String[] args) {
        SurfLine_wind_Service service = new SurfLine_wind_Service();
        try {
            SurfLine_wind_DTO windDTO = service.getSurfLineWind();
            // Print out the ratingDTO
            System.out.println(windDTO);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

