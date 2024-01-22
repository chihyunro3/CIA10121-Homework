package hw1;

public class Exersise {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println(a + b);
		System.out.println(a * b);

		// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs = 200;
		int dozen = eggs / 12;
		int egg = eggs % 12;
		System.out.println(dozen + "打" + egg + "顆");

		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int all = 256559;
		int sec = all % 60;
		int min = (all / 60) % 60;
		int hr = (all / 60 / 60) % 24;
		int day = (all / 60 / 60 / 24);
		System.out.println(day + "天" + hr + "小時" + min + "分" + sec + "秒");

		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		System.out.printf("圓面積=%.4f%n", (5 * 5 * PI));
		System.out.printf("圓周長=%.4f%n", (5 * 2 * PI));

		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		// S = P(I + i)^n，其中以符號I代表利息，P代表本金, n代表期數, i代表利率, S代表本利和
		double p = 1_500_000.00;
		double r = 0.02;
		double fv = Math.pow(1 + r, 10);
		System.out.println(p * fv);

		// 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		
		System.out.println(5 + 5); 		//運算子+前後皆為java預設的整數型別，單純做算術運算。
		System.out.println(5 + '5');	//'5'unicode為十六進制值35，因為java以十進制表示，故換算十進制值為53，+為運算子做算式運算。
		System.out.println(5 + "5");	//雙引號與運算子合併做字串相接。
	
	}

}
