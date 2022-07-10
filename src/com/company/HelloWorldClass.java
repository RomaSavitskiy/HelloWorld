package com.company;

import variables.VariablesClass;

public class HelloWorldClass {

  public int x = 10;
  private String s = "Hi world";

  public static void main(String[] args) {
    System.out.println("Hello world!");

    VariablesClass Variable = new VariablesClass();

    Variable.FindIntValue();
    Variable.FindFloatValue();
    Variable.FindCharValue();
  }
}
