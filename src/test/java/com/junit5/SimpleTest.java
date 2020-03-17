package com.junit5;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @BeforeAll
    static void beforeAll(){
        LOG.info("Before All");
    }

    @BeforeEach
    void beforeEach(){
        LOG.info("Before Each");
    }

    @AfterAll
    static void afterAll(){
        LOG.info("After All");
    }

    @AfterEach
    void afterEach(){
        LOG.info("After Each");
    }

    @Test
    void simpleTest1(){
        LOG.info("Test1 complete");
    }

    @Test
    void simpleTest2(){
        LOG.info("Test2 complete");
    }
}
