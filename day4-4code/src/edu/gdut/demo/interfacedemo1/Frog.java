package edu.gdut.demo.interfacedemo1;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙会蛙泳");
    }

    public String toString() {
        return "Frog{}";
    }

}
