package hw2;

public class TestNineNine {

	public static void main(String[] args) {

		// 一：使用for迴圈 + while迴圈
		int i = 1;
		int j = 1;
		for (; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}

		System.out.println("======================================================================");
		
		// 二：使用for迴圈 + do while迴圈

		for (int k = 1; k <= 9; k++) {
			int l = 1;
			do {
				System.out.print(k + "*" + l + "=" + k * l + "\t");
				l++;
			} while (l <= 9);
			System.out.println();

		}

		System.out.println("=======================================================================");
		
		// 三：使用while迴圈 + do while迴圈
		int m = 1;
		while (m <= 9) {
			int n = 1;
			do {
				System.out.print(m + "*" + n + "=" + m * n + "\t");
				n++;
			} while (n <= 9);
			m++;
			System.out.println();

		}

	}

}
