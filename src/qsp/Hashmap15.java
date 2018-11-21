package qsp;

import java.util.LinkedHashMap;

public class Hashmap15 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer>map=new LinkedHashMap<String,Integer>();
		map.put("pc", 2);
		map.put("projector", 2);
		map.put("chair", 130);
		map.put("marker",4);
		System.out.println(map.get("chair"));
		if (map.containsKey("projector")) {
			System.out.println("having projector");
			
		}else{
			System.out.println("not having projector");
		}
	}

}
