package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task01_5les {

	public static void main(String[] args) {
		double a,b,c;
		double nod;
		double nodthird;
		a = inputConsole("Input first number: " );
		b = inputConsole("Input second number: " );
		c = inputConsole("Input third number: " );
		nod = naibolshiObshiyDelitel (a,b);
		nodthird = naibolshiObshiyDelitel (nod,c);
		//System.out.println("For first number " +a+ " and second number " +b+" NOD raven:\t" + nod);
		//System.out.println("For first number " +a+ " and second number " +b+ " and third number "+c+ " NOD raven:\t" + nodthird);
		System.out.println(nodthird ==1? "Chisla vzaimno prosti": "Chisla ne vzaimno prosti");
	}
	public static double inputConsole(String mess) {
		Scanner sc = new Scanner(System.in);
		System.out.print(mess);
		while (!sc.hasNextDouble()) {
		String err = sc.nextLine();
		System.out.print("Uncorrect." +mess);
		}
		double inp = sc.nextDouble();
		return inp;
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
	
	}
	
