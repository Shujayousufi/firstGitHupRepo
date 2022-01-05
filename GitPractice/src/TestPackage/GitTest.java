package TestPackage;

public class GitTest {
	public static void main(String[] args) {

		int range = 10;
		int [] fibnum = new int [range];
		fibnum [0] =0;
		fibnum [1]= 1;
		System.out.println(fibnum[0]);
		for (int i = 2; i < fibnum.length; i++) {
			fibnum[i] = fibnum[i-1] + fibnum[i-2];
			System.out.println(fibnum[i]);
		}
	}
		public static String wordProcess( String str) {
		String r = str.substring(1, str.length()-1);
		Set<Character> chars = new HashSet<Character>();
		for (int i = 0; i < r.length(); i++) {
			chars.add(r.charAt(i));
		}
		
		return ""+ str.charAt(0) + chars.size() + str.charAt(str.length()-1);
	}
	public static String splitWord( String str) {
		String [] word = str.split("[^a-zA-Z]");
		String rej = str.replaceAll("[a-zA-Z]", "");
		String res = "";
		for (int i = 0; i < word.length; i++) {
			res += wordProcess(word[i]);
			if(i <= rej.length()-1) {
			res += rej.charAt(i);
		}
		}
		return res;
	}
}
