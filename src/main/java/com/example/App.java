package com.example;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello, Jenkins CI/CD Pipeline!");
    System.out.println("Application is running successfully!");
  }

  public String getGreeting() {
    return "Hello from Java App!";
  }

  public int add(int a, int b) {
    return a + b;
  }
}