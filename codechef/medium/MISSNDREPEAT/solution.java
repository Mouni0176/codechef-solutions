import java.util.*;
class Solution {
    public int[] findRepeatingAndMissing(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        int [] res = new int[2];
        for(int i = 0;i<arr.length;i++){
            if(seen.contains(arr[i])){
                res[0] = arr[i];
            }
            else{
                seen.add(arr[i]);
            }
            
        }
        for(int i=1;i<=arr.length;i++){
            if(!seen.contains(i)){
                res[1]=i;
                break;
            }
        }
       return res;
    }
}