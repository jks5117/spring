package web.mvc;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Add add = new Add();
		int result = 0;
		Map<String,Object> x = new HashMap<>();
		x.put("a",1);
		x.put("b",2);
		x.put("c",3);
		add.addNums(x);
		System.out.println(x.get("a"));
		System.out.println(x.get("d"));
		
		String q = "q";
		String w = "w";
		String e = "e";
		add.addNums(q, w, e);
		System.out.println(e);
	}
}
