class Solution {
    public int majorityElement(int[] arr) {
        // write your code here
        
      int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0;i<arr.length;i++){
            int count = 0 ;
            for(int j=0; j<arr.length;j++){
                max = arr[i];
            
            if(arr[j]==max){ 
                max = arr[i];
                count++;
                
            }
            if(count>=n/2){
                return max;
            }
        }
        
    }
    return max;
}

}