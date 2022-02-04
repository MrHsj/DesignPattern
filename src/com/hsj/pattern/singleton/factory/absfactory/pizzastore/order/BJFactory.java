package com.hsj.pattern.singleton.factory.absfactory.pizzastore.order;

import com.hsj.pattern.singleton.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.hsj.pattern.singleton.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.hsj.pattern.singleton.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if(orderType.equals("pebber")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
