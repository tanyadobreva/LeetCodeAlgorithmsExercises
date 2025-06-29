class Solution {
    public boolean isPalindrome(int x) {
        String s =Integer.toString(x);
        StringBuffer sBuf = new StringBuffer();
      
        for (int i = s.length()-1; i>=0; i--){
            sBuf.append(s.charAt(i));
        }
        String res = sBuf.toString();
        if (res.equals(s)){
            return true;
        }
        return false;
    }
}