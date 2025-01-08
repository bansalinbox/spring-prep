package com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observer;

import com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observable.StockObervable;

public class MobileAlertNotificationObserver implements NotificationAlertObserver{

    String userName;
    StockObervable stockObervable;

    public MobileAlertNotificationObserver(String userName, StockObervable stockObervable){
        this.userName = userName;
        this.stockObervable = stockObervable;
    }

    @Override
    public void update() {
        System.out.println("Notifying user on mobile : " + userName + " has stock of " +stockObervable.getData());
    }
}
