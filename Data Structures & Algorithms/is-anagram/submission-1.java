class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        ArrayList <Character> stringS = s.chars()
                                        .mapToObj(c -> (char)c)
                                        .collect(Collectors.toCollection(ArrayList::new));

        ArrayList <Character> stringT = t.chars()
                                        .mapToObj(c -> (char)c)
                                        .collect(Collectors.toCollection(ArrayList::new));

        Collections.sort(stringS);
        Collections.sort(stringT);

        if(stringS.equals(stringT)){
            return true;
        } else {
            return false;
        }
    }
}
