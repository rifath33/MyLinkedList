public class Tester{
  public static void main (String[] args){
    
    MyLinkedList rifath = new MyLinkedList();
    rifath.add("cargo");
    rifath.add("thing");
    rifath.add("hello");
    rifath.add("hey");
    rifath.add("wow");
    rifath.add("heyyo");
    rifath.add("unnus");
    rifath.add("annus");
    System.out.println(rifath.toString());
    rifath.remove(-1);
    System.out.println(rifath.toString());
    
  }
}
