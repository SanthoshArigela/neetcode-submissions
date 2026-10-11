class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> a=new HashMap<>();
        for(String i:strs){
            char[] c=i.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            a.putIfAbsent(s,new ArrayList<>());
            a.get(s).add(i);
        }
        return new ArrayList<>(a.values());
    }
}
