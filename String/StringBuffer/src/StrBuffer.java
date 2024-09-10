import com.sun.security.jgss.GSSUtil;

import java.security.spec.RSAOtherPrimeInfo;

public class StrBuffer {
	public static void main(String[] args) {
		String str1 = "Ashutosh kumar singh";
		StringBuffer str = new StringBuffer(str1);
		str.append(" singh");
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		StringBuffer str2 = new StringBuffer(30);
		str2.append("hi ");
		System.out.println("print the str2 : " + str2);
		System.out.println(str2.reverse());
	}
}
