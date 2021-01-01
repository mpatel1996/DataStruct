import java.util.Random;

public class Test {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      // Random rnd = new Random();
      list.add(0);

      for (int i = 0; i < 9; i++) {
         list.add(i);
      }

      list.printList();
      // list.deleteByKey(2);
      // list.printList();
      // System.out.println("-------------");
      list.deleteAtPosition(22);
      // list.printList();
      System.out.println("-------------");
      // list.deleteAllKeys(1);
      list.printList();
      // System.out.println("-------------");
      // list.listHas(3);
      // System.out.println("\nIndex found at " + list.getPos(2));
   }
}
