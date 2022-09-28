package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		double a,b;
		double nok;
		double nod;
		a = inputConsole1("Input first number: " );
		b = inputConsole1("Input second number: " );
		nod = naibolshiObshiyDelitel (a,b);
		nok = naimensheeObsheeKratnoe (a,b,nod);
		System.out.println("For number " +a+ " and number " +b+" NOD raven:\t" + nod);
		System.out.print("For number " +a+ " and number " +b+" NOK raven:\t" + nok);
	}
	public static double naibolshiObshiyDelitel (double min, double max) {
		if (min>max) {
			double temp;
			temp = max;
			max = min;
			min = temp;
			}
		while (max%min!=0) {
			min  = max%min;
		}
		return min;
	}
	public static double naimensheeObsheeKratnoe (double x, double z, double y) {
		double nok;
		nok = (Math.abs(x*z))/y;
		return nok;
	}
	public static double inputConsole1(String mess) {
		Scanner sc = new Scanner(System.in);
		System.out.print(mess);
		while (!sc.hasNextDouble()) {
		String err = sc.nextLine();
		System.out.print("Uncorrect." +mess);
		}
		double inp = sc.nextDouble();
		return inp;
	}
}
