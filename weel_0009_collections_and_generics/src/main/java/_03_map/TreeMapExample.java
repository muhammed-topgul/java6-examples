package _03_map;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 15:51
 */

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    // ELEMANLAR KEY'E GORE SIRALI GELIR
    // FAKAT BUNUN ICIN KEY'IN COMPAEABLE OLMASI GEREKIR

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

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
