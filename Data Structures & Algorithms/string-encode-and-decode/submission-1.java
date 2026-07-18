class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String str : strs){
            encodedString.append(str);
            encodedString.append('😊');
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<String>();
        StringBuilder strings = new StringBuilder();  
        for(char character : str.toCharArray()){
            if(character == '😊'){
                decodedList.add(strings.toString());
                strings.delete(0, strings.length());
                continue;
            }
            strings.append(character);
        }
        return decodedList;
    }
}
