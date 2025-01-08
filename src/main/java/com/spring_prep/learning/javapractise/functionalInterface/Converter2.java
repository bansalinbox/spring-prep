package com.spring_prep.learning.javapractise.functionalInterface;

@FunctionalInterface
public interface Converter2<T, S, V> {

    V convert(T a, S b);

}
