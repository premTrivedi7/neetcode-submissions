class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            int max = -1;
            
            for(int k = i+1; k<arr.length; k++){
                max= Math.max(max, arr[k]);
            }
            arr[i] = max;
            
        }
        return arr;
    }
}