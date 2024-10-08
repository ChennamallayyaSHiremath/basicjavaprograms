package com.chenna.basic.interfaceclass;

public class Laptop implements Computer{
	
	public static void main(String[] args) {
		
		//Computer cmp=new Laptop();
		
		//cmp.windowsLaptop();
		
		//cmp.linuxLaptop();
		
		//cmp.macLaptop();
	}

	@Override
	public void windowsLaptop() {
		// TODO Auto-generated method stub
		System.out.println("Windows laptop interface method Windows");
	}

	@Override
	public void linuxLaptop() {
		// TODO Auto-generated method stub
		System.out.println("Windows laptop interface method Linux");
	}

	@Override
	public void macLaptop() {
		// TODO Auto-generated method stub
		System.out.println("Windows laptop interface method MAC");
	}


}
