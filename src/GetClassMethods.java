import java.lang.reflect.*;
public class GetClassMethods {
	public static void main(String[] args) throws ClassNotFoundException {
		int count =0;
		@SuppressWarnings("rawtypes")
		Class c = Class.forName("java.util.Scanner");
		System.out.println(c);
		
		  Method[] m = c.getDeclaredMethods(); 
		  for(Method m1: m) {
		  System.out.println((count+1)+" : "+m1.getName()); count++; }
		  System.out.println("Count: "+count);
		 
	}

}
