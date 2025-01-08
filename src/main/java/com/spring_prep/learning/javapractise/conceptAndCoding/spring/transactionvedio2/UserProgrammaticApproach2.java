package com.spring_prep.learning.javapractise.conceptAndCoding.spring.transactionvedio2;

import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Component
public class UserProgrammaticApproach2 {

    TransactionTemplate transactionTemplate;

    public UserProgrammaticApproach2(TransactionTemplate transactionTemplate){
        this.transactionTemplate = transactionTemplate;
    }

    public void updateUser(){
        TransactionCallback<TransactionStatus> dbOperation = (TransactionStatus status) -> {
            System.out.println("do some db operation");
            return status;
        };

        TransactionStatus status = transactionTemplate.execute(dbOperation);
    }
}
