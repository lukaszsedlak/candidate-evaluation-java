package org.example;

class TestEnabler {

    String token;
    String testLevel;

    public TestEnabler(String token, String testLevel) {
        this.token = token;
        this.testLevel = testLevel;
    }

    public void createTestData(){
        System.out.println("Test data is created");
    }

}