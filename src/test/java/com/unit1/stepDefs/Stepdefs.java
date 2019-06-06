package com.unit1.stepDefs;

import cucumber.api.java.en.Given;

public class Stepdefs {
    @Given("a test")
    public void a_test() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id);
    }
}
