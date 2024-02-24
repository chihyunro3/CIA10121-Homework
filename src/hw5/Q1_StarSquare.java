package hw5;

public class Q1_StarSquare {
//	• 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
//	static char star = 42;
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void starSquare() {
//		char[][] arraySquare = new char[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width ; j++) {
//				arraySquare[i][j] = star;
//				System.out.print(arraySquare[i][j]);
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	/*
	 * test code: char star = 42; System.out.println(star); char[][] arraySquare =
	 * new char[4][5]; for (int i = 0; i < arraySquare.length; i++) { for (int j =
	 * 0; j < arraySquare[i].length; j++) { arraySquare[i][j] = star;
	 * System.out.print(arraySquare[i][j]); } System.out.print("\n"); }
	 */

}
