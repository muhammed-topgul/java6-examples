package _03_map;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 15:51
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    // ELEMANLAR EKLENDIGI SIRADA GELIR

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();

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
