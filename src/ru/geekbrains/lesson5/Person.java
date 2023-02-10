package ru.geekbrains.lesson5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {
  private String name;
  private String position;
  private String email;
  private String phone;
  private int salary;
  private int age;
}
