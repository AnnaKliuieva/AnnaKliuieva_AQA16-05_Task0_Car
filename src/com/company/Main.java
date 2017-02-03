package com.company;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[11];
        cars[0] = new Car("VM9845i", "BMW", "3 Series", 2012, "white", 27300, "АХ 5567 ХА");
        cars[1] = new Car("LR8652L", "BMW", "3 Series", 2013, "red", 33900, "АХ 6644 ХА");
        cars[2] = new Car("VK29837502L", "BMW", "5 Series", 2004, "blue", 12600, "АХ 1111 ХА");
        cars[3] = new Car("LK2037G", "Audi", "A6 AVANT", 2001, "blue", 4700, "АХ 9078 ХА");
        cars[4] = new Car("FG93287YG", "Audi", "A6 QUADRO", 2005, "black", 15000, "АХ 6723 ХЕ");
        cars[5] = new Car("KH375226I", "Dacia", "Logan", 2008, "blue", 4600, "АХ 8722 ХМ");
        cars[6] = new Car("PK8374J", "Daewoo", "Lanos", 2007, "blue", 4100, "АХ 9879 ХАК");
        cars[7] = new Car("KH93752O", "Dacia", "Solenza", 2003, "white", 1350, "АХ 0932 УХ");
        cars[8] = new Car("TY39852l", "Peugeot", "Boxer", 2011, "white", 9998, "АХ 9834 ЕС");
        cars[9] = new Car("KH3864I", "Peugeot", "3008", 2012, "brown", 18000, "АХ 9732 АС");
        cars[10] = new Car("GF3985K", "Subaru", "Legacy", 1990, "gray", 3500, "АХ 9732 АС");

        // список авто заданной марки
        System.out.println("Автомобили заданной марки:");
        for (Car curCar : cars ) {
            curCar.filtrCar("Lada");
        }
        System.out.println("Автомобили заданной марки:");
        for (Car curCar : cars ) {
            curCar.filtrCar("BMW");
        }
        // список автомобилей заданной модели, которые эксплуатируются больше n лет
        System.out.println("Автомобили заданной модели, которые эксплуатируються больше n лет(года)");
        for (Car curCar: cars) {
            curCar.filtrCar("3 Series", 3,2017);
        }

        // список автомобилей заданного года выпуска, цена которых больше указанной
        System.out.println("Автомобили указанного года выпуска стоимостью свыше заданной цены");
        for (Car curCar: cars) {
            curCar.filtrCar(2012, 15000);
        }

    }
}
