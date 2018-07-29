import java.util.*;
class MyComparator implements Comparator<String> {

    Map<String, Integer> map;

    public MyComparator(Map<String, Integer> map) {
        this.map = map;
    }

    public int compare(String o1, String o2) {

        if (map.get(o2) == map.get(o1))
            return -1;
        else
            return ((Integer) map.get(o2)).compareTo((Integer)     
                                                            map.get(o1	));

    }
}
class _1b_SortedMapEx{
	public static void main(String[] args) {
	Map<String, Integer> lMap = new HashMap<String, Integer>();
    lMap.put("A", 35);
    lMap.put("B", 75);
    lMap.put("C", 50);
    lMap.put("D", 50);

    MyComparator comparator = new MyComparator(lMap);

    Map<String, Integer> newMap = new TreeMap<String, Integer>(comparator);
    newMap.putAll(lMap);
    System.out.println(newMap);
    System.out.println(lMap.get("A"));
	}
}