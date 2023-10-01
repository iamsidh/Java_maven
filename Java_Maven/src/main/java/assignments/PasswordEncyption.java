package assignments;

import java.util.Base64;

class PasswordEncryption {

	public static void main(String[] args) {

		String myPass = "Siddhesh@123";

		byte[] encodePass = Base64.getEncoder().encode(myPass.getBytes());

	//	System.out.println("Encrypted Password is : " + new String(encodePass));

		String text = "Siddhesh Madgaonkar";
		
		String text1="\\rmmqn|q)Vjmpjxwtj{";

		Encrypt(text);
		
		//Decrypt(text1);
	}

	public static void Encrypt(String pass) {

		int key = 8;
		
		System.out.println(pass);

		char[] chars = pass.toCharArray();
		
		char EncPass = 0;

		for (char c : chars) {

			c += key;
			//System.out.print(c);
			
			EncPass = c;
			//return c;
			
			System.out.print(EncPass);
		}
		
		//return EncPass;
		
		//return 0;

	}
	
	public static void Decrypt(String pass) {

		int key = 90;
		
		System.out.println(pass);

		char[] chars = pass.toCharArray();
		
		char DecPass = 0;

		for (char c : chars) {

			c -= key;
			//System.out.print(c);
			
			DecPass = c;
			//return c;
			
			System.out.print(DecPass);
		}
		
		//return DecPass;
		
		//return 0;

	}

}