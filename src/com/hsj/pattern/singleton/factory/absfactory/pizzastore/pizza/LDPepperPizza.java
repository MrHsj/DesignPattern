package com.hsj.pattern.singleton.factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给伦敦胡椒披萨准备原材料 ");
    }

}
