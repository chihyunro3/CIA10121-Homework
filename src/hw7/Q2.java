package hw7;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Q2 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		while (set.size() < 10) {
			int i = (int) (Math.random() * 1000 + 1);
			set.add(i);
//	        	System.out.print(i + ",");
		}
		
//		//檢查輸出的亂數是否一致
		Iterator objs = set.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());
		}

		try{
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Rosa\\Desktop\\Java\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			ps.println(set);

			ps.close();
			bos.close();
			fos.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}

	}

}
