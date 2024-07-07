package HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap();
        hm.put(1, "Kamal");
        hm.put(2, "Ayesh");
        hm.put(null, "Thisara");
        
        Set set = hm.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry) i.next();
            System.out.print("Key : "+me.getKey());
            System.out.println(" Value : "+me.getValue());
        }
        System.out.println(hm.get(1));
    }
    
}
