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
}
