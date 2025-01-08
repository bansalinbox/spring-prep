package com.spring_prep.learning.javapractise.conceptAndCoding.spring.transactionvedio2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

@Configuration
public class TransAppConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource db = new DriverManagerDataSource();
        return db;
    }

    @Bean
    public PlatformTransactionManager userTransactionMgr(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    public TransactionTemplate transactionTemplate(PlatformTransactionManager userTransactionMgr){
        return new TransactionTemplate(userTransactionMgr);
    }
}
