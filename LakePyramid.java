package com.water.bodies;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LakePyramid {

    public static void method() {
        RiverTruckee.someMethod();
        new com.fasterxml.jackson.databind.ObjectMapper()
                .enable(com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        new com.water.bodies.fasterxml.jackson.databind.ObjectMapper()
                .enable(com.water.bodies.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
    }
}
