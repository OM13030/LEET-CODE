class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count  = 0;
        for(int i = low; i <= high; i++){
            String s = String.valueOf(i);

            if(s.length() % 2 != 0){
                continue;
            }

            int firstSum = 0;
            int secondsum = 0;
            int half = s.length() / 2;
            for(int j = 0; j < half; j++){
                firstSum += s.charAt(j)-'0';
            }
            for(int j = half; j < s.length(); j++){
                secondsum += s.charAt(j)-'0';
            }
            if(firstSum == secondsum){
                count++;
            }
        }
        return count;
    }
}