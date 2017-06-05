package com.lucasmarques.functionalinterfaces;

/**
 * Created by lucascmarques on 04/06/17.
 */
public class Chapter3 {

    public static void main(String[] args) {
        Validator<String> validatorCEP = (cep) -> cep.matches("[0-9]{5}-[0-9]{3}");
        System.out.println(validatorCEP.validate("04101-300"));
    }

}
