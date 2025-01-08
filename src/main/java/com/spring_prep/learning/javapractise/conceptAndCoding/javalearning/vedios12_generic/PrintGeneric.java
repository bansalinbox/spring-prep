package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedios12_generic;

public class PrintGeneric<T, V> {

    T value;

    public void setValue(T value){
        this.value = value;
    }

    public V getValue(){

        return (V)String.valueOf(value);
    }
}
