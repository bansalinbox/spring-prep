package com.spring_prep.learning.conceptAndCodingLLD.vedio2StartegyPattern.strategy;

public class CarefullDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is carefull drive strategy");
    }
}
