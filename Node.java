public class Node{
  private int data;
  private Node next,prev;

  private Node next(){ // This get is for the Node
    return next;
  }

  private Node prev(){
    return prev;
  }

  public int getData(){ // This get is for integer data
    return data;
  }

  public void setPrev(Node P){ // Set previous Node
    prev = P;
  }

  public void setNext(Node N){ // Set the next Node
    next = N;
  }

  public int setData(int i){
    data = i;
    return data;
  }

  public String toString(){
    String result = "" + data;
    return result;
  }
}
