package main.clients;

import java.time.LocalDate;

public class Animal {
    protected final String nickName;   // final - поле задается при создании и больше нельзя поменять
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public String getNickName(){
        return this.nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Кличка",new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    private void wakeUp(){
        System.out.println("Животное " + nickName + " проснулось");

    }

    private void wakeUp(String time){
        System.out.println("Животное " + nickName + " проснулось в " + time);

    }
    private void hunt(){
        System.out.println("Животное охотится");
    }

    private void eat(){
        System.out.println("Животное ест");
    }

    private void sleep(){
        System.out.println("Животное уснуло");
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public void lifeCicle(){
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }

    @Override
    public String toString() {
        return String.format("Кличка = %s, Дата рождения = %s, Хозяин = %s, Заболевание = %s", nickName,birthDate,owner,illness);
    }
}
