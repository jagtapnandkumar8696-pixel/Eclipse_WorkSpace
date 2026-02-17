package interfaceLearning;

class Base {
    public  void foo() { System.out.println("Base"); }
}
  
class Derived extends Base {
    public  void foo() { System.out.println("Derived"); } 
}
  
public class SUbClassPrivateMethod {
    public static void main(String args[]) {
    	Derived  b = new Derived();
        b.foo();
    }
} 