package com.driver;

public class Main {
  public static void main(String[] args){
      B obj = new B();
      String ans1 = obj.meth();
      B obj1 = new B();
      String ans2 = obj1.meth();
      System.out.println(ans1);
      System.out.println(ans2);
  }
}