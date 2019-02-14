class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        if (data == null) {
            return "null";
        } else return "" + data;
    }
}


class SListIterator<T> {
    Node<T> current;
    Node<T> head;

    SListIterator(Node<T> head) {
        this.head = head;
        current = head;
    }

    /**
     * This method changes the current to next node and returns it.
     *
     * @return
     */

    public Node<T> next() {
        current = current.next;
        return current;
    }

    /**
     * This method returns true if there is another node after current node,else it returns false.
     *
     * @return
     */
    public boolean hasNext() {
        return current.next != null;
    }

    /**
     * This method inserts the newnode with data passed as parameter at the end of the linkedlist.
     *
     * @param data
     */
    public void insert(T data) {
        current.next = new Node<T>(data);
        current = current.next;
        System.out.println("Inserted " + data);
    }

    /**
     * This method removes the last node from the end of the linkedlist.
     */
    public void remove() {
        Node<T> temp = head;
        if (temp.next == null) {
            System.out.println("The list is already empty");
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        current = temp;
        System.out.println("removing " + temp.next.data);
        temp.next = null;
    }
}


class SList<T> {

    Node<T> head = new Node<T>(null);

    SListIterator<T> iterator() {
        return new SListIterator<T>(head);
    }


    public String toString() {
        if (head.next == null)
            return "The list is Empty";

        SListIterator<T> it = iterator();
        String string = "";
        while (it.hasNext()) {
            string = string + it.next() + "->";
        }
        return string + "null";
    }

}


public class SingleLinkedList {
    public static void main(String[] arg) {
        SList<Integer> list = new SList<Integer>();
        SListIterator it = list.iterator();
        System.out.println(list);       //printing list initally
        it.insert(100);                //inserting 100

        System.out.println(list);       //printing after insertion 100
        it.insert(101);                //inserting 101

        System.out.println(list);      //printing after insertion 101
        it.insert(102);                //inserting 102

        System.out.println(list);       //printing after insertion 102
        it.remove();                    //removing

        System.out.println(list);       //printing after removing

        it.remove();
        it.remove();
        it.remove();                     //trying to remove after empty

    }
}





/**
Output

The list is Empty
Inserted 100
100->null
Inserted 101
100->101->null
Inserted 102
100->101->102->null
removing 102
100->101->null
removing 101
removing 100
The list is already empty

*/
