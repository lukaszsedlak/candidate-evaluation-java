package org.example;
public class TestAnalyser extends  TestEnabler {

    Boolean analyse;

    TestAnalyser(String token, String testLevel, Boolean analyse) {
        super(token, testLevel);
        this.analyse = analyse;
    }

}