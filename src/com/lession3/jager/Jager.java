package com.lession3.jager;
public class Jager {
    private String launched = "December 15, 2015";
    private String name = "";
    private String mark = "Mark - 1";
    private String status = "Destroyed";
    private String origin = "USA";
    private double height = 77.7;
    private double weight = 7.775;
    private int speed = 2;
    private int strength = 7;
    private int armor = 6;
    private int kaijuKilled = 2;

    public static void main(String[] argc) {
        Jager romeoBlue = new Jager();
        System.out.print("Name: ");
        System.out.println(romeoBlue.name = "Romeo Blue");
        System.out.println("Launched: " + romeoBlue.launched);
        System.out.println("Mark: " + romeoBlue.mark);
        System.out.println("Origin: " + romeoBlue.origin);
        System.out.println("Height: " + romeoBlue.height);
        System.out.println("Weight: " + romeoBlue.weight);
        System.out.println("Speed: " + romeoBlue.speed);
        System.out.println("Strength: " + romeoBlue.strength);
        System.out.println("Armor: " + romeoBlue.armor);
        System.out.println("Kaiju Killed: " + romeoBlue.kaijuKilled);
        System.out.println("Status: " + romeoBlue.status);
    }
}
