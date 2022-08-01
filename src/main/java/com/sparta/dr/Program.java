package com.sparta.dr;

//Program.java
// Access modifiers - private, public, protected (accessible from this class and any class that inherits it, default (means read by any of its children or anything within the same package
// method -
public class Program { // nouns - capital letter, WeUseCamelCase
    public static void main(String[] args) { //lowercase, verbs
        // statically typed languages (At compile time checks that the assigned type is being used correctly), Strongly typed language (have to define a type)

        int timeOfDay = 21; //camelcase, nouns
        System.out.println(Greeter.getGreeting(timeOfDay));

    }
}
