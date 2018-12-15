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
    Node addend = new Node(value,null,end);
    If(end != null){
      end.setNext(addend);
      end = addend;
    }
    else{
      start = addend;
      end = start;
    }
    return true;
  }

  public String toString(){ // turns the LinkedList into a String to be printed!
    String result = "[";
    for(int i = 0; i < size; i++){
      result += start.next().getData();
      if(i != size - 1){
        result += ",";
      }
    }
    return result + "]";
}

  public int get(int index){
    Node temp = start;
    for(int i = 0; i <= index;i++){
      if(i == index) {return temp.getData();}
    }
    return -1;
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
