package TestPackage;

import java.util.HashMap;

public class ForNewBranch {

	public static void main(String[] args) {
		
		int []data  = {4,3,5,66,777,444,888,-2,};
		String str = "this is a test to be taken this time at this moment";
		System.out.println(getDuplicate(str));
		System.out.println(maxValue(data));
		System.out.println(minValue(data));
		System.out.println(avgValue(data));
		
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
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
	public static int minValue(int [] data){
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < data.length; i++) {
			if(min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}
	public static int sumValue (int [] data){
		int sum =0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	public static double avgValue(int [] data){
		double avg = (double)sumValue(data)/ data.length;
		return avg;
	}

}
