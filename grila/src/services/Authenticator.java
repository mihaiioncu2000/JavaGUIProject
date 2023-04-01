package services;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class Authenticator {

	private static Map<String, byte[]> getCredentials() {
		Map<String, byte[]> credentials = new HashMap<>();
		credentials.put("admin", new BigInteger("21232f297a57a5a743894a0e4a801fc3", 16).toByteArray());// MD5 admin
		credentials.put("user", new BigInteger("5f4dcc3b5aa765d61d8327deb882cf99", 16).toByteArray());// MD5 password

		return credentials;
	}

	public static boolean verifyLogin(String username, char[] password) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			byte[] digest = md.digest(new String(password).getBytes(StandardCharsets.UTF_8));

			return getCredentials().get(username) != null
					&& MessageDigest.isEqual(getCredentials().get(username), digest);
		} catch (NoSuchAlgorithmException e) {
			return false;// error creating MessageDigest, can't login
		}
	}
}
