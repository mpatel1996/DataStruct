// import java.io.*;

// Creating a Class for Linked List Nodes
class LinkedList {
   Node head;

   class Node {
      int data;
      Node next;

      // Construct of the class Node to create a new node
      Node(int d) {
         this.data = d;
         this.next = null;
      }
   }

   public void add(int data) {

      // Create new Node to insert with data being passed
      Node newNode = new Node(data);
      // Make sure its next is pointing to null
      // newNode.next = null;

      // If list.head is null, make the new node there, else traverse down the list
      if (head == null)
         head = newNode;
      else {
         Node last = head;
         while (last.next != null) {
            last = last.next;
         }

         last.next = newNode;
      }
      // return list;
   }

   public void printList() {

      Node currNode = head;

      System.out.print("\nLinked List: ");

      while (currNode != null) {
         System.out.print(currNode.data + " ");
         currNode = currNode.next;
      }
   }

   public void deleteByKey(int key) {
      Node currNode = head;
      Node prev = null;

      if (currNode == null)
         System.out.println("List Empty");
      // CASE 1
      // if the key is the head
      if (currNode != null && currNode.data == key) {
         head = currNode.next;
         // System.out.printf("\n\nkey %d found and deleted\n", key);
      }

      // CASE 2 && CASE 3
      // If the key is anything but the head delete it
      // ELSE print no key is found
      while (currNode != null && currNode.data != key) {
         prev = currNode;
         currNode = currNode.next;
      }
      if (currNode != null) {
         prev.next = currNode.next;
      }
   }

   public void deleteAtPosition(int pos) {

      Node currNode = head;
      Node prev = null;
      int counter = 0;

      if (currNode == null) {
         System.out.println("\nList Empty.");
      }

      while (currNode != null) {
         if (pos == 0) {
            head = currNode.next;
            // System.out.printf("\n\nData at %d deleted\n", pos);
            break;
         } else if (pos == counter) {
            prev.next = currNode.next;
            // System.out.printf("\n\nData at %d is deleted\n", pos);
            break;
         } else {
            prev = currNode;
            currNode = currNode.next;
            counter++;
         }
      }
   }

   /*
    * listHas: INPUT: Int OUTPUT: None Return: True/False if the key is in the
    * linked list. Returns first match
    */
   public void listHas(int key) {
      Node currNode = head;
      Boolean doesHave = false;

      while (currNode != null) {
         if (currNode.data == key) {
            doesHave = true;
            break;
         } else {
            currNode = currNode.next;
         }
      }

      if (doesHave) {
         System.out.printf("\n\nLinked List contains %d\n", key);
      } else {
         System.out.printf("\n\nLinked List does not Contain %d\n", key);
      }
   }

   /*
    * getPos: INPUT: Int OUTPUT: None Return: True/False if the key is in the
    * linked list. Returns first match
    */
   public int getPos(int key) {
      Node currNode = head;
      int counter = 0;

      if (currNode == null)
         System.out.println("List is Empty");
      while (currNode != null) {
         if (currNode.data == key) {
            break;
         } else {
            currNode = currNode.next;
            counter++;
         }
      }

      return counter;
   }

}
