class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        for(char ch : s1.toCharArray()){
            map.put(ch,1);
        }
        for(char ch : s2.toCharArray()){
            map.put(ch,2);
        }
        for(char ch : s3.toCharArray()){
            map.put(ch,3);
        }

        ArrayList<String> ans = new ArrayList<>();
        for(String word : words){
            String lower = word.toLowerCase();
            int row = map.get(lower.charAt(0));
            boolean valid = true;

            for(int i = 0; i <= lower.length()-1; i++){
                if(map.get(lower.charAt(i)) != row){
                    valid = false;
                    break;
                }
            }

            if(valid){
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);

    }
}