class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for(int student : students){
            if(student==0){
                count[0]++;
            }else{
                count[1]++;
            }
        }

        for(int sandwich: sandwiches){
            if(sandwich==0 && count[0]!=0){
                count[0]--;

            }else if(sandwich==1 && count[1]!=0){
                count[1]--;
            }else{
                return count[0]+count[1];
            }
        }

        return 0;
    }
}