package LAB2.SingletonDesignPattern.LazyInitialization;

public class Main {
    
    public static void main(String[] args) {

        LazySingleton x=LazySingleton.getInstance();
        LazySingleton z=LazySingleton.getInstance();
        LazySingleton y=LazySingleton.getInstance();

        System.out.println("Hashcode of x is: "+x.hashCode());
        System.out.println("Hashcode of y is: "+y.hashCode());
        System.out.println("Hashcode of z is: "+z.hashCode());
    }
}
