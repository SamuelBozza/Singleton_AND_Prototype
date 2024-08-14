package org.dio.singletype.singleton;

import org.springframework.stereotype.Component;

@Component
public class LoggerService {
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
