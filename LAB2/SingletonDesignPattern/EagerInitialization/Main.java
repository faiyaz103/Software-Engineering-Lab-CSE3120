package LAB2.SingletonDesignPattern.EagerInitialization;

public class Main {
    
    public static void main(String[] args) {
        
        EagerSingleton x=EagerSingleton.getInstance();
        EagerSingleton y=EagerSingleton.getInstance();
        EagerSingleton z=EagerSingleton.getInstance();

        System.out.println("Hashcode for x: "+x.hashCode());
        System.out.println("Hashcode for y: "+y.hashCode());
        System.out.println("Hashcode for z: "+z.hashCode());
    }
    
}
