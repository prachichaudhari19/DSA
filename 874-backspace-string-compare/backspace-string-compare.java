class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '#'){
                stackS.push(ch);
            }else if(!stackS.isEmpty()){
                 stackS.pop();
            }
        }
            for( int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch != '#'){
                stackT.push(ch);
            }else if(!stackT.isEmpty()){
                 stackT.pop();
            }
            }
        
            return stackS.equals(stackT);
    }
}