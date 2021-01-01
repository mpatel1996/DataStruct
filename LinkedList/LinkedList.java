// import java.io.*;

// Creating a Class for Linked List Nodes
class LinkedList {

   Node head;

   class Node {
      int data;
      Node next;

      // Construct of the class Node to create a new node
      Node(int d) {
         data = d;
         next = null;
      }
   }

   public LinkedList insert(LinkedList list, int data) {

      // Create new Node to insert with data being passed
      Node newNode = list.new Node(data);
      // Make sure its next is pointing to null
      newNode.next = null;

      // If list.head is null, make the new node there, else traverse down the list
      if (list.head == null)
         list.head = newNode;
      else {
         Node last = list.head;
         while (last.next != null) {
            last = last.next;
         }

         last.next = newNode;
      }
      return list;
   }

   public void printList(LinkedList list) {

      Node currNode = list.head;

      System.out.println("Linked List: ");

      while (currNode != null) {
         System.out.print(currNode.data + " ");
         currNode = currNode.next;
      }
   }

   public LinkedList deleteByKey(LinkedList list, int key) {
      Node currNode = list.head;
      Node prev = null;
      // CASE 1
      // if the key is the head
      if (currNode != null && currNode.data == key) {
         list.head = currNode.next;

         System.out.println("key found and deleted");
         return list;
      }
      // CASE 2
      // If the key is anything but the head
      while (currNode != null && currNode.data != key) {
         prev = currNode;
         currNode = currNode.next;
      }

      if (currNode != null) {
         prev.next = currNode.next;
         System.out.println("Key found and deleted");
      }

      // CASE 3
      // Key is not found
      if (currNode == null)
         System.out.println("key not in list");

      return list;
   }

}
