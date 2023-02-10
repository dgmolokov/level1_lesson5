package ru.geekbrains.lesson5;

public class Main {
  public static void main(String[] args) {
    var persArray = new Person[5];
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    persArray[1] = new Person("Semyonov Semyon", "Sysadmin", "semyon@mailbox.com", "89611234", 30000, 28);
    persArray[2] = new Person("Dmitriev Dima", "Director", "diman@mailbox.com", "891236326", 100000, 41);
    persArray[3] = new Person("Vasilyev Vasiliy", "QA", "vasya@mailbox.com", "8912361236", 25000, 25);
    persArray[4] = new Person("San Sanych", "CTO", "sanych@mailbox.com", "8912623666", 80000, 46);
    for (Person person : persArray) {
      if (person.getAge() >= 40) {
        System.out.println(person.toString());;
      }
    }
  }
}
