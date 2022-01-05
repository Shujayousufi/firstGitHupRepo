package TestPackage;

import java.util.HashSet;
import java.util.Set;

public class GitTest {
	public static void main(String[] args) {
		
		String str = "Freedom Mortgage";
		int range = 10;
		int [] fibnum = new int [range];
		fibnum [0] =13;
		fibnum [1]= 21;
		System.out.println(fibnum[1]);
		for (int i = 2; i < fibnum.length; i++) {
			fibnum[i] = fibnum[i-1] + fibnum[i-2];
			System.out.println(fibnum[i]);
		
		
		
		}
//		System.out.println(wordProcess(str));
//		System.out.println(splitWord(str));
		}

}
