class Solution {
    public int[] rearrangeArray(int[] nums) {

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for (int i : nums) {
            if (i >= 0) {
                pos.add(i);
            } else {
                neg.add(i);
            }
        }

        int[] ans = new int[nums.length];
        int posIndex = 0;
        int negIndex = 0;


        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = pos.get(posIndex++);
            } else {
                ans[i] = neg.get(negIndex++);
            }
        }

        return ans;
    }
}