package hw3;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		if (sc.hasNextInt()) {
			int i = sc.nextInt();

			int lotteryrandom[] = new int[44];
			int comparepool[] = new int[6];

			// 宣告一個陣列，存放數字1~49
			int lottery[][] = new int[5][];
			lottery[0] = new int[10];
			lottery[1] = new int[10];
			lottery[2] = new int[10];
			lottery[3] = new int[10];
			lottery[4] = new int[9];

			int a = 1;
			int count = 0;
			for (int j = 0; j < lottery.length; j++) {
				for (int k = 0; k < lottery[j].length; k++) {
					lottery[j][k] = a;
					a++;
					if (j == i && k != 9 || k == i - 1 || (j == i - 1 && k == 9)) {
						// 有bug還印出40if (j == i || k == i - 1 || (j == i - 1 && k == 9))

					} else {

						lotteryrandom[count] = lottery[j][k];
						count++;
					}

				}

			}
			int count1 = 1;
			do {
				int r1 = (int) (Math.random() * count) + 0;
				System.out.print(lotteryrandom[r1] + " ");
			} while (count1++ < 6);

//			System.out.println();
//			System.out.println("總共有" + count + "個數字可以選");

			// 依據陣列索引值刪除阿文選到的數字
			// 依據陣列索引值找到阿文不想選到的數字
			// 宣告一個新陣列，存放已經篩選好的數字們
			// 設計一個方法，先產生一個亂數後，存入陣列，產出第二個亂數後，每一個先比對是否與陣列中的元素相等，若相等則存入，不相等則再取新的亂數

		}
		sc.close();
	}

}
