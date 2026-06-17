class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i=0; i<s.length(); i++){
            stack1.push(s.charAt(i));
        }

        while(!stack1.isEmpty()){
            char top = stack1.pop();
            if(top =='}' || top == ')' || top==']'){
                stack2.push(top); continue;
            } else if(top == '('){
                if(!stack2.isEmpty() && stack2.pop()==')')  continue ;
                else return false;
            }else if(top == '{'){
                if(!stack2.isEmpty() && stack2.pop()=='}')  continue ;
                else return false;
            }else if(top == '['){
                if(!stack2.isEmpty() && stack2.pop()==']')  continue ;
                else return false;
            }
        }

        if(stack2.isEmpty())
        return true;
        else return false;

    }
}
