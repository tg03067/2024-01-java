package com.green.day16.ch7;

import java.util.Arrays;

//생성자의 파라미터로 보내는 값을 아규먼트라고 부른다.
//한국말로 인자, 인수라고 부른다.
public class PolyArgumentTest {
    public static void main(String[] args){
//        //문제. 1
//        Product p = new Product(1000); //price = 1000, bonusPoint = 100;
//        System.out.printf("p.price: %s, p.bonusPoint: %s\n", p.getPrice(), p.getBonusPoint());
//        System.out.println(p.toString()); //price = 1000, bonusPoint = 100;
//        //println은 객체의 toString을 활용해서 출력한다.
//        Product p2 = new Product(500); //price = 500, bonusPoint = 50;
//        System.out.printf("p2.price: %s, p2.bonusPoint: %s\n", p2.getPrice(), p2.getBonusPoint());
//        System.out.println(p2); //price = 500, bonusPoint = 50;
//
//        //문제 2
//        Tv tv = new Tv();
//        System.out.println(tv); //Tv price: 100, bonusPoint: 10
//        Computer computer = new Computer();
//        System.out.println(computer);
//        Sofa sofa = new Sofa();
//        System.out.println(sofa);
        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());
        buyer.showMeTheMoney(); //haveMoney: ?, haveBonusPoint: ?
    }
}
class Buyer {
    private int haveMoney;
    private int haveBonusPoint;
    Buyer(int haveMoney){
        this.haveMoney = haveMoney;
    }
    void buy(Product product){
        this.haveMoney -= product.getPrice();
        this.haveBonusPoint += product.getBonusPoint();
        System.out.printf("%s을(를) 구매하셧습니다. \n", product);
    }
    public String toString(){
        return "Buyer.Money: " + this.haveMoney + ", Buyer.Point: " + this.haveBonusPoint;
    }
    void showMeTheMoney(){
        System.out.printf("haveMoney: %,d, haveBonusPoint: %,d\n", this.haveMoney, this.haveBonusPoint);
    }
    void setHaveMoeny(int haveMoney){
        this.haveMoney = haveMoney;
    }
    int getHaveMoney(){
        return this.haveMoney;
    }
    int getHaveBonusPoint() {
        return this.haveBonusPoint;
    }
}
class Sofa extends Product {
    Sofa(){
        super(80);
    }
    public String toString(){
        return "Sofa " + super.toString();
    }
}
class Computer extends Product{
    Computer(){
        super(200);
    }

    public String toString(){
        return "Computer " + super.toString();
    }
}
class Tv extends Product {
    Tv(){
        super(100);
    }
    public String toString(){
        return "TV " + super.toString();
    }
}
abstract class Product {
    private final int price;
    private final int bonusPoint;


    Product(int price){
        this.price = price;
        this.bonusPoint = price / 10;
    }

    @Override
    public String toString(){
//        return "price: " + this.price + ", bonusPoint: " + this.bonusPoint;
        return String.format("price: %,d, bonusPoint: %,d", this.price, this.bonusPoint);
    }

    //setter 네이밍은 멤버필드만 이용할 수 있음.
    //getter 네이밍도 멤버필드, 전역변수만 이용할 수 있음.
//    public void setPrice(int price){
//        this.price = price;
//        this.bonusPoint = price / 10;
//    }

    public int getPrice(){
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }

//    void printPr(int price){
//        System.out.printf("price: %s, Product: %s\n", price, price / 10);
//    }
}