package hw4;

import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
//	• 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int array[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.print("平均值為" + sum / array.length + "，");
		System.out.print("大於平均值的元素有：");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > (sum / array.length)) {
				System.out.print(array[i]);
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		System.out.println("------------------------");
//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//		法一：
		String s = "Hello World";
//		System.out.println(s.length()); //藉此方法得知字串長度
		System.out.print(s.charAt(10));
		System.out.print(s.charAt(9));
		System.out.print(s.charAt(8));
		System.out.print(s.charAt(7));
		System.out.print(s.charAt(6));
		System.out.print(s.charAt(5));
		System.out.print(s.charAt(4));
		System.out.print(s.charAt(3));
		System.out.print(s.charAt(2));
		System.out.print(s.charAt(1));
		System.out.println(s.charAt(0));
//		法二：
		StringBuffer s1 = new StringBuffer("Hello World");
		s1.reverse();
		System.out.println(s1.toString());
//		法三：
		System.out.println(new StringBuffer("Hello World").reverse());
		System.out.println("------------------------");
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
		for (String value : planets) {
			for (int j = 0; j < value.length(); j++) {
				switch (value.charAt(j)) {
				case 97:
					counta++;
					break;
				case 101:
					counte++;
					break;
				case 105:
					counti++;
					break;
				case 111:
					counto++;
					break;
				case 107:
					countu++;
					break;
				}

			}

		}
		System.out.println("a有" + counta + "個，" + "e有" + counte + "個，" + "i有" + counti + "個，" + "o有" + counto + "個，"
				+ "u有" + countu + "個。");
		System.out.println("------------------------");
//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//		並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」

		int[][] cash = { 
				{ 25, 32, 8, 19, 27 }, 
				{ 2500, 800, 500, 1000, 1200 } 
				};
		int countcash = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("小華...請問你想借多少$$?");		
		if (sc.hasNextInt()) {
			int i = sc.nextInt();
			System.out.print("有錢可借的員工編號:");
			for (int a = 0; a < cash[1].length; a++) {
					if(i <= cash[1][a]) {
						countcash ++;
						System.out.print(cash[0][a]+" ");
					}
			}
			System.out.println("，共"+countcash+"人。");
		}
		System.out.println("------------------------");
//		• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		int countdays = 0;
		int[][] arraydays = {
				{0,1,2,3,4,5,6,7,8,9,10,11,12},
				{0,31,28,31,30,31,30,31,31,30,31,30,31}
		};
		int[][] arraydaysleap = {
				{0,1,2,3,4,5,6,7,8,9,10,11,12},
				{0,31,29,31,30,31,30,31,31,30,31,30,31}
		};
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請輸入欲查詢的西元年、月、日");
	    int year = sc1.nextInt();
	    int month = sc1.nextInt();
	    int day = sc1.nextInt();
	    
	    System.out.print(year);
		if(month<10) {
			System.out.print("0");
			System.out.print(month);
		}else {
			System.out.print(month);
		}
		if(day<10) {
			System.out.print("0");
			System.out.print(day);
		}else {
			System.out.print(day);
		}
		
		if (year % 4 != 0){
			if(month == 2 && day >= 29) {
		    	System.out.println("2月份天數不會超過28天，請確認後再重新輸入");
			}else {
				for(;month>0;month--) {
				countdays += arraydays[1][month-1];
				}
				countdays = countdays + day;
				System.out.println("為該年第"+countdays+"天");
				}
		}else if(year % 4 ==0 && year %100 != 0 || year % 400 ==0 || year % 1000 ==0){
			if(month == 2 && day >= 30) {
		    	System.out.println("閏年2月份天數不會超過29天，請確認後再重新輸入!");		    
			}else {
				for(;month>0;month--) {
				countdays += arraydaysleap[1][month-1];
				}
				countdays = countdays + day;
				System.out.println("為該年第"+countdays+"天");
			}
		}
		System.out.println("------------------------");
//		• 班上有8位同學,他們進行了6次考試結果如下:
//		請算出每位同學考最高分的次數
		int[][] array_scorces = {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},
		};

		int[] highestscores = new int [8];
		int highestscoresindex = 0;
		
		for(int a = 0; a<array_scorces.length;a++) {
			int max = array_scorces[a][0];
			for(int b = 0; b<array_scorces[a].length;b++) {				
				if(array_scorces[a][b]>= max) {
				max = array_scorces[a][b];
				highestscoresindex = b;
				}
			}
//			System.out.println(max);
//			System.out.println(highestscoresindex);
			highestscores[highestscoresindex]++;
		}
		for(highestscoresindex = 0; highestscoresindex<highestscores.length; highestscoresindex++) {
			System.out.println((highestscoresindex+1) + "號同學考最高分有" + highestscores[highestscoresindex] + "次");
		}
		
	}	
}
