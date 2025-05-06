package normalpractice;

import java.util.Scanner;
//average of the integers in arrays
public class sda2 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Please enter your arraysize");
int arraysize = sc.nextInt();
int [] size = new int[arraysize];
System.out.println("please enter your array values");
 
for(int i=0;i<arraysize;i++) {
	size[i] =sc.nextInt();
}
int sum =0;
for(int i=0;i<size.length;i++) {
	sum +=size[i];
	System.out.println(sum/size.length);
	
}
sc.close();
}
}
