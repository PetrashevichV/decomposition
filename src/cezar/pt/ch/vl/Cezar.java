package cezar.pt.ch.vl;

import java.util.Scanner;

public class Cezar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "MVEZ MZUZ MZTZ";
		int key = 17;
		Decrypt(s, key);
		System.out.print("Ответ : " + key);
	}

	public static void Decrypt(String str, int n) {

		int k = Integer.parseInt("-" + n);
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c += k % 26;
				if (c < 'a')
					c += 26;
				if (c > 'z')
					c -= 26;
			} else if (c >= 'A' && c <= 'Z') {
				c += k % 26;
				if (c < 'A')
					c += 26;
				if (c > 'Z')
					c -= 26;
			}
			string += c;
		}
		System.out.println("Расшифровка : " + string);
	}
}
