package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_given_number_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String temp = fizzBuzz.say(3);

        //then
        assertEquals(temp,"Fizz");
    }



}
