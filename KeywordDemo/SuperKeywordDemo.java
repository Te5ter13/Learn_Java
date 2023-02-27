/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeywordDemo;

/**
 *
 * @author tester13
 */
class Animal {
  String color;
  Animal(String c) {
    this.color = c;
  }
  void printColor() {
    System.out.println("Color: " + this.color);
  }
}

class Dog extends Animal {
  String breed;
  Dog(String c, String b) {
    super(c);
    this.breed = b;
  }
  void printBreed() {
    System.out.println("Breed: " + this.breed);
  }
  void printColorAndBreed() {
    super.printColor();
    this.printBreed();
  }
}

public class SuperKeywordDemo {
  public static void main(String[] args) {
    Dog d = new Dog("black", "labrador");
    d.printColorAndBreed();
  }
}
