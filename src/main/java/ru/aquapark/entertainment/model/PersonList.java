package ru.aquapark.entertainment.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class PersonList implements PersonListInterface {
    List<Person> personList;

    public void add(Person person) {
        personList.add(person);
    }

    public void add(Integer index, Person person) {
        personList.add(index, person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public Person get(Person person) {
        for (Person person1 : personList) {
            if (person.getName().equals(person1.getName())
                    && person.getHeight().equals(person1.getHeight())
                    && person.getAge().equals(person1.getAge())) {
                return person1;
            }
        }
        return null;
    }
 //   public List<Person> findAllByName(String name) {
 //       return personList.stream().filter(n->name.equals(name)).collect(Collectors.toList());
 //   }
}

