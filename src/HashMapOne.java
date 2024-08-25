import java.util.*;

public class HashMapOne {
    public static void main(String[] args) {
//        country(key), population(value)
        HashMap<String,Integer> map = new HashMap<>();

//        insertion
        map.put("India",120);
        map.put("china",150);
        map.put("US",30);

        System.out.println(map);

//        update any value
        map.put("India",160);
        System.out.println(map);

//        searching
        if (map.containsKey("china")){
            System.out.println("key is present in the map");
        }else {
            System.out.println("key is not present in the map");
        }

//        value of any key
        System.out.println(map.get("china")); //key exist
        System.out.println(map.get("chin"));  //key doesn't exist

        
    }
}
