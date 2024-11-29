class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int lastIndex = arr.length-1;
        int lastStringLength = arr[lastIndex].length();
        return lastStringLength;
    }
}