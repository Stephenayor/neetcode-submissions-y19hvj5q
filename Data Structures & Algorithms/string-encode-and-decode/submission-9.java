class Solution {

    public String encode(List<String> strs) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0; i<strs.size(); i++){
                stringBuilder.append(strs.get(i).length());
                stringBuilder.append('#');
                stringBuilder.append(strs.get(i));
            }
            return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while('#' != str.charAt(j)){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            int start = j+1;
            int end = j+1+length;

            String word = str.substring(start, end);
            decodedString.add(word);

             i = j+1+length;
        }
        return decodedString;
    }
}
