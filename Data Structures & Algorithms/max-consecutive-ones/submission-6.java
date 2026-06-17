class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int flag = 0;
        for(int number : nums){
            if(number==1){
                flag++;
                max=Math.max(max,flag);
            }else{
                
                flag=0;
            }
        }

        return max;
    }
}