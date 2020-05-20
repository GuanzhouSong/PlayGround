import java.util.Stack;

class Solution {

    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int cur = T[i];
            if(stack.isEmpty() || cur<= stack.peek()){
                stack.push(i);
            }else{
                while(!stack.isEmpty() && cur>stack.peek()){
                    int prev = stack.pop();
                    res[prev] = i - prev;
                }
                stack.push(i)
;            }


        }

        return res;
    }
}