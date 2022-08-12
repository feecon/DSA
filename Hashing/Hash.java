package Hashing;
import java.util.HashMap;
import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        //creating hashmap object
        HashMap<String,Integer> map = new HashMap<>();

        //insertin function to hashmap
        map.put("India", 140);
        map.put("USA",90);
        map.put("China",160);

        //printing hashmap
        System.out.println(map);

        //printing size of the hashmap
        System.out.println(map.size());

        //searching function in hashmap
        System.out.println(map.containsKey("India")); //returns true or false

          //searching function in hashmap
          System.out.println(map.containsValue(140));

        System.out.println(map.get("USA")); //get(key)--> returns the value corresponding to it

        map.put("USA",100); //Updating at key: "USA" to value: 100, it means it overrides the previous action
        
        System.out.println(map);  //return the updated hashmap with USA = 100

        map.remove("China"); //delete the key: "China" and its corresponding value

        System.out.println(map);

        System.out.println(map.get("India")); // retursn the value at key 

        map.put("India", map.get("India")-1);

        System.out.println(map);
        
        System.out.println("*************************************************");

        HashSet<Integer> hs = new HashSet<>();

        //insert
        hs.add(21);
        hs.add(21);
        hs.add(215);
        hs.add(212);
        
        System.out.println(hs);
        
        //size
        System.out.println(hs.size());

        System.out.println(hs.contains(21));

        hs.remove(21);

        System.out.println(hs);
        

        

    }
    

}
