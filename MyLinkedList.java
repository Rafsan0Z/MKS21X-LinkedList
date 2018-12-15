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
    Node temp = start;
    for(int i = 0; i <= index; i++){
      temp = temp.getNext();
    }
  }

  public Integer remove(int index){
    Node temp = start; // create temporary Node
    int lastIndex = size - 1;
    Integer result = 0; // set result to 0
    int i = 0;
    while(i != index){
      temp = temp.next(); // while loop to get Node at index
      i++;
    }
    if(end != temp){
      Node previous = temp.prev();
      Node following = temp.next();
      previous.setNext(following);  // if temporary Node and end Node are differet, make create the previous and following Node and join them
      following.setPrev(previos);
      result = temp.getData();
    }
    else{
      Node previous = temp.prev();
      previos.setNext(null);
      end = previous;
      result = temp.getData();
    }
    size--;
    return result;
  }

  public boolean remove(Integer value){
    boolean result = false; // setting result as false
    if(contains(value)) {
      remove(indexOf(value)); // Make sure that remove works!
      result = true;  // Changes the result
    }
    return result; // returns the result
  }
}
