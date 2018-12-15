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
<<<<<<< HEAD
    for(int i = 0; i < size; i++){
      result += start.next().getData();
      if(i != size - 1){
        result += ",";
      }
=======
    Node temp = start;
    while(temp != null){
      result += temp.toString() + ",";
      temp = temp.getNext();
>>>>>>> 9ae927ed61b0b1dda685b3af2c71f79bae2c930f
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
<<<<<<< HEAD
    return -1;
  }

  public int set(int index, Integer value){
  return 0;
=======
    return temp.getData();
  }

  public int set(int index, Integer value){
    if(size == 0){
      start.Node(start,end,value);
    }
    size++;
>>>>>>> 9ae927ed61b0b1dda685b3af2c71f79bae2c930f
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
    Node temp = start;
    for(int i = 0; i <= index; i++){
      temp = temp.getNext();
    }
  }

  public Integer remove(int index){
    return 0;
  }

  public Integer remove(Integer value){
    return 0;
  }
}
