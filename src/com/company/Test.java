package com.company;

public class Test {

    public static void main(String[] args) {

        System.out.println("Hello world!!!");
        sayHello("Ana");
        sayGoodBye("Elena");
        System.out.println("Learning Git");
        System.out.println("adding commits using Intellij");
        System.out.println("Sanja");
        System.out.println("test revert");
    }

    private int a = 40;

    private int age = 9;

    public static void sayHello(String name){
        System.out.println("Hello " +name);
    }

    public Test(int age) {
        this.age = age;
    }

// komentar edna linijabfd


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    jferjk
    ldjfli]
    rfjpod
    fijd
     */

    // TODO: To be run once BUG-458 is fixed
    public static void sayGoodBye(String name){
        // TODO: Add support for multiple users

        System.out.println("Good bye " +name);

    }

}