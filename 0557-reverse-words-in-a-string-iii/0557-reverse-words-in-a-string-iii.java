class Solution {
    public void reverse(char[] arr , int start , int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public String reverseWords(String s) {
        char [] arr = s.toCharArray();
        int start = 0;
        int end  = s.length();
        for(int i = 0; i <= s.length()-1; i++){
            if(arr[i] == ' '){
                reverse(arr, start, i-1);
                start = i+1;
            }
        }

        reverse(arr, start, arr.length-1);
        return new String(arr);
    }
}