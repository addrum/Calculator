import java.util.Scanner;


public class Main {
	
	private double a, b;
	private String operand;
	private Scanner scan;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		calculate();
	}
	
	public void calculate() {
		scan = new Scanner(System.in);
		System.out.println("Please enter your first number.");
		a = scan.nextDouble();
		System.out.println("Please enter your operand.");
		operand = scan.next();
		System.out.println("Please enter your second number.");
		b = scan.nextDouble();
		whichOperand(operand);
	}
	
	public void whichOperand(String operand2) {
		if (operand.equals("+")) {
			System.out.println("You're calculation is: " + a + " " + operand + " " + b + ". This equals: ");
			addition(a, b);
		} else if (operand.equals("-")) {
			System.out.println("You're calculation is: " + a + " " + operand + " " + b + ". This equals: ");
			subtraction(a, b);
		} else if (operand.equals("*") || operand.equals("x") || operand.equals("X")) {
			System.out.println("You're calculation is: " + a + " " + operand + " " + b + ". This equals: ");
			multiplication(a, b);
		} else if (operand.equals("/")) {
			System.out.println("You're calculation is: " + a + " " + operand + " " + b + ". This equals: ");
			division(a, b);
		} else if (operand.equals("%")) {
			System.out.println("You're calculation is: " + a + " " + operand + " " + b + ". This equals: ");
			modulo(a, b);
		} else {
			System.out.println("You have not entered an operand this calculator recognises. Please try again: ");
			operand = scan.next();
			whichOperand(operand);
		}
	}

	public void addition(double a, double b) {
		 double add = a + b;
		 System.out.println(add);
	}
	
	public void subtraction(double a, double b) {
		double subt = a - b;
		System.out.println(subt);
	}
	
	public void multiplication(double a, double b) {
		double mult = a * b;
		System.out.println(mult);
	}
	
	public void division(double a, double b) {
		double div = a / b;
		System.out.println(div);
	}
	
	public void modulo(double a, double b) {
		double mod = a % b;
		System.out.println(mod);
	}
	
}
