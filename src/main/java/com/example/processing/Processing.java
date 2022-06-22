package com.example.processing;

import java.util.logging.Logger;

public class Processing {
    private static Logger logger;

    public static String processingPinChange(String pin, String pan) {
        logger = Logger.getLogger(Processing.class.getName());
        logger.info(String.format("Pin %s was installed on card %s", pin, pan));
        return "200";
    }
}
