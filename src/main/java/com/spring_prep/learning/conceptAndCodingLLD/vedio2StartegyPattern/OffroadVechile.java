package com.spring_prep.learning.conceptAndCodingLLD.vedio2StartegyPattern;

import com.spring_prep.learning.conceptAndCodingLLD.vedio2StartegyPattern.strategy.RoughDrive;

public class OffroadVechile extends Vechile{

    OffroadVechile(){
        super(new RoughDrive());
    }

}
