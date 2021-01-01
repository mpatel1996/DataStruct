import java.util.Random;

public class Test {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      Random rnd = new Random();

      for (int i = 0; i < 9; i++) {
         list.add(list, rnd.nextInt(5));
      }
      list.printList(list);

      list.deleteByKey(list, 4);

      list.printList(list);

   }
}
