package ru.aquapark.entertainment.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Objects;
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Person {
    String name, lastname, middleName;
    Integer height, weight, age;
    String sex;
    public void toPerson(Person person){
        System.out.println( person .getName() + person.getLastname() + " прокатился с горки");
    }
}
