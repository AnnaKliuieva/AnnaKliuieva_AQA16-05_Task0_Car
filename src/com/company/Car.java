package com.company;

/**
 * Created by Anna on 03.02.2017.
 */
class Car {
    /*
    Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
    Создать массив объектов. Вывести:
    a)  список автомобилей заданной марки;
    b)  список автомобилей заданной модели, которые эксплуатируются больше n лет;
    c)  список автомобилей заданного года выпуска, цена которых больше указанной.
     */

    private String id;
    private String carMake;
    private String carModel;
    private int year;
    private String color;
    private double price;
    private String registrationNumb;


    public Car(String id, String carMake, String carModel, int year, String color, double price, String registrationNumb) {
        this.id = id;
        this.carMake = carMake;
        this.carModel = carModel;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumb = registrationNumb;
    }

    void filtrCar (String carMake){
        if (this.getCarMake().equals(carMake)){
            System.out.println(this.toString());
        }
    }

    void filtrCar (String carModel, int operationPeriod, int curYear){
        if (this.getCarModel().equals(carModel) && (curYear - this.getYear()) > operationPeriod){
            System.out.println(this.toString());
        }
    }

    void filtrCar (int year, double price){
        if (this.getYear() == year && this.getPrice() > price){
            System.out.println(this.toString());
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumb='" + registrationNumb + '\'' +
                '}';
    }

    public String getRegistrationNumb() {
        return registrationNumb;
    }

    public void setRegistrationNumb(String registrationNumb) {
        this.registrationNumb = registrationNumb;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
