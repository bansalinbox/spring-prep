package com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observable;

import com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements StockObervable{

    List<NotificationAlertObserver> observers = new ArrayList<>();
    public int currentCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void nofiy() {
        for (NotificationAlertObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setData(int newCount) {
        if(currentCount == 0){
            nofiy();
        }
        currentCount = currentCount + newCount;
    }

    public int getData(){
        return this.currentCount;
    }
}
