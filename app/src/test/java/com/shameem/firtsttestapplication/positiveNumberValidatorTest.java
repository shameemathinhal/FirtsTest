package com.shameem.firtsttestapplication;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class positiveNumberValidatorTest {

    positiveNumberValidator SUT;
    @Before
    public void setup(){
        SUT=new positiveNumberValidator();
    }


    @Test
    public void test1(){
        boolean result=SUT.isPositive(-1);
        Assert.assertThat(result, CoreMatchers.is(false));
    }

    @Test
    public void test2(){
        boolean result=SUT.isPositive(0);
        Assert.assertThat(result, CoreMatchers.is(false));
    }

    @Test
    public void test3(){
        boolean result=SUT.isPositive(1);
        Assert.assertThat(result, CoreMatchers.is(true));
    }






}