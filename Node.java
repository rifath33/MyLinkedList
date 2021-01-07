public class Node{
    
 public Node(String value){
     this.data = value; 
 }
 private String data;
 private Node next,prev;
 
 public String getData(){
     return this.data;
 }
 
 public boolean setData(String data){
     this.data = data;
     return true;
 }
 
 public Node getNext(){
     return this.next;
 }
 
 public boolean setNext(Node next){
     this.next = next;
     return true;
 }
 
  public Node getPrev(){
     return this.prev;
 }
 
 public boolean setPrev(Node prev){
     this.prev = prev;
     return true;
 }
 
}
