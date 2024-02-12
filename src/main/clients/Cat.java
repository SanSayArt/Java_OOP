package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {
    // Todo в чем разница между Double и  double
    Double discount;
    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        // Сначала конструктор родительского класса, потом локальные
        this.discount = discount;
    }

    public Cat(){
        super();
        this.discount =10D;
    }

    @Override
    public void eat() {
        System.out.println("Кошечка поймала мышку и ест");
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public static void sayMeow(){
        System.out.println("Мяуу!");
    }
    @Override
    public String toString() {
        return super.toString() + ", Скидка (" + discount + ")";
    }

    @Override
    public void fly() {
        System.out.println("Кошки не умеют летать!");
    }

    @Override
    public void swim() {
        System.out.println("Кошки не любят воду и не плавают.");
    }

    @Override
    public void toGo() {
        System.out.println("Животное " + nickName + " пошло.");
    }
}
