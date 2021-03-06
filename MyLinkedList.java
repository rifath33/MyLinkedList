public class MyLinkedList{
 private int size;
 private Node start,end;
 
 public MyLinkedList(){
     size=0;
 }
 
 public int size(){
    return this.size;
 }
 
 public boolean add(String value){
    
    Node addition = new Node(value);
    
    if(size() == 0){
        start = addition;
        end = addition;
        size++;
    }
    else{
        end.setNext(addition);
        addition.setPrev(end);
        end = end.getNext();
        size++;
    }
    
    return true;
    
 }
 
 public void add(int index, String value){
    
    if(index > size() || index < 0)
    throw new IndexOutOfBoundsException("The index " + index + "is not present in the list.");
    
    Node addition = new Node(value);
    
    if(size() == 0 || index ==size()){
        add(value);
    }
    else{
        if(index==0){
            start.setPrev(addition);
            addition.setNext(start);
            start = addition;
            size++;
        }
        else{
            Node willBePrevious = getNode(index-1);
            Node willBeNext = getNode(index);
            addition.setPrev(willBePrevious);
            addition.setNext(willBeNext);
            willBePrevious.setNext(addition);
            willBeNext.setPrev(addition);
            size++;
        }
    }
    
 }
  
 public String remove(int index){
    if(index >= size() || index < 0 || size() == 0)
    throw new IndexOutOfBoundsException("The index " + index + " is not present in the list.");
    
    String evicted = getNode(index).getData();
    
    // removing the tail
    if(index == size()-1){
        end.setData(null);
        end.getPrev().setNext(null);
        end = end.getPrev();
        size--;
    }
    else{
        // removing the head
        if(index == 0){
            start.setData(null);
            start.getNext().setPrev(null);
            start=start.getNext();
            size--;
        }
        // removing the final element of a size 1 list
        else{
            if(size() == 1){
                start.setData(null);
                start.getNext().setData(null);
                end.setData(null);
                end.getPrev().setData(null);
                size--;
            }
            // removing from the middle... shit
            else{
                getNode(index-1).setNext(getNode(index+1));
                getNode(index+1).setPrev(getNode(index-1));
                size--;
            }
        }
    }
    
    return evicted;
    
 }
 
 private Node getNode(int index){
    Node currentNode = start;
     
    if(index ==0) 
    return start;
    else{
        
        if(index == this.size()-1)
        return end;
        else{
            
            if(this.size()>0){
            
            for(int i = 0; i < index; i++){
                currentNode = currentNode.getNext();
            }
            
            }
            
            return currentNode;
            
        }
        
    }
    
 }

 
 public String get(int index){
    return getNode(index).getData();
 }
 
 public String set(int index, String value){
    getNode(index).setData(value);
    return getNode(index).getData();
 }
 
 public String toString(){
    String result = "[";
    
    Node currentNode = start;
    
    if(size() > 0){
        while(currentNode.hasNext()){
            result += currentNode.getData() + ", ";
            currentNode = currentNode.getNext();
        }
    result += currentNode.getData();
    }
    result+="]";
    return result;
    
 }
 
  public String toStringReversed(){
    String result = "[";
    
    Node currentNode = end;
    
    if(size()>0){
        while(currentNode.hasPrev()){
            result += currentNode.getData() + ", ";
            currentNode = currentNode.getPrev();
        }
        result += currentNode.getData();
    }
    result+="]";
    
    return result;
    
 }
    
/*
 *@postcondition: All of the elements from other are removed from the other, and connected to the end of this linked list.
 *@postcondition: The size of other is reduced to 0.
 *@postcondition: The size of this is now the combined sizes of both original lists
  Please consider that either/both of the lists can have 0 or more elemnts in them. 
  Be careful how you write your code so that it works even when either/both are empty/size1/size2+.
*/
 public void extend(MyLinkedList other){
    
    // empty
    if(other.size()==0){
        return; //skip
    }
    else{
        if(size() ==0){
            this.start = other.start;
        }
        else{
            end.setNext(other.start);
            other.start.setPrev(this.end);
        }
    }
    
    this.end = other.end;
    size = size() + other.size();
    other.start = null;
    other.end=null;
    other.size = 0;
    
 }

 //Any helper method that returns a Node object MUST BE PRIVATE!
 
}
