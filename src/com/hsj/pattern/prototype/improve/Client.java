package com.hsj.pattern.prototype.improve;


public class Client {

    public static void main(String[] args) {
        //传统的方法
        Sheep sheep = new Sheep("tom", 1, "白色");

        try {
            Sheep sheep2 =  sheep.clone();
            Sheep sheep3 =  sheep.clone();
            Sheep sheep4 =  sheep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}