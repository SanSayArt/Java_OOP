package main.clients;

import java.time.LocalDate;

public class Bird extends Animal{
    public Bird(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Птичка кушает.");
    }
}
