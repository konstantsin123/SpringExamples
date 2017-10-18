package maps;

import java.util.HashMap;

public class HashMapsNullKey {

    public static void main(String[] args){
        HashMap hashMap = new HashMap();
        hashMap.put(null, "0");
        hashMap.put(null, "1");
        System.out.println(hashMap.get(null));
    }
}
