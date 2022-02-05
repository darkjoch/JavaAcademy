package com.globant.miguel.exercise1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String choice;

        MusicPlayerBuilder builder = new MusicPlayerBuilder();
        builder.setStorage(Storage.SIXTEEN_GB);
        System.out.println(builder);
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our music store");
        System.out.println("Please write a color: Green or Blue");
        choice = in.nextLine();

        //Una forma de ocultar la logica del builder es que en vez de el metodo setColor podrías tener directamente el método withGreenColor
        //y withBlueColor y asi el builder se encarga de hacer set del enum correspondiente. De esta manera quedan ocultos los enums para la clase App (el cliente)
        //lo mismo para el storage y batteryLife
        if(choice.equals("Green"))
            builder.setColor(Color.GREEN);
        //builder.withGreenColor();
        
        else if (choice.equals("Blue"))
            builder.setColor(Color.BLUE);
        //builder.withBlueColor();
        else
            System.out.println("That color is not available");

        System.out.println("Please write the capacity in 8GB or 16GB");
        choice = in.nextLine();
        if(choice.equals("8GB"))
            builder.setStorage(Storage.EIGHT_GB);
        else if (choice.equals("16GB"))
            builder.setStorage(Storage.SIXTEEN_GB);
        else
            System.out.println("That capacity is not available");

        System.out.println("Finally write the battery life in hours 5 or 8");
        choice = in.nextLine();
        if(choice.equals("5"))
            builder.setBattery(Battery.FIVE_HOURS);
        else if (choice.equals("8"))
            builder.setBattery(Battery.EIGHT_HOURS);
        else
            System.out.println("That capacity is not available");

        System.out.println(builder);
    }
}
