#使用HashSet不重複收集物件
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int rest=0, left=0, right=0;
        HashSet<Character> t = new HashSet<Character>();
        while(right<s.length()){
            if(!t.contains(s.charAt(right))){
                t.add(s.charAt(right++));
                rest=Math.max(rest, t.size());
            }
            else{t.remove(s.charAt(left++));}
        }
        return rest;
        
    }
}