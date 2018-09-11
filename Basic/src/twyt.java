
import java.util.ArrayList;
import java.util.Collections;

public class twyt {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();

    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("C");
    arrayList.add("D");
    arrayList.add("E");

    System.out.println(arrayList);
    Collections.swap(arrayList, 2, 1);
    System.out.println(arrayList);
  }
}
