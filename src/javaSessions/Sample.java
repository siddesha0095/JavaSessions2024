package javaSessions;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi This is my first java program");
		
		long w=222222222222222222l;
		System.out.println(w);
		
		float h=20.67889f;
		System.out.println("h"+" "+h);
		
		float h1=(float) 20.67889333333333333333333333333;
		System.out.println("h1"+" "+h1);
		
		
		double d=345.9009999777779d;
		System.out.println("d"+" "+d);
		
		double myDouble = 9.78d;
		int myInt = (int)myDouble;
		
		System.out.println("myInt"+" "+myInt);
		
		
		char t1='a';
		System.out.println("Char Value of A is"+ t1);
		
		
		char t2='c';
		System.out.println("Ascii Value of c is"+(int) t2);
		
		System.out.println(t1+t2);
		
		int a=20;
		int r=30;
		
		if(a>r) 
		{
			System.out.println("a is ggreater than b");
		}
		else
		{
			System.out.println("r is greatee");
		}
		
		
		int m1=12;
		int m2=282;
		int m3=31;
		int m4=4;
		
		if (m1>m2&&m1>m3&&m1>m4) {
			System.out.println("m1 is greater");
		}
		
		else if(m2>m3&&m2>m4) {
		System.out.println("m2");
	}
		else if(m3>m4) {
			System.out.println("m3 is greater");
		}
		
		else {
			System.out.println("m4 is greater");
		}
		
		int max1 = Math.max(m1, m2);
        int max2 = Math.max(m3, m4);
        int result = Math.max(max1, max2);
        
        System.out.println(result);
        
        String env="QA";
        switch (env) {
		case "QA":
			System.out.println("QA env");
			
			break;

		default:
			System.out.println("no env");
			break;
		}
        
        for (int i = 10; i>=1; i--) {
        	
        	System.out.println(i);
			
		}
        
        int w1=1;
        
        while (w1<10) {
        	
        	System.out.println("w"+""+w1);
        	w1++;
			
		}
        System.out.println(" Arrayyyyyyyyyyyy");
        int ar[]=new int[3];
        
        ar[0]=10;
        ar[1]=20;
        ar[2]=30;
        
        System.out.println(ar.length);
        
        for(int e:ar) {
        	System.out.println(e);
        }
        
        System.out.println(" Arrayyyyyyyyyyyy");

}
}
