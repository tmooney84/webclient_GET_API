package org.example.getapi;

import org.example.getapi.dto.SurfLine_rating_DTO;
import org.example.getapi.dto.SurfLine_sunlight_DTO;
import org.example.getapi.service.SurfLine_rating_Service;
import org.example.getapi.service.SurfLine_sunlight_Service;

public class SLSunlightTester {
    public static void main(String[] args) {
        SurfLine_sunlight_Service service = new SurfLine_sunlight_Service();
        try {
            SurfLine_sunlight_DTO sunlightDTO = service.getSurfLineSunlight();
            // Print out the ratingDTO
            System.out.println(sunlightDTO);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

