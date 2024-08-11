package week8.day2;

import java.util.Base64;

import io.netty.handler.codec.base64.Base64Encoder;

public class CredentialEncyrption {

	
	public static void main(String[] args) {
		
		String username = "gokul.sekar@testleaf.com";
		String password = "Leaf$321";
		
		byte[] encodedUsername = Base64.getEncoder().encode(username.getBytes());
		for (int i = 0; i < encodedUsername.length; i++) {
			System.out.print(encodedUsername[i]);
		}
		System.out.println();
		byte[] decodedUsername = Base64.getDecoder().decode(encodedUsername);
		for (int i = 0; i < decodedUsername.length; i++) {
			System.out.print(decodedUsername[i]);
		}
		
	}
	
	
}
