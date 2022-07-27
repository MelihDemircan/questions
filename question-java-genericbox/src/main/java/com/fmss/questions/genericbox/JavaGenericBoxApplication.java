package com.fmss.questions.genericbox;

public class JavaGenericBoxApplication<T> {

    T tValue;

    public void set(T value) {
        this.tValue = value;
    }

    public T get() {
        return tValue;
    }

    public <U extends Number> void inspect(U uValue) {
        System.out.println("tValue " + tValue + " " + tValue.getClass().getName());
        System.out.println("uValue " + uValue + " " + uValue.getClass().getName());
    }

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        JavaGenericBoxApplication<String> stringBox = new JavaGenericBoxApplication<>();
        stringBox.set("GenericBoxString");
        stringBox.inspect(12);
        System.out.println("-------------------------------------------");
        stringBox.inspect(12.1);
        System.out.println("-------------------------------------------");

        JavaGenericBoxApplication<Integer> integerBox = new JavaGenericBoxApplication<>();
        integerBox.set(100);
        integerBox.inspect(13);
        System.out.println("-------------------------------------------");

    }
}
