package _03_map;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 15:51
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    // ELEMANLAR RASTGELE GELIR

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(100, "muhammed");
        map.put(10, "react");
        map.put(50, "java");
        map.put(10, "javascript");

        //
        System.out.println(map);

        //
        for (Integer key : map.keySet()) {
            System.out.println("K: " + key + " M: " + map.get(key));
        }
    }
}
