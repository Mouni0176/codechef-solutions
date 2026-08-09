class Solution {
    public int majorityElement(int[] arr) {
        // write your code here
        
      int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0;i<arr.length;i++){
            
            if(arr[i]>max){ 
                max = arr[i];
                
        }
        
    }
    return max;
}

}