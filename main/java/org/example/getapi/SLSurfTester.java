package org.example.getapi;

import org.example.getapi.dto.SurfLine_surf_DTO;
import org.example.getapi.service.SurfLine_surf_Service;

public class SLSurfTester {
    public static void main(String[] args) {
        SurfLine_surf_Service service = new SurfLine_surf_Service();
        try {
            SurfLine_surf_DTO surfDTO = service.getSurfLineSurf();
            System.out.println(surfDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
