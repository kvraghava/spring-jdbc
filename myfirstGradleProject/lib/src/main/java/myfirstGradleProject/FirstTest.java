package myfirstGradleProject;

import org.apache.commons.codec.binary.Base64;

public class FirstTest {
	public static void main(String[] args) {
		
		String hello = "Hello";
		byte[] arr = Base64.encodeBase64(hello.getBytes());
		
		String encodedData = new String(arr);
		System.out.println("encoded data is = "+encodedData);
		
		byte[] dec = Base64.decodeBase64(arr);
	
		
		String decodeData = new String(dec);
		System.out.println("decoded data is ="+decodeData);
	}
}
