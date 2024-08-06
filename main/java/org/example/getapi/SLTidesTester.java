package org.example.getapi;

import org.example.getapi.dto.SurfLine_tides_DTO;
import org.example.getapi.service.SurfLine_tides_Service;

public class SLTidesTester {
    public static void main(String[] args) {
        SurfLine_tides_Service service = new SurfLine_tides_Service();
        try {
            SurfLine_tides_DTO ratingDTO = service.getSurfLineTides();
            // Print out the ratingDTO
            System.out.println(ratingDTO);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

