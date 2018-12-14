public class HiddenWord {
    private String word;
    public HiddenWord(String x){
        word = x;
    }
    public String getHint(String guess){
        String result = "";
        for(int i = 0; i < guess.length(); i++){
            if(guess.substring(i,i+1).equals(word.substring(i,i+1))){
                result += guess.substring(i,i+1);
            } else {
                if(word.contains(guess.substring(i,i+1))){
                    result += "+";
                } else {
                    result += "*";
                }
            }
        }
        return result;
    }
}
