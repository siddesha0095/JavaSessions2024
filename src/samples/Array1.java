package samples;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]=new String[3];
		
		s[0]="Sidda";
		s[1]="Navaneeth";
		s[2]="chaithra";
		
		
		System.out.println(s[0]);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
		System.out.println("====================");
		for(String e:s) {
			System.out.println(e);
		}
		
		
String s1[]=new String[3];
		
		
		s1[2]="chaithra new";
		System.out.println(s1[2]);

	}

}
