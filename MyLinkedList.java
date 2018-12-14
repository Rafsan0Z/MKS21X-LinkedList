public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
    size = 0;
    start = null;
    end = null;
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
    Node temp = start;
    while(temp != null){
      result += temp.toString() + ",";
      temp = temp.getNext();
    }
    return result + "]";
}

  public int get(int index){
    Node temp = start;
    int i = 0;
    while(i != index){
      temp.getNext();
      i++;
    }
    return temp.getData();
  }

  public int set(int index, Integer value){
    if(size == 0){
      start.Node(start,end,value);
    }
    size++;
  }

  public boolean contains(Integer value){
    Node temp = start;
    int i = 0;
    while(i != index){
      temp = temp.getNext();
      if(temp.getData() == value){
        return true;
      }
    }
    return false;
  }

  public int indexOf(Integer value){
    Node temp = start;
    int i = 0;
    while(i != index){
      temp = temp.getNext();
      if(temp.getData() == value){
        return i;
      }
    }
    return -1;
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
