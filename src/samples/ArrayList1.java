package samples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		
		ar.add("sidda");
		ar.add("Maddur");
		ar.add("Mandya");
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		for (int i = 0; i < ar.size();i++) {
			
			System.out.println(ar.get(i));
			
		}
		
		System.out.println("=======for each loop=========");
		
		for(Object e: ar) {
			System.out.println(e);
		}
		
		ArrayList<Integer> marksLIst=new ArrayList<Integer>();
		
		marksLIst.add(120);
		marksLIst.add(234);
		marksLIst.add(120);
		marksLIst.add(234);
		//marksLIst.add("sss");
		System.out.println("=======for each loop=========");
		for(Integer e: marksLIst) {
			System.out.println(e);
			
		}
		System.gc();
		
		
		
		
		
		

	}

}
