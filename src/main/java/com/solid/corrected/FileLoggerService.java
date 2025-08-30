package com.solid.corrected;

public class FileLoggerService implements Logger {
    @Override
    public void log(String message) {
        System.out.println("FileLogger: " + message);
    }
}
