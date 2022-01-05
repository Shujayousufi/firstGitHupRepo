package TestPackage;

import java.util.HashMap;

public class ForNewBranch {

	public static void main(String[] args) {
		
		int []data  = {4,3,5,66,777,444,888,-2,};
		String str = "this is a test to be taken this time at this moment";
		System.out.println(getDuplicate(str));
	}
	public static String getDuplicate(String str) {
		HashMap<String , Integer> temp = new HashMap<String , Integer>();
		HashMap<String , Integer> duplicate = new HashMap<String , Integer>();
		for (String w : str.split(" ")) {
			if(temp.containsKey(w)) {
				temp.put(w, temp.get(w)+1);
			}
			else {
				temp.put(w, 1);
			}
		}
		for (String word : temp.keySet()) {
			if(temp.get(word)>1) {
				duplicate.put(word, temp.get(word));
			}
		}
		return  duplicate +"\n"+ temp;
	}
	public static int maxValue(int [] data) {

		return 0;
	}
	public static int minValue(int [] data){
		
	}
	public static int sumValue (int [] data){
		
	}
	public static double avgValue(int [] data){
		
	}

}
