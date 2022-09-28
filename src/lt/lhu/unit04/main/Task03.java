package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		int a,b;
		a = inputConsole("Input first number: " );
		b = inputConsole("Input second number: " );
		int an = numberofdigits (a);
		int bn = numberofdigits (b);
		String viv = vivodTexta (a,b,an,bn);
		System.out.print(viv);

	}
	public static int inputConsole (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
		String err = sc.nextLine();
		System.out.print("Uncorrect." +message);}
		int input = sc.nextInt();
		return input;
	}
	
	public static int numberofdigits (int x) {
		int sch = 1;
		while (x/10!=0) {
			sch++;
			x=x/10;
			//System.out.println(" "+x); //самопроверочка
		}
		return sch;
	}
	public static String vivodTexta(int a, int b, int an, int bn) {
		String rez = "a";//пристал ко мне чтоб я инициализировал переменную, поэтому а)
		if (an>bn) {
			rez = "V pervom chisle bolshe cifr";
		}else if(an<bn){
			rez = "Vo vtorom chisle bolshe cifr";
		}else if(an==bn) {
			rez = "Kolichestvo cifr v chislax ravno";
		}
		String viv = "Vvedennoe pervoe chislo: "+a+"\nVvedennoe vtoroe chislo: "+b+"\n"+rez;
				return viv;
	}
}
