class Solution {
    public char binarySearch(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start <= end){

            int mid = (start + end) / 2;

            if(letters[mid] <= target){
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        if(start == letters.length){
            return '0';
        }
        return letters[start];
        
    }
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = binarySearch(letters , target);
        if(ans == '0'){
            return letters[0];
        }
        return ans;
    }
}