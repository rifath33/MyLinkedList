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
        end.setNext(new Node(value));
        addition.setPrev(end);
        end = end.getNext();
        size++;
    }
    
    return true;
    
 }
 
 public void add(int index, String value){
    
    
    
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
    
    while(currentNode.hasNext()){
        result += currentNode.getData() + ", ";
        currentNode = currentNode.getNext();
    }
    
    result += currentNode.getData() + "]";
    
    return result;
    
 }
 
  public String toStringReversed(){
    String result = "[";
    
    Node currentNode = end;
    
    while(currentNode.hasPrev()){
        result += currentNode.getData() + ", ";
        currentNode = currentNode.getPrev();
    }
    
    result += currentNode.getData() + "]";
    
    return result;
    
 }

 //Any helper method that returns a Node object MUST BE PRIVATE!
 
}
