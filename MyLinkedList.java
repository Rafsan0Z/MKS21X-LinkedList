public class MyLinkedList{
  private int size;
  private Node start,end;

  public int size() { // returns size of LinkedList
    return size;
  }

  public boolean add(int value){ // Not complete
    size++;
    return true;
  }

  public String toString(){ // turns the LinkedList into a String to be printed!
    String result = "[";
    for(int i = 0; i < size; i++){
      result += start.getNext().get();
      if(i != size - 1){
        result += ",";
      }
    }
    return result + "]";
}
}
