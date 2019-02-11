package com.ravi.Miscellaneous;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeEmployee implements Serializable {

  class Employee implements Serializable {
    private String firstName;

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }
  }

  public String serializeEmployee() {
    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.obj"));
      Employee e = new Employee();
      e.setFirstName("Ravi");
      oos.writeObject(e);
      oos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.obj"));
      Employee e = (Employee) ois.readObject();
      return e.getFirstName();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

}
