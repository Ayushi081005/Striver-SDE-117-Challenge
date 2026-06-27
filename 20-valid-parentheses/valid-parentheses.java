class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                ss.push(s.charAt(i));
            }else{
                if(ss.isEmpty()){
                    return false;
                }

                if(s.charAt(i) == ')' && ss.peek() != '('){
                    return false;
                }

                if(s.charAt(i) == ']' && ss.peek() != '['){
                    return false;
                }

                if(s.charAt(i) == '}' && ss.peek() != '{'){
                    return false;
                }

                ss.pop();
            }
        }

        if(ss.isEmpty()){
            return true;
        }

        return false;
    }
}