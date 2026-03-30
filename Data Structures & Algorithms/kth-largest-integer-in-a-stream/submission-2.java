class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int len;


    public KthLargest(int k, int[] nums) {
        this.len=k;
        this.minHeap=new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size()>len){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
