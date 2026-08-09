class Solution {
    public int majorityElement(int[] arr) {
    int count =0;
    int max=0;
    for(int i : arr){
        if(count ==0){
            max = i;
        }
        count += ((i == max) ? 1 : -1);
    }
    return max;
}

}