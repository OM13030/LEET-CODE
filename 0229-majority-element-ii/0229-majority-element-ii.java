class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();

        // Check which elements appear more than n/3 times
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                ans.add(key);
            }
        }

        return ans;
    }
}