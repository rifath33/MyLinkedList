public class Node{
    
 public Node(String value){
     
 }
 private String data;
 private Node next,prev;
 
 public String getData(){
     return data;
 }
 
 public boolean setData(String data){
     this.data = data;
     return true;
 }
 
 public Node getNext(){
     return next;
 }
 
 public boolean setNext(Node next){
     this.next = next;
     return true;
 }
 
  public Node getPrev(){
     return prev;
 }
 
 public boolean setPrev(Node prev){
     this.prev = prev;
     return true;
 }
 
 //write get/set methods for all three instance variables.
 
}
