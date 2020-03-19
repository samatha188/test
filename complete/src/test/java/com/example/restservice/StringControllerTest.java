package com.example.restservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(PowerMockRunner.class)
public class StringControllerTest {

    ResponseValue resp= new ResponseValue();
    @Test
    public void isInputValidTestwithSingleChar(){
        assertFalse(StringController.isInputDataValid("x", resp));
    }

    @Test
    public void isInputValidTestwithEmptyString(){
        assertFalse(StringController.isInputDataValid("", resp));
    }
    @Test
    public void isInputValidTestwithNullString(){
        assertFalse(StringController.isInputDataValid(null, resp));
    }
    @Test
    public void isInputValidTestwithValidString(){
        assertTrue(StringController.isInputDataValid("Hello World", resp));
    }

}
