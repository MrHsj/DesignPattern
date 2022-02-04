package com.hsj.uml.aggregation;

public class Computer {
	/**
	 * 鼠标可以和computer分离
	 */
	private Mouse mouse;
	private Moniter moniter;
	/**
	 * 显示器可以和computer分离
	 */
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
