class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character, Integer> need = new HashMap<>();

        for(char c : t.toCharArray()){
            need.put(c, need.getOrDefault(c,0) + 1);
        }


        Map<Character, Integer> window = new HashMap<>();
        int have = 0, needCount = need.size(), left = 0, minlength = Integer.MAX_VALUE, resStart = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if(need.containsKey(c) && window.get(c).equals(need.get(c))){
                have++;
            }

            while(have == needCount){
                if((right -left + 1) < minlength ){
                    minlength = right - left + 1;
                    resStart = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar)- 1);
                if(need.containsKey(leftChar) && need.get(leftChar) > window.get(leftChar)){
                    have--;
                }
                left++;
            }
        }

        return minlength == Integer.MAX_VALUE ? "" : s.substring(resStart, minlength+resStart);
    }
}
