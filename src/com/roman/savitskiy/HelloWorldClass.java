package com.roman.savitskiy;

import com.roman.savitskiy.variables.VariablesClass;

public class HelloWorldClass {

  public int x = 10;
  private String s = "Hi world";



  public static void main(String[] args) {


    VariablesClass Variable = new VariablesClass();

    Variable.FindIntValue();
    Variable.FindFloatValue();
    Variable.FindCharValue();
    System.out.println("Hi");
    HelloWorldClass.proverka();
  }

  public static void proverka()
  {
    System.out.println("It's work");
  }
}
