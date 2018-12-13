public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
    size = 0;
    start = end;
  }

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

  public int get(int index){
    return  0;
  }

  public int set(int index, Integer value){
    return 0;
  }

  public boolean contains(Integer value){
    return false;
  }

  public int indexOf(Integer value){
    return 0;
  }

  public void add(int index, Integer value){

  }

  public Integer remove(int index){
    return 0;
  }

  public Integer remove(Integer value){
    return 0;
  }
}
