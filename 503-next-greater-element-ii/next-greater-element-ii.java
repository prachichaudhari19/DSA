class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        // Answer array
        int[] ans = new int[n];

        // Initialize all answers to -1
        Arrays.fill(ans, -1);

        // Stack stores indices
        Stack<Integer> stack = new Stack<>();

        // Traverse the array twice
        for (int i = 0; i < 2 * n; i++) {

            // Convert i into a valid index (circular array)
            int index = i % n;

            // If current element is greater than the element
            // at the index on top of the stack
            while (!stack.isEmpty() &&
                   nums[index] > nums[stack.peek()]) {

                // Pop the waiting index
                int prevIndex = stack.pop();

                // Store the next greater element
                ans[prevIndex] = nums[index];
            }

            // Push indices only during the first traversal
            if (i < n) {
                stack.push(index);
            }
        }

        return ans;
    }
}