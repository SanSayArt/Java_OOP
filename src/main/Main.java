package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик",
                new Owner("Сергей Валерьевич Иванов"),
                LocalDate.of(2011,10,12),
                new Illness("Болезнь"));  // Создаем экземпляр класса

        System.out.println(cat.getNickName());
        //cat.nickName = "Барсик";
        System.out.println(cat.getNickName());
        //cat.setIllness(new Illness(null));
        cat.lifeCicle();
        System.out.println(cat.getType());
        Animal testAnimal = new Animal();
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
    }

}