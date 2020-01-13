package com.padmaja.stringreverse;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class stringUtilTest {
    stringUtil stringUtil;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("set up class");
        // ForLoopExample forLoopExample = new ForLoopExample();
    }

    @Before
    public void setUp() {
        stringUtil = new stringUtil();


    }
    @After
    public void tearDown() {
        System.out.println("tear down");


    }



    @Test
    public void parse_test1() {

        double result= stringUtil.parser("2020.1301");
        Double expResult = 2021.1301;
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void parser_test2() {
       double result = stringUtil.parser("010202202022222.23342343545454532446576878797809890997979798675");
       Double expResult = 1.0202202022223234E13;
       assertEquals(expResult, result,0.0);
    }

}