import java.util.*;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "My name name is renee renee";
		 Map<String,Integer> map = new  HashMap<String,Integer>();
		 String[] arr =str.split(" ");
		 int count = 1;
		 for (int i = 0;i<arr.length;i++) {
			 if(!map.containsKey(arr[i])) {
				 map.put(arr[i],count);
			 }
			 else {
				 
				 //hashmap doesnt store duplicate keys therefore if duplicate comes it will take the value of the older keyset
				 map.put(arr[i],map.get(arr[i])+1);
			 }
		 }
		 for (String x : map.keySet()) {
			 System.out.println("the count of word:"+x+"="+map.get(x));
		 }
		 
	}

}
