class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
       
        int[] result=new int[k];
        HashMap<Integer, Integer> map=new HashMap<>();

        PriorityQueue<Integer> helper = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b) 
        );
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
