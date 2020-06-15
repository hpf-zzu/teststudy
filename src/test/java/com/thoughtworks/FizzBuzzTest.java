package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_given_number_35(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String temp = fizzBuzz.say(35);
        //then
        assertEquals(temp,"BuzzWhizz");

    }

    @Test
    public void should_return_fizz_given_number_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String temp = fizzBuzz.say(3);

        //then
        assertEquals(temp,"Fizz");
    }
    @Test
    public void should_return_fizz_given_number_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String temp = fizzBuzz.say(7);

        //then
        assertEquals(temp,"Whizz");
    }

    @Test
    public void should_return_fizzBuzz_given_number_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String temp = fizzBuzz.say(5);

        //then
        assertEquals(temp,"Buzz");
    }

    @Test
    public void should_return_fizzBuzz_given_number_42() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String temp = fizzBuzz.say(42);

        //then
        assertEquals(temp,"FizzWhizz");
    }

    @Test
    public void should_return_fizzBuzz_given_number_60() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String temp = fizzBuzz.say(60);

        //then
        assertEquals(temp,"FizzBuzz");
    }

    @Test
    public void should_return_fizz_given_number_75(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String temp = fizzBuzz.say(75);
        //then
        assertEquals(temp,"Fizz");

    }
    @Test
    public void should_return_fizz_given_number_153(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String temp = fizzBuzz.say(153);
        //then
        assertEquals(temp,"153");

    }
    @Test
    public void should_return_fizz_given_number_753(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String temp = fizzBuzz.say(753);
        //then
        assertEquals(temp,"Fizz");

    }

}
