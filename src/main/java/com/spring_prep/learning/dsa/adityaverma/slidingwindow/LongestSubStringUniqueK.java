package com.spring_prep.learning.dsa.adityaverma.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringUniqueK {
    public static void main(String[] args) {
        String s = "joizyglhbetjlvglzvvktxqsslufceppzpgogrifbeyuiblmgcqtkhhbimxigczvbtvrtsperlhunsyywgnttbwjgunjwjtqzqvrdumddtzaffcmjlakmfappoqqkvmfnevaabqxtzslodalgvtwvbsknohmjcumrrqktskvidbizexkprdonsjkbcoeplcafdalmvfaswnjkiqcwowhykczbdkankmkrrwsmcomaubfelnljztemcbmmoptndjodpqnikglvraezkvfxcphvgdgkouirhidbdtesjogrilbxhgtqprexyxptbqdxnwsuddzoiuumlbbgmhuzbgaslssvtexzlipsqfrfvxbkxmazocqvtaguvxmoqvhkfklucswkizrpatpakmuswqdsmxtnuujewtwtrnofowrgmxegwkxokotqhfodaegkmopjpdvpxzjrunwfqeldjhajnjzaargszgxakniopptsoakustvpbtocrovfceofpbeddqeidyvosbwbspesilldkdvocbfrbzthbgsnzaabjfbeanwoicritttjvkromyiodiazfgzktgkeqjmojamqrdusaibheiivnvmokacqudrcairqtisixcjxjsdubgusrcpleludvkjiabbeukbeadqruccuhwcrgosagtuyjfhnaniapxkrqdbmdsbxrzriyszsoguditxxpvdopzktljyrdzxunnybfzfqoezhizbustnwlpqypfqtgxapvwrcybnsjfrsdhyafsdglucczqtoazaycxybnlratmdqphtdwqsddhkrhvbgsytp";
        int k = 3;
        System.out.println(longestkSubstr(s, k));
    }
    public static int longestkSubstr(String s, int k) {
        int max = -1;
        if(s == null){
            return max;
        }
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;

        while(j < s.length()){
            char curr = s.charAt(j);
            int count = map.getOrDefault(curr, 0);
            map.put(curr, count+1);
            set.add(curr);
            if(set.size() < k){
                j++;
            }else if(set.size() == k){
                max = Math.max(max, j - i +1);
                j++;
            } else if(set.size() > k){
                char tempcurr = s.charAt(i);
                int tempCount = map.get(tempcurr);
                while(tempCount > 0){
                    if(tempcurr == s.charAt(i)){
                        tempCount--;
                    }
                    i++;
                }
                System.out.println(i);
                set.remove(tempcurr);
                map.remove(tempcurr);
                j++;
            }
        }
        return max;
    }
}
