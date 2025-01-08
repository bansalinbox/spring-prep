package com.spring_prep.learning.javapractise.conceptAndCoding.spring.vedios18_interceptor.after_controller_class;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation {

    int key() default 0;

    String name() default "default name";

}
