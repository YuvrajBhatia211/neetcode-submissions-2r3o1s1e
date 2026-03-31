class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key:mp.keySet()){
            int freq = mp.get(key);
            if(bucket[freq] ==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] res = new int[k];
        int cnt =0;

        for(int i =bucket.length-1;i>=0&&cnt<k;i--){
            if(bucket[i] != null){
                for(int in :bucket[i]){
                    res[cnt++] = in;
                }
            }
        }
        return res;
    }
}
