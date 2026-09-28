class Solution {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String str:strs){
            stringBuilder.append(str.length());
            stringBuilder.append('#');
            stringBuilder.append(str);
        }
       return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

            int i = 0;
            while(i<str.length()){
                int j = i;
                while(str.charAt(j) != '#'){
                    j++;
                } 
                int length = Integer.parseInt(str.substring(i, j));
                i = j + 1;
                j = i+length;
                String word = str.substring(i, j);
                result.add(word);
                i = j;
            }
            return result;
    }
}
