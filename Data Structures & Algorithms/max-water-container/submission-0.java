class Solution {
    public int maxArea(int[] arr) {
        int i=0,j=arr.length-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            int height=Math.min(arr[i],arr[j]);
            int width=j-i;
            max=Math.max(max,height*width);
            if(arr[i]-arr[j]<0) i++;
            else j--;
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}
