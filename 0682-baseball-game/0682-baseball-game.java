class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String c:operations){
            switch(c){
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2*stack.peek());
                    break;
                case "+":
                    int a=stack.pop();
                    int b=stack.peek();
                    stack.push(a);
                    stack.push(a+b);
                    break;
                default:
                    stack.push(Integer.parseInt(c));

            }
        }
        int s=0;
        for(int i:stack){
            s+=i;
        }
        return s;
    }
}