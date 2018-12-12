public class MyLinkedList{
  private int size;
  private Node start,end;

  public int size() {
    return size;
  }

  public boolean add(int value){
    if(end == null){
      end = value;
      return true;
    }
    else{
      return false;
    }
  }

  public String toString(){
    String result = "";
    return result;
  }
}
