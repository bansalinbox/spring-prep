package com.spring_prep.learning.conceptAndCodingLLD.vedio2StartegyPattern.strategy;

public class RoughDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is rough drive strategy");
    }
}
