package StandardProgramIQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountFrequencyInteger {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 10, 30, 20};

        ArrayList<ArrayList<Integer>> result = countFrequency(arr);

        //sort the result in ascending order - sorting
        result.sort((a, b) -> Integer.compare(a.get(0),
                b.get(0)));

        for (ArrayList<Integer> x : result) {
            System.out.println(x.get(0) + " " + x.get(1));
        }
    }

    //Takes an integer array as input
    //Returns a list of [number, frequency]
    private static ArrayList<ArrayList<Integer>> countFrequency(int[] arr) {

        //HashMap to store frequency
        HashMap<Integer, Integer> mp = new HashMap<>();


        // stores {number, frequency}
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();


        // count frequency using HashMap
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
/*

        You traverse the array once → O(n)
        Each put() and get() in HashMap → O(1) (average case)

        👉 So this step = O(n)

 */


//        getOrDefault(num, 0) means:
//        If key exists → get value
//        If not → return 0


        // build the answer list from the frequency map - iterate map
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            ArrayList<Integer> temp = new ArrayList<>(); //dynamic list
            temp.add(entry.getKey()); //number
            temp.add(entry.getValue()); //frequency
            ans.add(temp);
        }

        return ans;
    }
}
