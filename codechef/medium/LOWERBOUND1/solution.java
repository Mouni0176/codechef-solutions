 static int solve(int[] nums, int x) {
    int left = 0;
    int right = nums.length-1;
    for(int i=0;i<nums.length;i++){
        int mid =(left+right)/2;
        if(nums[mid] == x){
            return mid+1;
        }
        else if(nums[mid]<x){
            left = mid+1;
        }
        else{
            right = mid-1;
        }
    }
    return right+1;
 }