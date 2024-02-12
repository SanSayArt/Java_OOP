package main.clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Рыба ест.");
    }

    @Override
    public void fly() {
        System.out.println("Рыбы не умеют летать!");
    }

    //@Override
    public void toGo() {
        System.out.println("Рыбы не умеют ходить.");
    }
}
