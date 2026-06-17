class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int flag = 0;
        for(int number : nums){
            if(number==1){
                flag++;
            }else{
                if(max<flag) max=flag;
                flag=0;
            }
        }

        return Math.max(max,flag);
    }
}