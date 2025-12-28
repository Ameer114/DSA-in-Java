class Solution {
    public int maxArea(int[] height) {
      int start=0, end=height.length-1;
    int maxvol=0;
      while(start<end){
        int volume=Math.min(height[start],height[end])*(end-start);
        maxvol=Math.max(maxvol,volume);
        if(height[start]<height[end])
        start++;
        else
        end--;
      }
      return maxvol;
    }
}
