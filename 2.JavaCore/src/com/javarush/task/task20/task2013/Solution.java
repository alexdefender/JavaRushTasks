package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {}

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            mother = (Person)in.readObject();
            father = (Person)in.readObject();
            firstName = (String)in.readObject();
            lastName = (String)in.readObject();
            age = in.readInt();
            children = (List)in.readObject();
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", mother=" + mother +
                    ", father=" + father +
                    ", children=" + children +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Name", "Second Name", 10);
        Person person2 = new Person("Name2", "Second Name2", 12);
        OutputStream fileOutputStream = new FileOutputStream("4.txt");
        InputStream fileInputStream = new FileInputStream("4.txt");
        ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);
        objectOutput.writeObject(person);
        objectOutput.writeObject(person2);
        System.out.println(person.toString());
        System.out.println(person2.toString());
        objectOutput.flush();
        objectOutput.close();
        fileOutputStream.close();

        System.out.println("After ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        Person person3 = new Person();
        person3 = (Person) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();
        System.out.println(person1.toString());
        System.out.println(person3.toString());
    }
}
