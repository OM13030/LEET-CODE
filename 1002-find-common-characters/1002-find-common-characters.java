class Solution {
    public List<String> commonChars(String[] words) {
        int[] csf = new int[26];
        String firstword = words[0];
        for(char ch : firstword.toCharArray()){
            csf[ch - 'a']++;
        }

        for(int i = 1; i < words.length; i++){
            int[] curr = new int[26];
            String currword = words[i];
            for(char ch : currword.toCharArray()){
                curr[ch - 'a']++;
            }
            for(int j = 0; j < 26; j++){
                csf[j] = Math.min(csf[j], curr[j]);
            }
        }
        List<String> res = new ArrayList<>();

        for(int j = 0; j < 26; j++){
            if(csf[j] != 0){
                char c = (char)(j + 97);
                int count = csf[j];
                while(count > 0){
                    res.add("" + c);
                    count--;
                }
            }
        }
        return res;


    }
}