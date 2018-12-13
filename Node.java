public class Node{
  private int data;
  private Node next,prev;

  public Node(int value, Node n, Node p){ // For creating new node for adding
    next = n;
    prev = p;
    data = value;
  }

  public Node getNext(){ // This get is for the Node
    return next;
  }

  public int get(){ // This get is for integer data
    return data;
  }

  public void setPrev(Node P){ // Set previous Node
    prev = P;
  }

  public void setNext(Node N){ // Set the next Node
    next = N;
  }
}
