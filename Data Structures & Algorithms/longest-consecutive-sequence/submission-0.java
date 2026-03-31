class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int n:nums){
            st.add(n);
        }
        int longest =0;
        for(int i:st){
            if(!st.contains(i-1)){
                int curr=i;
                int cnt=1;
                while(st.contains(curr+1)){
                    curr++;
                    cnt++;
                }
                longest = Math.max(longest , cnt);
            }
        }
        return longest;
    }
}
