package com.hsj.pattern.singleton.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println(" 制作伦敦奶酪披萨 准备原材料 ");
	}

}
