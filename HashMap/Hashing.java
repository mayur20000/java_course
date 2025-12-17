import java.util.HashMap;

public class Hashing {
    public static void main(String args[]){

        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("india", 14445);
        map.put("china", 45464);
        map.put("america", 75456);

        System.out.println(map);


        //search
        if(map.containsKey("india")){
            System.out.println("key is present in the map");
        }else{
            System.out.println("key is not present in the map");
        }

        if(map.containsKey("indonesia")){
            System.out.println("key is present in the map");
        }else{
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("china"));
        System.out.println(map.get("indonesia"));


        
    }
}
