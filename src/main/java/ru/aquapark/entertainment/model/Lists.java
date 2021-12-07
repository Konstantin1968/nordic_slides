package ru.aquapark.entertainment.model;

public interface Lists<Model,Number> {
     void add(Model model);
     void  add (Number index,Model model);
      void remove(Model model);
     Model get(Model model);


}
