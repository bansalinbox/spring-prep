package com.spring_prep.learning.conceptAndCodingLLD.vedio2StartegyPattern;

import com.spring_prep.learning.conceptAndCodingLLD.vedio2StartegyPattern.strategy.NormalDrive;

public class GoodVechile extends Vechile{

    public GoodVechile() {
        super(new NormalDrive());
    }
}
