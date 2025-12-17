import java.util.*;
public class Iteration {
    public static void main(String args[]){

        int arr[] = {12, 45, 48, 47};
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);



        for( Map.Entry<String, Integer> e: map.entrySet()){
            System.out.print(e.getKey() + ":");
            System.out.println(e.getValue());
        }
    } 
}
