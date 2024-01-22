package hw2;

public class ExWhile {

	public static void main(String[] args) {

		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 0; i <= 1000; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		System.out.println("----------");

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int productfor = 1;
		for (int a = 1; a <= 10; a++) {
			productfor *= a;

		}
		System.out.println(productfor);
		
		System.out.println("----------");

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int b = 1;
		int productwhile = 1;
		while (b <= 10) {
			productwhile *= b;
			b++;
		}
		System.out.println(productwhile);
		
		System.out.println("----------");

		// 請設計一隻Java程式,輸出結果為以下:
		// 1 4 9 16 25 36 49 64 81 100
		for (int c = 1; c <= 10; c++) {
			System.out.print(c * c + " ");
		}

		System.out.println();
		System.out.println("----------");

		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		// 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		System.out.print("可以選擇的數字有：");
		int count1 = 0;
		for ( int d = 1; d <= 39; d++) {
			switch(d){
			default:
			System.out.print(d+" ");
			count1++;
			break;
			case 4:
			break;
			case 14:
			break;
			case 24:
			break;
			case 34:
			break;
			}
			
		}
		System.out.print("；總共有" + count1++ + "個。");
		
		System.out.println();
		System.out.println("----------");
		
		// 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		outer:
		for (int f = 10; f <= 10; f--) {
			for (int g = 1; g <= f; g++) {
				System.out.print(g + " ");
			}
			System.out.println();
			if(f<=0) {
			break outer;	
			}
		
		}
		
		System.out.println("----------");
		
		// 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		char alphabet = 65;
		for (int h=1; h<=6; h++) {
			for (int g = 1; g<=h; g++) {
				System.out.print(alphabet);
			}
			System.out.println();
			alphabet++;
			
		}
		
//			
//		暴力解
//		int count3 = 0;
//		for (int h=1; h<=6; h++) {
//			for (int g = 1; g<=h; g++) {
//				count3++;
//				switch(count3) {
//				case 1:
//					System.out.println("A");
//					break;
//				case 2:
//					System.out.println("BB");
//					break;
//				case 3:
//					System.out.println("CCC");
//					break;
//				case 4:
//					System.out.println("DDDD");
//					break;
//				case 5:
//					System.out.println("EEEEE");
//					break;
//				case 6:
//					System.out.println("FFFFFF");
//					break;
//				default:
//					break;				
//				}
//				
//			}
//		}
		
		
		
		
		
		
		
	}
}