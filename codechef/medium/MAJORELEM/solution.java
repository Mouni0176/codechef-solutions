class Solution {
    public int majorityElement(int[] arr) {
        
        
      int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0;i<arr.length;i++){
            int count = 1 ;
            max = arr[i];
            for(int j=i+1; j<arr.length;j++){
                
            
            if(arr[j]==max){ 
                
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