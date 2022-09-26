package programming.basic;

public class HelloLiteral {
	
	static long creditCardNumber = 1234_5678_9012_3456L;
	static long sacialSecurityNumber = 999_99_999L;
	static String creditCardNumbers = "1234_5678_9012_3456L";
	static float pi = 3.14_15F;
	static float PI = 3.15_15F;
	
	public static void main(String[] args) {
		
		System.out.println(0b1010);
		System.out.println(016);
		System.out.println(0x1F);
		System.out.println(3.14F);
		System.out.println(3.1415D);
		System.out.println(creditCardNumber);
		System.out.println(sacialSecurityNumber);
		System.out.println(creditCardNumbers);
		System.out.println(pi);
		System.out.println(PI);
		
	}

}
