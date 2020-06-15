package com.thoughtworks;

public class FizzBuzz {


    public String say(int number) {

        if(String.valueOf(number).contains("7")){

            String temp = "";
            if(number % 3 == 0 && number % 7 == 0) {
                temp += "FizzWhizz";
                return temp;
            }
            if(number % 7 == 0) {
                temp += "Whizz";
                return temp;
            }
            if(number % 3 == 0){
                temp += "Fizz";
                return temp;
            }
        }

        if(String.valueOf(number).contains("5")){
            String temp = "";
            if(number % 5 == 0 && number % 7 == 0) {
                temp += "BuzzWhizz";
                return temp;
            }
            if(number % 7 == 0) {
                temp += "Whizz";
                return temp;
            }
            if(number % 5 == 0){
                temp += "Buzz";
                return temp;
            }
            return String.valueOf(number);
        }


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
