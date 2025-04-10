class Solution {
    public int countSegments(String s) {
        if(s.equals(""))
            return 0;
        String[] a=s.split(" ");
        return a.length;
    }
}