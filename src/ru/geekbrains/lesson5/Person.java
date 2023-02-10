package ru.geekbrains.lesson5;

public class Person {
  private String name;
  private String position;
  private String email;
  private String phone;
  private int salary;
  private int age;

  public int getAge() {
    return age;
  }

  public Person(String name, String position, String email, String phone, int salary, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
  }

  public void printInfo() {
    System.out.printf("""
      ФИО: %s
      Должность: %s
      E-mail: %s
      Телефон: %s
      Зарплата: %d
      Возраст: %d
      """, name, position, email, phone, salary, age);
  }
}
