package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Playing Obstsong:");
        obstsong();
    }
    public static void obstsong(){
        mango();
        ananas();
        kiwi();
    }
    public static void mango(){
        System.out.println("Mango Mango Mango Mango Mango Mango Mango Mango Kirsch.");
    }
    public static void kiwi(){
        System.out.println("Kiwi Kiwi Kiwi Kirsch.");
    }
    public static void ananas(){
        System.out.println("Ananas Banane Ananas Kirsch.");
    }
}