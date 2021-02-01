package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        
        int[] data = {1,2,3,4,5,6,1,2,3,4,4,5,6};

        for (int i = 0; i < data.length; i++){
            if (map.containsKey(data[i])) map.put(data[i], map.get(data[i])+1);
            else map.put(data[i], 1);
        }
        
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
    
}
