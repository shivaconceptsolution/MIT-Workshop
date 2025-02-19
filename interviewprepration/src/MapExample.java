import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("rno", "1001");
        map.put("name", "xyz");
        map.put("age", "20");
        System.out.println(map.get("rno"));
    }
}
