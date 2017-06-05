package com.lucasmarques.functionalinterfaces;

/**
 * Created by lucascmarques on 04/06/17.
 */
@FunctionalInterface // optional
public interface Validator<T> {

    boolean validate(T t);

}
