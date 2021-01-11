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
    
    if(size() == 0){
        start = new Node(value);
        end = new Node(value);
        size++;
    }
    else{
        end.setNext(new Node(value));
        end = end.getNext();
    }
    
 }
 
 public void add(int index, String value){
    
    if(size()==0 && index>0)
    throw new IndexOutOfBoundsException("Your index can't be more than 0 if the List is empty...");
    
    if(index == 0 && size() == 0){
        start = new Node(value);
        end = new Node(value);
        size++;
    }
    
    if(index == 0 && size() > 0){
        start.setPrev(new Node(value));
        start = start.getPrev();
    }
    
    if(index == list.size()-1 && size() > 0){
        end.setNext(new Node(value));
        end = end.getNext();
    }
    
    if(index > 0 && index < list.size()-1 && size()){
        
    }
    
 }
 
 private Node getNode(int index){
     
    if(index ==0) 
    return start;
    
    if(n == size()-1)
    return end;
    
    if(size>0){
        Node currentNode = start;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }
    }
    
    return currentNode;
    
 }

 
 public String get(int index){
    return getNode(index).geteData();
 }
 
 public String set(int index, String value){
     
 }
 
 public String toString(){
     
 }
 
 //Any helper method that returns a Node object MUST BE PRIVATE!
 
}
