package com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observer;

import com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observable.StockObervable;

public class EmailNotificationObserverImpl implements NotificationAlertObserver{

    StockObervable stockObervable;
    String email;

    public EmailNotificationObserverImpl(String email, StockObervable stockObervable){
        this.email = email;
        this.stockObervable = stockObervable;
    }

    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String email){
        System.out.println("Sending an email to " + email);
    }
}
