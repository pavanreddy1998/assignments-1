
class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
        this.next=null;
    }
    public String toString(){
        if(data==null){
            return "null";
        }
        else return ""+data;
    }
}
class SList<T>{
Node<T> head=new Node<T>(null);
    SListIterator<T> iterator () {
        return new SListIterator< T > (head);
    }
public String toString() {
    if (head.next == null)
        return "The list is Empty";


    SListIterator<T> it = iterator();
    String str = "";
    while (it.hasNext()) {
        str = str + it.next() + "->";
    }
    return str+"null";
  }
}

class SListIterator<T>{
    Node<T> cur;
    Node<T> h;
    SListIterator(Node<T> head){
        h=head;
        cur=head;
    }
    public Node<T> next(){
        cur=cur.next;
        return cur;
    }
    public boolean hasNext(){
        if(cur.next==null)
            return false;
        else return true;
    }
    public void insert(T data){
        cur.next=new Node<T>(data);
        cur=cur.next;
        System.out.println("Inserted "+data);
    }
    public void remove(){
        Node<T> temp=h;
        if(temp.next==null) {
            System.out.println("The list is already empty");
            return;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        cur=temp;
        System.out.println("removing "+temp.next.data);
        temp.next=null;
    }
}
public class SingleLinkedList {
    public static void main(String arg[]){
   SList<Integer> list=new SList<Integer>();
   SListIterator it=list.iterator();
        System.out.println(list);       //printing list initally
        it.insert(100);            //inserting 100

        System.out.println(list);       //printing after insertion 100
        it.insert(101);            //inserting 101

        System.out.println(list);      //printing after insertion 101
        it.insert(102);           //inserting 102

        System.out.println(list);       //printing after insertion 102
        it.remove();                    //removing

        System.out.println(list);         //printing after removing

       it.remove();;
       it.remove();
       it.remove();                     //trying to remove after empty

    }
}