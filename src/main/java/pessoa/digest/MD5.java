package pessoa.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static String digest(String string) {

		try {
			
			final MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(string.getBytes());

			final byte[] digest = md.digest();
			final StringBuilder digested = new StringBuilder();

			for (byte $byte : digest) {
				digested.append(Integer.toHexString((int) ($byte & 0xFF)));
			}

			return digested.toString();
			
		} catch (NoSuchAlgorithmException e) {
			return string;
		}

	}

}
