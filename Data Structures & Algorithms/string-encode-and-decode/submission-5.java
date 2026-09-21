class Solution {

    public String encode(List<String> strs) {
            //Iterate over the string and concatenate them together
            StringBuilder encoded = new StringBuilder();
            for(String str: strs){
                encoded.append(str.length());
                encoded.append("#");
                encoded.append(str);
            }

            return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int j = i;
        //Get the length
        while(str.charAt(j) != '#'){
            j++;
        }

        int length = Integer.parseInt(str.substring(i, j));

        //Get the word
        String word = str.substring(j+1, j+1+length);
        result.add(word);

         i = j+1+length;
    
    }
      return result;
     
    }
}
