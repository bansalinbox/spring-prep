package com.spring_prep.learning.javapractise.functionalInterface;

@FunctionalInterface
public interface Converter<T, U> {

    U convert(T from);
}
