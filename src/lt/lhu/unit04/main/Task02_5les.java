package lt.lhu.unit04.main;

import java.math.BigInteger;

public class Task02_5les {

	public static void main(String[] args) {
		//Где-то это подглядел: ...но если текст переводить в BigInteger и потом из него текст назад в String, то работает, а с цифрами какая-то ерунда происходит
		/*String a = new String("11241498259000994994");
		String b = new String("982358979827879025895");
		BigInteger aaa = new BigInteger(a.getBytes());
		System.out.println(aaa);
		BigInteger bbb = new BigInteger(b.getBytes());
		BigInteger ccc = aaa.add(bbb);
		System.out.println(new String(ccc.toByteArray()));*/
		
		String firstBig = "90779840978652897235978";// в примере написание String firstBig = new String("112414982590009949985684584584"); интересно почему в таком виде. Попробую пока по старинке
		String secondBig = "100501756859494030349868686";
		int loop1 = 0; //объявляем и инициализируем переменные (в нашем случае, которые будут отсчитывать количество цифр в числе) до цикла - т.к. в цикле компил нам этого сделать не даст
		int loop2 = 0;
		StringBuilder sum = new StringBuilder(""); //какой-то новый объект который позволяет прилеплять всякие знаки друг к другу через append (в String так сделать не даёт). Непонятно пока почему в скобках кавычки. Типа родили строку в которой пока ничего нет?
		int perenosdesyatka = 0; // опять же тут -  так как в цикле не даёт
		for (loop1=firstBig.length()-1,/*присваиваем loop1 последнюю цифру первого числа*/loop2=secondBig.length()-1/*со вторым числом аналогично*/;loop1>=0||loop2>=0/*условиеЖ пока какое либо из лупов больше нуля*/;loop1--, loop2--) {
			int lastNumb1 = 0; //объявляем и инициализируем переменную в которую будет отсчипывать последнюю цифру от нашего первого числа
			if (loop1>=0) {
				lastNumb1 = Integer.parseInt(""+firstBig.charAt(loop1));}//задаем значение переменной loop1, так как она у нас интовая, то нужно привести стринговую к инту, потом через charAt и loop1? нами ранее задан в цикле как .length()-1(т.е. последний символ большого первого числа) отгрызаем последний символ из строки и превращаем его в инт
			int lastNumb2 = 0; // тут аналогично со вторым числом
			if (loop2>=0) {
				lastNumb2 = Integer.parseInt(""/*почему строка тут?*/+secondBig.charAt(loop2));}
			int slogenie = lastNumb1 + lastNumb2 + perenosdesyatka; // в первом витке переноса десятка не будет, так как это наше первое сложение
			double d = Math.floor(slogenie/10); //приходится брать дабл, так как Math c интами не работает. floor - наибольшее целое, которое меньше или равно (arg)
			//строчка выше нам нужна в то случае когда последние цифры в сумме дадут больше 10 и если так случится, то превышение, т.е. у нас 1 (она же десяток перенесется и на следующем витке прибавиться к slogenie
			//если цифры сложаться и будут меньше 10, то d  у нас будет равно 0
			perenosdesyatka = (int)d; // тут вычисленное d приводим к инту, т.к. основные вычисления у нас в нем
			int sum2 = slogenie%10; //это опять же для того если сложение последних цифр выдаст нам цифру больше 10
			sum.append(sum2); //добавляем (не прибавляем, а прилипляем) вычисленный нами символ (результат сложения последних цифр без десятков) к фактически бесконечной строке StringBuilder
		}
		System.out.print(sum.reverse()); //когда цикл завершиться сложение будет завершено, но в зеркальном порядке. Для того чтобы нам все цифры перевернуть понадобиться reverse. 
	//На этом этапе я таки код сам бы не в жисть не написал, ну хоть вник ))) 
	}

}
