public class MyLinkedList{
  private int size;
  private Node start,end;

  public int size() {
    return size;
  }

  public boolean add(int value){
    size++;
    Node piece = new Node(value,null,end);
    return true;
  }

  public String toString(){
    String result = "[";
    for(Node i = start; i < end; i = i.next){
      result += i + ",";
      if(i == end.prev){
        result += "]";
      }
    }
    return result;
  }
}
