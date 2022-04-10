package task29.pt.ch.vl;

public class replacement {

	public static void main(String[] args) {
		
		String str1 = "AAAAbbbbBBBababbabBabBAbabABAbabABBaba";
		String str2 = method1(str1);
		String str3 = method2(str2);
		print(str3);
	}
	
	public static String method1(String s1) {
		String a = s1.replace("A","a");
		return a;
	}
	
	public static String method2(String s2) {
		String b = s2.replace("B","b"); 
		return b;
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
}

