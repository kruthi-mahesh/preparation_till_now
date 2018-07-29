import java.util.*;
class delete{
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>() {
      {
        put("test", "test123");
        put("test2", "test456");
      }
    };
String key = "";
    Iterator<String> it = map.keySet().iterator();
    while(it.hasNext())
    {
    key = it.next();
      //Map.Entry<String, String> entry = it.next();
      if(map.get(key).equals("test")) {
        it.remove();//does not work
      }
    }
    System.out.println(map);
map.remove(key);
System.out.println(map);


    
    Iterator<Map.Entry<String, String>> it1 = map.entrySet().iterator();
    while(it1.hasNext())
    {
      //Map.Entry<String, String> entry = it.next();
      if(it1.next().getKey().equals("test2")) {
        it1.remove();
      }
    }
    System.out.println(map);

   


	}
}