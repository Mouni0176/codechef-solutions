class Solution {
    public int majorityElement(int[] arr) {
        // write your code here
        int count= 0 ;
      int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0;i<arr.length;i++){
            
            if(arr[i]>max){ 
                max = arr[i];
                count++;
                if(count>=(n/2)){
                    return max;
                }
        }
        
    }
    return max;
}

}