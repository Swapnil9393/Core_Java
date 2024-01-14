package firstpackage;

import java.util.Scanner;

public class ObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your name Age Percentage=");
		String name =s.next();
		byte age= s.nextByte();
		float per=s.nextFloat();
		System.out.println("Name= "+name+"\nAge"+age+"\nPercentage"+per);
	}

}
