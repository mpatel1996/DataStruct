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

      System.out.print("Linked List: ");

      while (currNode != null) {
         System.out.print(currNode.data + " ");
         currNode = currNode.next;
      }
   }

   public void deleteByKey(int key) {
      Node currNode = head;
      Node prev = null;

      // CASE 1
      // if the key is the head
      if (currNode != null && currNode.data == key) {
         head = currNode.next;

         System.out.printf("\n\nkey %d found and deleted\n", key);
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
         System.out.printf("\n\nkey %d found and deleted\n", key);
      } else if (currNode == null)
         System.out.printf("\n\nkey %d not found\n", key);
   }

   public void deleteAllKeys(int key) {
      Node currNode = head;
      Node prev = null;
      int counter = 0;
      if (currNode == null)
         System.out.println("List is Empty");

      while (currNode != null) {
         if (pos == 0) {
            head = currNode.next;
            System.out.printf("\n\nData at %d deleted\n", pos);
            break;
         } else if (pos == counter) {
            prev.next = currNode.next;
            System.out.printf("\n\nData at %d is deleted\n", pos);
            break;
         } else {
            prev = currNode;
            currNode = currNode.next;
            counter++;
         }
      }
      // // CASE 1
      // // if the key is the head
      // if (currNode != null && currNode.data == key) {
      // // head = currNode.next;
      // prev = currNode;
      // currNode = currNode.next;
      // System.out.printf("\n\nkey %d found and deleted\n", key);
      // }
      // while (currNode != null || currNode.data != key) {
      // prev = currNode;
      // currNode = currNode.next;
      // System.out.println("In if");
      // }
      // if (key == currNode.data) {
      // prev.next = currNode.next;
      // System.out.println("IN ELSE IF");
      // }

      // if (currNode == null)
      // System.out.println("List is Empty or all keys deleted");
   }

   public void deleteAtPosition(int pos) {

      Node currNode = head;
      Node prev = null;
      int counter = 0;
      // CASE 1
      // if the pos is 0, delete the head
      // if (currNode != null && pos == 0) {
      // head = currNode.next;
      // System.out.printf("\n\nData at %d deleted\n", pos);
      // }

      // CASE 2 && 3
      // If position > 0 and less than list length
      // ELSE print error. Position out of bound

      while (currNode != null) {
         if (pos == 0) {
            head = currNode.next;
            System.out.printf("\n\nData at %d deleted\n", pos);
            break;
         } else if (pos == counter) {
            prev.next = currNode.next;
            System.out.printf("\n\nData at %d is deleted\n", pos);
            break;
         } else {
            prev = currNode;
            currNode = currNode.next;
            counter++;
         }
      }

      if (currNode == null && counter == 0) {
         System.err.print("\n\nList is Empty\n");
      } else {
         System.out.println("\nIndex out of bound. Cannot delete.");
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
         System.out.printf("\n\nLinked List contains %d", key);
      } else {
         System.out.printf("\n\nLinked List does not Contain %d", key);
      }
   }

   /*
    * getPos: INPUT: Int OUTPUT: None Return: True/False if the key is in the
    * linked list. Returns first match
    */
   public int getPos(int key) {
      Node currNode = head;
      int counter = 0;

      while (currNode != null) {
         if (currNode.data == key) {
            break;
         } else {
            currNode = currNode.next;
            counter++;
         }
      }

      if (currNode == null)
         System.out.println("List is Empty");
      return counter;
   }

}
