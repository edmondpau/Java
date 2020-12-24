package com.SWE.SWE.JAVA;

import com.SWE.SWE.lesson3.Name;

public class PersonTest {
    
    @Test
    public void shouldReturnHelloWorld(){

        Person Edmond = new Person();
        assertEquals("Hello World, edmond.helloWorld()");
    }

}