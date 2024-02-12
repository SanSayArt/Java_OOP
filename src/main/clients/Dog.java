package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void fly() {
        System.out.println("Собаки не умеют летать!");
    }

    @Override
    public void toGo() {
        System.out.println("Животное " + nickName + " пошло.");
    }
}
