// Count frequency of each word in a paragraph using HashMap and print the most
// frequent one.

import java.util.HashMap;
public class MostFrequentWord {
    public static void main(String[] args) {
        String para = "10. Count frequency of each word in a paragraph in using HashMap in  and print the most in frequent one.";
        String[] words = para.split(" ");

        HashMap<String,Integer> map = new HashMap<>();
        for(String word:words){
            word=word.toLowerCase();
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        int max=0;
        String mostFreq="";
        for(String key:map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                mostFreq = key;
            }
        }
        System.out.println("MOst frquent word: "+mostFreq);
    }
}