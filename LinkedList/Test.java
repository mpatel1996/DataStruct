import java.util.Random;

public class Test {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      Random rnd = new Random();

      for (int i = 0; i < 9; i++) {
         list.add(rnd.nextInt(5));
      }

      list.printList(list);
      list.deleteByKey(7);
      list.printList(list);
      list.deleteAtPosition(1);
      list.printList(list);

   }
}
