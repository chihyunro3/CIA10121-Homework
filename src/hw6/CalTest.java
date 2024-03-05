package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		try {
			Scanner sc_x = new Scanner(System.in);
			System.out.println("請輸入x的值");
			int i = sc_x.nextInt();

			Scanner sc_y = new Scanner(System.in);
			System.out.println("請輸入y的值");
			int j = sc_y.nextInt();

			Calculator cal = new Calculator(i, j);

			System.out.println(i + "的" + j + "次方等於" + cal.powerXY(i, j));
		} catch (CalException ce) {
			ce.getMessage();
			ce.printStackTrace();

		}

	}

}
