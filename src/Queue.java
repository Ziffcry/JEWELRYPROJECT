public class Queue extends LinkedList {
      public Queue(){
        super();
      }

      public void enqueue(Object elem){
        super.insertAtBack(elem);
      }

      public Object dequeue(){
        return super.removeAtFront();
      }

      public Object getFront(){
        return super.getFirst();
      }

      public Object getEnd(){
        Object obj = super.removeAtBack();
        insertAtBack(obj);
        return obj;
    }
}
