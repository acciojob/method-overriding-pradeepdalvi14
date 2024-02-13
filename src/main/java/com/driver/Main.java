package com.driver;

public class Main {
  public static void main(String[] args){
      A obj = new A();
      String ans1 = obj.meth();
      System.out.println(ans1);
      B obj1 = new B();
      String ans2 = obj1.meth();
      System.out.println(ans2);
  }
}