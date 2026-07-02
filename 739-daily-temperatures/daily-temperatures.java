class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int []ans = new int[temp.length];
           
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
              int previndex = stack.pop();
              ans[previndex] = i - previndex;

            }
            stack.push(i);
        }
        return ans;
    }
}