public class LinkedList {
    private Node start;
    private Node current;
    private Node last;

    public LinkedList(){
        this.start =  null;
        this.current = null;
        this.last = null;
    }
    public boolean isEmpty(){
        return (start==null);
    }

    public void insertAtBack(Object obj) {
        Node newNode = new Node(obj);

        if(isEmpty()) {
            start =  newNode;
            last  = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
    }

    public Object getFirst() {

        if (isEmpty()) {
            return null;
        }
        else {
            current = start;
            return current.data;
        }
    }

    public Object getNext() {
        if (current.next == null) {
            return null;
        } else {
            current = current.next;
            return current.data;
        }
    }

    public Object removeAtFront() { 
        Object removedItem = null;
        if(isEmpty()){
            return removedItem;
        }
        removedItem = start.data;
        if(start.next == null){
            start = null;          
        }
        else
           start = start.next;
       return removedItem;
    } 

    public Object removeAtBack(){
      Object removedItem = null;
      if(isEmpty()){
        return removedItem;
      }
      removedItem = last.data;
      if (start == last) {
        start = null;
        last = null;
      }
      else{
        current = start;
        while (current.next != last) {
            current = current.next;
            
        }
            last = current;
            last.next = null;
      }

      return removedItem;
    }


    public Object removeData(Object obj){
        Object removedItem = null;

        if (isEmpty()) {
            return removedItem;
        }

        if (start.data.equals(obj)) {
            removedItem = start.data;
            start = start.next;

            if (start == null) {
                last = null;
            }

            return removedItem;
        }

        current = start;

        while (current.next != null && !current.next.data.equals(obj)) {
            current = current.next;
        }

        if (current.next != null) {
            removedItem = current.next.data;
            current.next = current.next.next;

            if (current.next == null) {
                last = current;
            }
        }

        return removedItem;
    }

    public Object searchObject(Object obj){
       Object item = null;

        if (isEmpty()) {
            return item;
        }

        if (start.data.equals(obj)) {
            item = start.data;
            return item;
        }

        current = start;

        while (current.next != null ) {
            if (current.next.data.equals(obj)){
                 return item;
            }
            current = current.next;
        }
        return item;
    }

    public int countObject(LinkedList list){
      int count = 0;
      Object temp = list.getFirst();
      while (temp != null) {
        count++;
        temp = list.getNext();
      }
      return count;
    }

}