package com.cg.MethodOverriding;

public class Vehicle {
	void run()
	{
		System.out.println("vehicle is running");
	}
	}
	class Bike extends Vehicle{
		void run()
		{
			System.out.println("bike is running safely");
		}

		public static void main(String[] args) {
			Bike obj=new Bike();
			obj.run();
		
		}
}
