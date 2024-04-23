import java.util.*;
public class RandomStringChooser
{
  private ArrayList<string> words;
  public RandomStringChooser(String [] inputwords){
    //initializing
    words = newArrayList<>();
    for(String word : inputWords){
      words.add(word);
    }
}
  public String getNext(){
    if (words.size()>0){
      return words.remove((int)(Math.random() * words.size()));
    }
    return "NONE";
  }
}
