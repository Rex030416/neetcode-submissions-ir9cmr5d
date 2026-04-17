class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        PriorityQueue<Integer> helper=new PriorityQueue<>((a,b)->b-a);
        int[] result=new int[k];
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int j:map.keySet()){
            helper.offer(j);
            if(helper.size()>k){
                helper.poll();
            }
        }

        for(int i=0;i<k;i++){
            result[i]=helper.poll();
        }

        return result;




    }
}
