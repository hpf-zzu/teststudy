package com.thoughtworks;

public class FizzBuzz {


    public String say(int number) {
        if(String.valueOf(number).contains("3")){
            return "Fizz";
        }

        String temp = "";
        if(number % 3 == 0){
            return "Fizz";
        }

        if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0){
            return temp + "Fizz";
        }

        return String.valueOf(number);

    }
}
