package com.hsj.pattern.singleton.factory.absfactory.pizzastore.order;

import com.hsj.pattern.singleton.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.hsj.pattern.singleton.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.hsj.pattern.singleton.factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if(orderType.equals("pebber")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
