package ru.aquapark.entertainment.config;

import ru.aquapark.entertainment.model.Person;
import ru.aquapark.entertainment.model.PersonList;
import ru.aquapark.entertainment.model.Slides;

import java.util.ArrayList;
import java.util.Scanner;

public class RunConfig {
    public static void run(){
        PersonList personList = createPerson();
        Person person = creatPerson();
        Person resultPerson = personList.get(person);
        print(resultPerson);
    }
    private static PersonList createPerson(){
        PersonList personList = new PersonList(new ArrayList<>());
        Person person = new Person("Ivan","Ivanov","Ivanovich",
                180,80,25,"man");
        Person person1 = new Person("Petr","Petrov","Petrovich",
                190,90,30,"man");
        Person person2 = new Person("Sidor","Sidorov","Sidorovich",
                185,85,25,"man");

        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        return personList;
    }
    private static Person creatPerson(){
        return Person.builder()
                .name(new Scanner(System.in).nextLine())
                .height(new Scanner(System.in).nextInt())
                .age(new Scanner(System.in).nextInt())
                .build();
    }
    private static void print(Person person){System.out.println(person);}

}
