import java.util.StringTokenizer;

public class intro {
	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("apple mango"," ");
		while (str.hasMoreElements()){
			System.out.println(str.nextToken());
		}
	}
}
