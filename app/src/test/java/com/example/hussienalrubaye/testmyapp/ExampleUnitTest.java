package com.example.hussienalrubaye.testmyapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    static operations op;
    @BeforeClass
    public static void beforrun(){
        op=new operations();
        System.out.print("New instanse of OP\n");
    }
    @AfterClass
    public static void Beofrerrun(){
        System.out.print("After instanse of OP\n");
    }
    @Ignore
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void divation_isCorrect() throws Exception{
         double R=op.Div(10.0,0);
        assertEquals("is nort correct results",0,R,0.0);
    }
    @Test
    public void sum_isCorrect() throws Exception{
         double R=op.sum(10.0,5);
        assertEquals("is nort correct results",15,R,0.0);
    }

}