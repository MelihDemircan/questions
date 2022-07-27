package com.fmss.questions.javastream;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class JavaStreamApplication {

    public static void main(String[] args) {
        new JavaStreamApplication().streamFilter();
    }

    @Getter
    @AllArgsConstructor
    public class Person {

        private String name;
        private int age;

        @Override
        public String toString() {
            return "Person [name = " + name + ", age = " + age + "]";
        }

    }

    private void streamFilter() {

        List<Person> persons = Arrays.asList(
                new Person("Ahmet", 30),
                new Person("Mehmet", 20),
                new Person("Murat", 40),
                new Person("Ahmet", 18)
        );

        /**
         * TODO : resutlt1 = persons listesinden sadece Mehmet'in getirilmesi
         */
        Person result1 = null;

        System.out.println(result1);

        /**
         * TODO :  resutlt2 = persons listesinden yaşı(age) 35 den küçük olanların getirilmesi
         */
        List<Person> result2 = null;

        System.out.println(result2);
    }

}
