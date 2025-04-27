package normalpractice;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class bike {
	public static void main(String[] args) {
	String k ="sreekanth";
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter starting number");
    int starting = sc.nextInt();
    System.out.println("please enter ending number");
	int ending = sc.nextInt();
	int sum=0;
	for(int i =starting;i>=ending;i--) {
		if(i%2==1) 
		System.out.println(i);
		
sc.close();
	}	}}
		
