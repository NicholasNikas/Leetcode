class Solution {
    public String reverseWords(String s) {
        
        String[] sent = s.split(" ");
        StringBuilder sb=new StringBuilder();
        
        for (int i=sent.length-1; i>=0; i--){
            if (!sent[i].equals("")){
                   sb.append(sent[i] + " ");
            }      
        }
        return sb.toString().trim();
    }
}
