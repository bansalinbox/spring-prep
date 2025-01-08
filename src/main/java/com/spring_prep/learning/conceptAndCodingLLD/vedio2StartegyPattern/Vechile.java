package com.spring_prep.learning.conceptAndCodingLLD.vedio2StartegyPattern;

import com.spring_prep.learning.conceptAndCodingLLD.vedio2StartegyPattern.strategy.DriveStrategy;

public class Vechile {

    DriveStrategy driveStrategy;

    public Vechile(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
