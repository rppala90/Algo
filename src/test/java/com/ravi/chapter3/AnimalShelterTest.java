package com.ravi.chapter3;

import static org.junit.Assert.assertEquals;

import com.ravi.chapter3.AnimalShelter.Cat;
import com.ravi.chapter3.AnimalShelter.Dog;
import org.junit.Test;

public class AnimalShelterTest {

  AnimalShelter as = new AnimalShelter();

  @Test
  public void shelterTest() {
    Cat c = as.new Cat();
    c.setOrder(1);

    Dog d = as.new Dog();
    d.setOrder(2);

    as.enqueue(c);
    as.enqueue(d);
    assertEquals(as.dequeuAny(), c);
    assertEquals(as.dequeuAny(), d);
  }

}
