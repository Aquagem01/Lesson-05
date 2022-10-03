package lt.lhu.unit04.main;

public class Task03_5les {

	public static void main(String[] args) {
		int num = 1;
		int sumCub;
		while (num!=1000) {
			sumCub = sumCubChisla(num);
			if (num == sumCub) {
				System.out.println(num+" - chislo Amstronga");
			}
			num++;
		}

	}
	public static int sumCubChisla (int x) {
		int sumCub = 0;
		int y = 0;
		while (x!=0) {
			y=x%10;
			x=x/10;
			sumCub=sumCub+(y*y*y);
			//System.out.println(sumCub);
			}
	return sumCub;
	
		
	}
}

