class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int currInt : arr){
            freqMap.put(currInt, freqMap.getOrDefault(currInt, 0) + 1);
        }

        Set<Integer> seen = new HashSet<>();
        for(int currvalue : freqMap.values()){
            if(seen.contains(currvalue)){
                return false;
            }
            else{
                seen.add(currvalue);
            }
        }
        return true;
    }
}