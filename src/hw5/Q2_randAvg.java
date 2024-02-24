package hw5;

public class Q2_randAvg {
//	• 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	public static void main(String[] args) {
		randAvg();
	}

	public static void randAvg() {
	int[] rand_array = new int[10];
	for (int i = 0; i < 10; i++) {
		rand_array[i] = (int) (Math.random() * 100) + 1;
	}
	System.out.println("本次亂數結果：");
	for (int value : rand_array) {
		System.out.print(value + " ");
		}
	
	System.out.print("\n");
	int sum = 0;
	for (int j = 0; j < rand_array.length; j++) {
		sum += rand_array[j];
	}
	System.out.println("平均值為" + sum / rand_array.length);
	}

}
