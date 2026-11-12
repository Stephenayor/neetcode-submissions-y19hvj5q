class Solution {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String str: strs){
            stringBuilder.append(str.length());
            stringBuilder.append('#');
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
         List<String> decodedString = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            int start = j+1;
            int end = start + length;

            String word = str.substring(start, end);
            decodedString.add(word);
            i = end;
        }
        return decodedString;
    }
}
