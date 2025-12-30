class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for(int i: arr)
            count[i]++;
        
        int max=-1;
        for (int i=1;i<count.length;i++){
            if(count[i]==i)
            max=i;
        }
        return max;
        
    }
}

//this is not optimal
// class Solution {
//     public int findLucky(int[] arr) {
//         int lucky=-1;
//         Arrays.sort(arr);
//         int count=1;
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]==arr[i-1]){
//                 count+=1;
//             }
//             else if(count==arr[i-1]){
//                 lucky=count;
//                 count=1;
//              }
//              else
//              count=1;
            
//         }
//         if(count==arr[arr.length-1]){
//             lucky=count;
//         }
//         return lucky;
//     }
// }
