public class Test {

public static void setMap(Map<String,String> map) {

map = null;

}

public static void main(String[] args) {

Map<String,String> map = new HashMap<String,String>();

setMap(map);

map.put("test","data");

System.out.println(map);

}

}