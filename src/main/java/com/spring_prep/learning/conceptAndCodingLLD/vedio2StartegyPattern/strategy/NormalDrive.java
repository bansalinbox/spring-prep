package com.spring_prep.learning.conceptAndCodingLLD.vedio2StartegyPattern.strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is the normal drive strategy");
    }
}
