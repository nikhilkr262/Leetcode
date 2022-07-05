class Solution {
    public int strStr(String haystack, String needle) {
        int b=needle.length();
        for (int i = 0; i < haystack.length()-b+1; i++){
            String s=haystack.substring(i,i+b);
            if(s.equals(needle)){
                return i;
            }            
        }
        return -1;        
    }
}
