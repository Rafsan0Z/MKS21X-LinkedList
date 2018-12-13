public class MyLinkedList{
  private int size;
  private Node start,end;

  public int size() {
    return size;
  }

  public boolean add(int value){
    if(end == null){
      end = new Node(end, value);
      return true;
    }
    else{
      return false;
    }
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
