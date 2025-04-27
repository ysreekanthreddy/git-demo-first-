package normalpractice;

import java.util.Arrays;
import java.util.Scanner;
// sum of the num
public class sda {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter your arraysize");
	int arraysize = sc.nextInt();

	int [] size = new int[arraysize];
	System.out.println("please enter array values");
	for(int i =0;i<arraysize;i++) {
		size[i]=sc.nextInt();}
	
		System.out.println(Arrays.toString(size));
		int sum =0;
		for(int i=0;i<size.length;i++) {
			sum +=size[i];
			System.out.println(sum);
			sc.close();
		}
		}
}



