package com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp;

import com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observable.IPhoneObservable;
import com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observable.StockObervable;
import com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observer.EmailNotificationObserverImpl;
import com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observer.MobileAlertNotificationObserver;
import com.spring_prep.learning.conceptAndCodingLLD.vedio3ObserverPattern.mobileExmp.observer.NotificationAlertObserver;

public class RunMobileExmp {

    public static void main(String[] args) {

        StockObervable iphone = new IPhoneObservable();

        NotificationAlertObserver observer1 = new EmailNotificationObserverImpl("bansalinbox@gmail.com", iphone);
        NotificationAlertObserver observer2 = new EmailNotificationObserverImpl("divyagoel2009@gmail.com", iphone);
        NotificationAlertObserver observer3 = new MobileAlertNotificationObserver("Mr Cooper", iphone);

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);

        iphone.setData(2);

    }
}
