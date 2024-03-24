package hw7;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Q2 {

	public static void main(String[] args) {
		
	        Set<Integer> set = new HashSet<>();
	        
	        
	        while(set.size() <= 10) {
	        	int i = (int)(Math.random()*1000 + 1);
	        	set.add(i);
//	        	System.out.print(i + ",");
	        }
	        try {
				FileOutputStream fos = new FileOutputStream("C:\\Users\\Rosa\\CIA10121-Homework\\src\\hw7");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
	        Iterator objs = set.iterator();
	        while(objs.hasNext()) {
	        	System.out.println(objs.next());
	        }
	    }
		
	}
