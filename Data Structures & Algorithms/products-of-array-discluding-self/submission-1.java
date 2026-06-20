class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prd=1,cnt=0;
        boolean found=false;
        for(Integer i:nums){
            if(i!=0)
                prd*=i;
            else{
                cnt++;
                found=true;
            }
        }
        if(cnt>1) return new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(found==true){
                if(nums[i]==0) nums[i]=prd;
                else nums[i]=0;
            }else
                nums[i]=prd/nums[i];
        }
        return nums;
    }
}  
