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
    for(int i = 0; i < size; i++){
      result += start.getNext();
      if(i != size - 1){
        result += ",";
      }
    }
    return result;
}
}
