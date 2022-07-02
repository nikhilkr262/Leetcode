class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='(' || x=='[' || x=='{'){
                stack.push(x);
                continue;                
            }
            if(stack.isEmpty()){
                return false;
            }
            char j;
            switch(x)
            {
                case ')':
                    j=stack.pop();
                    if(j=='{' || j=='[')
                        return false;
                    break;
                case '}':
                    j=stack.pop();
                    if(j=='(' || j=='[')
                        return false;
                    break;
                case ']':
                    j=stack.pop();
                    if(j=='(' || j=='{')
                        return false;
                    break;
            }
            }
        return stack.isEmpty();
        }       
        
    }