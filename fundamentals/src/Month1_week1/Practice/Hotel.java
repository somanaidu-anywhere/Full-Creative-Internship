package com.test.orders;

import java.util.HashMap;

public class Hotel {
	private String name;
	private HashMap<String,Double> menu;
	public Hotel(String name, HashMap<String, Double> menu) {
		super();
		this.name = name;
		this.menu = menu;
	}
	public Hotel() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, Double> getMenu() {
		return menu;
	}
	public void setMenu(HashMap<String, Double> menu) {
		this.menu = menu;
	}
	public void serve(String item, int count)
	{
		System.out.println("Hotel Started to Serve "+ item);
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", menu=" + menu + "]";
	}
	public void showMenu()
	{
		for(String str: menu.keySet()) {
			System.out.println(str+"\t"+menu.get(str));
		}
	}
}
