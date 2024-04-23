import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> words;
  public RandomStringChooser(String [] inputwords){
    //initializing
    words = newArrayList<>();
    for(String singleWord : inputWords){
      words.add(singleWord);
    }
}
  public String getNext(){
    if (words.size()>0){
      return words.remove((int)(Math.random() * words.size()));
    }
    return "NONE";
  }
}
