package bai7;

import java.util.HashMap;

public class HashMapExample1 {
    /**
     * main
     * 
     * @author viettuts.vn
     * @param args
     */
    public static void main(String args[]) {
        // khoi tao hashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // them cac phan tu vao hashMap
        hashMap.put(3, "OOP");
        hashMap.put(55, "JAVA");
        hashMap.put(23, "HASHMAP");
        // hien thi HashMap
        System.out.println(hashMap);
    }
}