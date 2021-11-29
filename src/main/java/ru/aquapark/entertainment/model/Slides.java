package ru.aquapark.entertainment.model;

import jdk.jfr.DataAmount;
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
public class Slides {
     String colour;
     Integer height;
     Integer width;
     Boolean openOrClosedSlide;
     Double speed;

     public void toSlide(Person person) {
          System.out.println(person.getName() + person.getLastname() + " прокатился с горки");
     }
}
