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
    
    return true;
    
 }
 
 public void add(int index, String value){
    
    Node addition = new Node(value);
    
    if(this.size()==0 && index>0)
    throw new IndexOutOfBoundsException("Your index can't be more than 0 if the List is empty...");
    
    if(index == 0 && size() == 0){
        start = addition;
        end = addition;
        size++;
    }
    
    if(index == 0 && size() > 0){
        start.setPrev(addition);
        start = start.getPrev();
        size++;
    }
    
    if(index == this.size()-1 && size() > 0){
        end.setNext(addition);
        end = end.getNext();
        size++;
    }
    
    if(index > 0 && index < this.size()-1 && this.size()>0){
        getNode(index).getPrev().setNext(addition);
        getNode(index).getNext().setPrev(addition);
        size++;        
    }
    
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
    String result = "";
    
    Node currentNode = start;
    
    while(currentNode.hasNext()){
        result += currentNode.getData() + ", ";
        currentNode = currentNode.getNext();
    }
    
    result = result + "]";
    
    return result;
    
 }
 
 //Any helper method that returns a Node object MUST BE PRIVATE!
 
}
