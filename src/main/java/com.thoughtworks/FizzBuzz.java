package com.thoughtworks;

public class FizzBuzz {


    public String say(int number) {
        if(String.valueOf(number).contains("3")){
            return "Fizz";
        }

        StringBuilder temp = new StringBuilder();

        if(number % 3 == 0){
             temp.append("Fizz");
        }
        if(number % 5 == 0){
             temp.append("Buzz");
        }
        if(number % 7 == 0){
            temp.append("Whizz");
        }


        return String.valueOf(temp);

    }
}
