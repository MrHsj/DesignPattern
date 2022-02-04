package com.hsj.pattern.singleton.factory.absfactory.pizzastore.order;

import com.hsj.pattern.singleton.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {

    Pizza createPizza(String orderType);
}
