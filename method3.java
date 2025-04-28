package normalpractice;

public class method3 {

	public static void main(String[] args) {
		method3 m3 =new method3();
//	String  selfstart = m3.selfStart();
//	System.out.println(selfstart);
	System.out.println(m3.selfStart());
    System.out.println( m3.price());
	}

	String selfStart () {
		System.out.println("with self only bike will start");
		return "no need kicker";
	}
	
public	int price() {
		System.out.println("price etc");
		return 1235;
	}
	
}
