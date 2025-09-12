class Solution {
    public boolean isValid(String s) {
    Stack<Character> c=new Stack<>();
    for(char ch:s.toCharArray()){
        if(ch=='(' || ch=='[' || ch=='{'){
            c.push(ch);
        }
        else{
            if(c.isEmpty())
            return false;
            if(ch==')' && c.pop()!='(') return false;
            if(ch==']' && c.pop()!='[') return false;
            if(ch=='}' && c.pop()!='{') return false;
        }
    }
    return c.isEmpty();

    }
}