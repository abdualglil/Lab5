public class SinglyLinklist <E>{
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public SinglyLinklist() {
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int Size() {
        return size;
    }
    public E frist(){
        if (isEmpty()) return null;
        else return head.getElement();
    }
    public E last(){
        if (isEmpty()) return null;
        else return tail.getElement();
    }
    public void addfrist(E element){
        head=new Node<>(element,head);
        if (size==0)tail=head;
        size++;
    }
    public void addliast(E elemnt){
        Node<E> newst=new Node<>(elemnt,null);
        if (size==0) head=newst;
        else tail.setNext(newst);
        tail=newst;
        size++;
    }
    public E removfrist(){
        if (isEmpty())return null;
        E delet=head.getElement();
        head=head.getNext();
        size--;
        if (size==0) tail=null;
        return delet;
    }
    public String print(){
        Node<E> i=head;
        String all="";
        while (i!=null){
            all=all+i.getElement().toString()+"\n";
            i=i.getNext();
        }
        return all;
    }

    static private class Node<E>{
      private E element;
       private Node<E> next;

       public Node(E element, Node<E> next) {
           this.element = element;
           this.next = next;
       }

       public E getElement() {
           return element;
       }

       public void setElement(E element) {
           this.element = element;
       }

       public Node<E> getNext() {
           return next;
       }

       public void setNext(Node<E> next) {
           this.next = next;
       }
   }

}
