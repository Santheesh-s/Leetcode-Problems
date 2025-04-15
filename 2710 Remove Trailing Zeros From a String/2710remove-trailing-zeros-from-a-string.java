class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder s=new StringBuilder(num);
        s.reverse();
        int n=String.valueOf(Integer.parseInt(s.toString())).length();
        return num.substring(0,n);
    }
}