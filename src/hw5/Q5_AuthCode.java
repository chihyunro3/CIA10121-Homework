package hw5;

public class Q5_AuthCode {
//	• 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法genAuthCode()，
//	當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合，如圖：
	
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為：");
		genAuthCode();
	}
	
	public static void genAuthCode(){
		//建立一個字元一維陣列A存放被隨機取出的元素：10個數字+26個英文大寫+26個英文小寫=62個元素
		char[] array_A = new char[62];
		//存放元素0~9 ASCII code 48~57
		char number = 48;
		for(int i = 0; i < 10; i++) {
			array_A[i] = number;
			number++;
		}

		//存放元素A~Z ASCII code 65~90
		char alphabet_upper = 65;
		for(int i = 10; i < 36; i++) {
			array_A[i] = alphabet_upper;
			alphabet_upper++;
		}
		
		//存放元素a~z ASCII code 97~122
		char alphabet_lower = 97;
		for(int i = 36; i < 62; i++) {
			array_A[i] = alphabet_lower;
			alphabet_lower++;
		}
		//建立一個陣列存放隨機產生的元素
		char[] array_B = new char[8];
		
		//利用亂數隨機產出的數字作為從陣列取出元素的索引值
		
		
		//將值存入陣列B，並印出陣列B
		for(int i = 0; i < array_B.length; i++) {
			int index = (int)(Math.random()*62);
			array_B[i] = array_A[index]; 
		}
				
		for(char value : array_B) {
			System.out.print(value);
		}
	}
}
