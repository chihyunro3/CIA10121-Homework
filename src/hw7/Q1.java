package hw7;

import java.io.*;

public class Q1 {

	public static void main(String[] args) throws IOException{
//		請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		
		File sample = new File("C:/Javawork", "Sample.txt");
		System.out.println("Sample.txt檔案共有" + sample.length() + "位元組，");
		

	}

}
