package com.ravi.chapter3;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {

  Queue<Cat> cats = new LinkedList<Cat>();
  Queue<Dog> dogs = new LinkedList<Dog>();

  public void enqueue(Animal animal) {
    if(animal instanceof Cat) {
      cats.add((Cat)animal);
    } else if(animal instanceof Dog) {
      dogs.add((Dog) animal);
    }
  }

  public Cat dequeueCat() {
    return cats.remove();
  }

  public Dog dequeueDog() {
    return dogs.remove();
  }

  public Animal dequeuAny() {
    if(dogs.isEmpty()) return dequeueCat();
    if(cats.isEmpty()) return dequeueDog();
    Dog dog = dogs.peek();
    Cat cat = cats.peek();
    if(dog.getOrder() < cat.getOrder()) {
      return dequeueDog();
    }
    return dequeueCat();
  }


    public abstract class Animal {
      private int order;

      public int getOrder() { return order; }
      public void setOrder(int order) { this.order = order; }
    }

    public class Cat extends Animal {

    }

    public class Dog extends Animal {

    }
}
