package normalpractice;

import java.util.Vector;

public class ArrayList {

	public static void main(String[] args) {
		Vector v1 = new Vector ();

		v1.add(0, "sreekanth");
		v1.add(0, "rajesj");
		v1.add(0, "sai");

		Vector v2 =new Vector();
		v2.add("vinayaka");
		v2.add("venkateswara");
		v2.add(v1);
		
		System.out.println(v2);
		System.out.println(v2.size());
		
      System.out.println(v2.capacity());
	
	}
}



