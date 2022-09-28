package lt.lhu.unit04.main;

public class Task02 {

	public static void main(String[] args) {
		// Summa bolshego i menshego iz trex
		int a = 28;
		int b = 43;
		int c = 21;
		int min=0;
		int max=0;
		int sum=0;
		
		max = bolshee(a,b,c);
		min = menshee(a,b,c);
		sum = addition (min, max);  
		System.out.print(sum);
		

	}
	///////
	public static int bolshee(int x, int y, int z) {
		int rez = 0;
		if (x > y && x > z) {
			rez = x;
		} else if (y > x && y > z) {
			rez = y;
		} else if (z > x && z > y) {
			rez = z;
		}
		return rez;
	}
	
	
	public static int addition(int x, int z) {
		int rez = x + z;
		return rez;
	}
		
	///////
	public static int menshee(int x, int y, int z) {
		int rez = 0;
		if (x < y && x < z) {
			rez = x;
		} else if (y < x && y < z) {
			rez = y;
		} else if (z < x && z < y) {
			rez = z;
		}
		return rez;
		}

	}
