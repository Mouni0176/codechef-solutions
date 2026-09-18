class Solution {
public int[] findMinMax(int n, int[] arr) {
    int mini = Integer.MAX_VALUE;
    int maxi = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        maxi = Math.max(maxi,arr[i]);
        mini = Math.min(mini,arr[i]);
    }
    
    return new int[]{mini,maxi};
}
}