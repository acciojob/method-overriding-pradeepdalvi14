package com.driver;

public class Main {
    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
  public static void main(String[] args){
      A obj = new B();
      String ans1 = obj.meth();
      B obj1 = new B();
      String ans2 = obj1.meth();
      System.out.println(ans1);
      System.out.println(ans2);
  }
}