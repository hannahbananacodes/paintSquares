package edu.tridenttech.cpt167.holmes.program1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		final double PINT_AREA = 20;
		final double PAINT_COST = 9.75;
		double largeSquareLength;
		double smallSquareLength;
		String largeSquareColor;
		String smallSquareColor;
		double largeSquareArea;
		double smallSquareArea;
		double largeSquarePainted;
		double largeSquarePints;
		double largeSquareCost;
		double smallSquarePints;
		double smallSquareCost;
		double totalPaint;
		double totalCost;
		
		
		Scanner inputLargeColor = new Scanner(System.in);
		System.out.println("What is the color of the larger square?");
		largeSquareColor = inputLargeColor.nextLine();
		
		Scanner inputSmallColor = new Scanner(System.in);
		System.out.println("What is the color of the smaller square?");
		smallSquareColor = inputSmallColor.nextLine();
		
		Scanner inputLargeLength = new Scanner(System.in);
		System.out.println("What is the length of the sides of the larger square?");
		largeSquareLength = inputLargeLength.nextDouble();
		
		Scanner inputSmallLength = new Scanner(System.in);
		System.out.println("What is the length of the sides of the smaller square?");
		smallSquareLength = inputSmallLength.nextDouble();
		
		largeSquareArea = largeSquareLength*largeSquareLength;
		smallSquareArea = smallSquareLength*smallSquareLength;
		largeSquarePainted = largeSquareArea-smallSquareArea;
		
		largeSquarePints = largeSquarePainted/PINT_AREA;
		largeSquareCost = largeSquarePints*PAINT_COST;
		
		smallSquarePints = smallSquareArea/PINT_AREA;
		smallSquareCost = smallSquarePints*PAINT_COST;
		
		totalPaint = largeSquarePints+smallSquarePints;
		totalCost = largeSquareCost+smallSquareCost;
		
	
		System.out.println("The total area of the larger square is " + largeSquareArea + ".");
		System.out.println("The total area of the smaller square is " + smallSquareArea + ".");
		System.out.println("You will need " + largeSquarePints + " pints of " + largeSquareColor + " paint.");
		System.out.println("This will cost $" + largeSquareCost + ".");
		System.out.println("You will need " + smallSquarePints + " pints of " + smallSquareColor + " paint.");
		System.out.println("This will cost $" + smallSquareCost + ".");
		System.out.println("The total pints of paint needed will be " + totalPaint + ".");
		System.out.println("The total cost of all paint will be $" + totalCost + ".");
		
		inputLargeColor.close();
		inputSmallColor.close();
		inputLargeLength.close();
		inputSmallLength.close();
		
	}

}
