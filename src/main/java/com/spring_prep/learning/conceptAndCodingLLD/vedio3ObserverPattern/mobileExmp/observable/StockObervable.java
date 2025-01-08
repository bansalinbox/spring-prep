package com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observable;

import com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observer.NotificationAlertObserver;

public interface StockObervable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void nofiy();

    void setData(int count);

    int getData();
}
