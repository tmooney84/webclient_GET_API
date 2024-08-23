package org.example.getapi;

import org.example.getapi.model.Current;

public class PojoTestRunner {
    public static void main(String[] args){
        Current siteA = new Current();
        String ATest = siteA.getSurfLineWaveHeight();
        System.out.println(siteA);
        System.out.println(ATest);
    }
}
