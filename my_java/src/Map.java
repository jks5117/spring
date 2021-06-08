import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("사람", "조기설");
		map.put("스포츠종목", "농구");
		map.put("취미", "코딩");
		map.put("게임", "롤");
		System.out.println(map.get("스포츠종목"));
		
	}
}
