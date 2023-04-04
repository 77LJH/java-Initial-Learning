package edu.gdut.demo.interfacedemo1;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗会狗刨式游泳");
    }

    public String toString() {
        return "Dog{}";
    }

}
