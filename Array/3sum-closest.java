class Solution {
    public int threeSumClosest(int[] nums, int target) {
          Arrays.sort(nums);
          int minsum=nums[0]+nums[1]+nums[2];
          for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])continue;

            int start=i+1, end=nums.length-1;

            while(start<end){
            int cursum=nums[i]+nums[start]+nums[end];

            if(Math.abs(target-cursum)<=Math.abs(target-minsum)){
                minsum=cursum;
            }

            if(cursum>target){
                end--;
            }
            else{
                start++;
            }

            }
          }
          return minsum;
    }
}
