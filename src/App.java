import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
      List<String> fruits1 =  new ArrayList<>();
      fruits1.add("Morango");
      fruits1.add("Uva");
      fruits1.add("Maçã");
      fruits1.add("Banana");
      fruits1.add("Manga");
      
      List<String> fruits2 = new ArrayList<>();
      fruits2.add("Abacate");
      fruits2.add("Banana");
      fruits2.add("Mamão");
      fruits2.add("Morango");
      fruits2.add("Pêra");

      List<String> returnArray = new ArrayList<>();

      for (int i = 0; i < fruits1.size(); i++) {
        if (fruits2.contains(fruits1.get(i))) {
          returnArray.add(fruits1.get(i));
        }
      }

      System.out.println(returnArray);
    }
}
