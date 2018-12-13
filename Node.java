public class Node{
  private int data;
  private Node next,prev;

  public Node(int value, Node n, Node p){
    next = n;
    prev = p;
    data = value;
  }

  public Node getNext(){
    return next;
  }

  public int get(){
    return data;
  }
}
