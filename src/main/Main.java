package main;

import main.clients.*;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*
        Animal cat = new Cat("Барсик",
                new Owner("Сергей Валерьевич Иванов"),
                LocalDate.of(2011,10,12),
                new Illness("Болезнь"), 10D);  // Создаем экземпляр класса

        System.out.println(cat.getNickName());
        //cat.nickName = "Барсик";
        System.out.println(cat.getNickName());
        //cat.setIllness(new Illness(null));
        cat.lifeCicle();
        System.out.println(cat.getType());
        Animal testAnimal = new Cat();
        System.out.println(testAnimal.getNickName());
        System.out.println(cat);

        Animal catty = new Cat();
        Dog goodBoy = new Dog();
        System.out.println(goodBoy.getType());
        System.out.println(catty.getType());
        System.out.println(catty);
        Cat.sayMeow();

        List<Animal> animalsList = new ArrayList<Animal>();
        animalsList.add(catty);
        animalsList.add(goodBoy);
        animalsList.add(cat);

        int x = 0;
        for (Animal animal : animalsList){
            x++;
            System.out.println(x + " " +animal);
        }
    //----------------------- HomeWork_1 ------------------------------------------------------
        {
            System.out.println("----------------------------------------------------------------------------");
            Cat catt = new Cat("Барсик",
                    new Owner("Сергей Валерьевич Иванов"),
                    LocalDate.of(2011, 10, 12),
                    new Illness("Болезнь"), 5D);
            System.out.println(catt);
            catt.toGo();
            catt.fly();
            catt.swim();

            Dog dog = new Dog("Барбос",
                    new Owner("Иван Валерьевич"),
                    LocalDate.of(2015, 1, 25),
                    new Illness("Болят лапы"));
            System.out.println(dog);
            dog.toGo();
            dog.fly();
            dog.swim();

            Bird duck = new Bird(
                    "Duckky",
                    new Owner("Петр Иванович"),
                    LocalDate.of(2012, 5, 6),
                    new Illness("Болит крыло"));
            System.out.println(duck);
            duck.fly();
            duck.swim();
            duck.toGo();

            Fish guppy = new Fish(
                    "Гуппи",
                    new Owner("Сергей Владимирович"),
                    LocalDate.of(2020, 9, 30),
                    new Illness("Поврежден плавник"));
            System.out.println(guppy);
            guppy.fly();
            guppy.swim();
            guppy.toGo();
        }

 */
        List<Goable> list = new ArrayList<>();

        Cat cat_1 = new Cat();
        Dog dog = new Dog();
        list.add(cat_1);
        list.add(dog);
        System.out.println(list);

        Animal an = new Animal() {  // Анонимный класс
            @Override
            public void eat() {

            }
        };
    }

}