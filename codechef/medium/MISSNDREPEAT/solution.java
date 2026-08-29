class Solution {
    public int[] findRepeatingAndMissing(int[] arr) {
        int n= (arr.length*(arr.length+1))/2;
        // write your code here
        int found = 0;
        int ff=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i])==arr[j]){
                    found = arr[i];
                }
            }
        
        }
        for(int i = 0;i < arr.length;i++){
            n-=arr[i];
            
        }
        
        n=n+found;
        return new int[] {found,n};
    }
}