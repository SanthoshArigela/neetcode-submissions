class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        int c=Integer.MIN_VALUE;
        int k=nums[0];
        for(Map.Entry<Integer,Integer> i:a.entrySet()){
            if(i.getValue()>c){
                c=i.getValue();
                k=i.getKey();
            }
        }
        // System.out.println(k);
        return k;
    }
}