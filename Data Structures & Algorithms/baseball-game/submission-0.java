class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String s: operations){
            if(s.equals("+")){
                Integer top = stack.pop();
                Integer newElement = top + stack.peek();
                stack.push(top);
                stack.push(newElement);
            } else if(s.equals("D")){
                stack.push(2*(stack.peek()));
            } else if(s.equals("C")){
                stack.pop();
            } else{
                stack.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        return sum;
    }
}