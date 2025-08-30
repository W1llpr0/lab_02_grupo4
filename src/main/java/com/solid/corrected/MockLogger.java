package com.solid.corrected;

public class MockLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("MockLogger: " + message);
    }
}
