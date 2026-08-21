class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }
        char [] s1CharArray = s1.toCharArray();
        Arrays.sort(s1CharArray);

        for(int i = 0, j = s1.length(); j <= s2.length(); i++, j++){
            char [] substringCharArray = (s2.substring(i, j)).toCharArray();
            Arrays.sort(substringCharArray);

            if(Arrays.equals(s1CharArray, substringCharArray)){
                return true;
            }

        }

        return false;
    }
}
