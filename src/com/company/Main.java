package com.company;

public class Main {
    static class car
    {
        public void printType(){}
        public void printColor(){}
        public void printModel(){}
        public void printAll(){}
        {
            printType();
            printColor();
            printModel();
        }
    }
    static class Nissan extends car
    {
        public void printType()
        {
            System.out.println("Тип автомобиля - легковой");
        }
        public void printColor()
        {
            System.out.println("Цвет автомобиля - розовый");
        }
        public void printModel()
        {
            System.out.println("Модель автомобиля - Nissan");
        }
    }
    static class Toyota extends Nissan
    {
        public void printColor()
        {
            System.out.println("Цвет автомобиля - голубой");
        }
        public void printModel()
        {
            System.out.println("Модель автомобиля - Toyota");
        }
    }


    public static void main(String[] args) {
        Nissan Nissan = new Nissan();
        Nissan.printAll();
        Toyota Toyota = new Toyota();
        Toyota.printAll();
    }
}

