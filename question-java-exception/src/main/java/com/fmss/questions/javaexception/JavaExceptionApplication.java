package com.fmss.questions.javaexception;

import java.io.IOException;

public class JavaExceptionApplication {

    public static void main(String[] args) {
        JavaExceptionApplication exceptionCases = new JavaExceptionApplication();
        //exceptionCases.divide();
        //exceptionCases.randomException();
        //exceptionCases.catchAndFinally();
    }

    private void divide() {
        try {
            int result = 20 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException: In the catch block due to Exception = " + ae);
        } catch (Exception e) {
            System.out.println("Exception: In the catch block due to Exception = " + e);
        }

        System.out.println("End of divide method");
    }

    private void randomException() {
        double number = Math.random();

        try {
            System.out.println("Method randomException started");
            if(number > 0.5) {
                throw new RuntimeException("Runtime Error");
            } else {
                throw new IOException("IO Error");
            }
        } catch (IOException e) {
            System.out.println("IOException thrown :" + e);
        } catch (Exception e) {
            System.out.println("Exception thrown :" + e);
        }

        System.out.println("End of randomException");
    }

    private void catchAndFinally() {
        int a[] = new int[2];
        try {
            System.out.println("Access element three " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
            throw new ArrayIndexOutOfBoundsException("Array Index Hatası");
        } finally {
            System.out.println("the finally statement is executed");
        }
    }
}
