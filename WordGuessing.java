public class WordGuessing {
    private String secret;
    private String guess;

    public WordGuessing(String s, String g){
        secret = s;
        guess = g;
    }

    public void updateGuess(String letter){
        String guess.indexOf(letter);
    }

    public String getProgress(){
        return guess;
    }

    
}
