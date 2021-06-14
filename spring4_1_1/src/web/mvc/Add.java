package web.mvc;

import java.util.Map;

public class Add {
	public void addNums(Map<String,Object> x) {
		x.put("d", 4);
	}
	public void addNums(String a, String b, String c) {
		c = a+b;
		System.out.println("함수내에서:"+c);
	}
}
