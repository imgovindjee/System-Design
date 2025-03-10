package com.F.DesignDataStructure;

public class Main {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>(7);
        map.put(1, "hi");
        map.put(2, "my");
        map.put(3, "name is");
        map.put(4, "Ganesh");
        map.put(5, "how");
        map.put(6, "are");
        map.put(7, "you");
        map.put(8, "friends");
        map.put(9, "?");

        String str = map.get(8);
        System.out.println(str);
        System.out.println(map.get(5));
    }
}
