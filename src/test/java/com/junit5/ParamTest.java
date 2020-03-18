package com.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParamTest {
    private static final Logger LOG = LoggerFactory.getLogger(ParamTest.class);


    private static Object[][] dataProvider(){
        return new Object[][] {
                {"Vasily", 46},
                {"Ivan", 35},
                {"Valera", 33}
        };
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void paramTest1(String name, int age){
        String output = String.format("Name: '%s' | Age: '%d'", name, age);
        LOG.info(output);
    }

}
