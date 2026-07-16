class Solution {
    public boolean isFascinating(int n) {
        String n1 = String.valueOf(n);
        String n2 = String.valueOf(n*2);
        String n3 = String.valueOf(n*3);
        String fstr = n1 + n2 + n3;
        int len = fstr.length();
        if(len != 9){
            return false;
        }
        for(int i = 0; i < len; i++){
            char ch = fstr.charAt(i);
            if(ch == '0'){
                return false;
            }
            for(int j = i+1; j < len; j++){
                if(fstr.charAt(j) == fstr.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}