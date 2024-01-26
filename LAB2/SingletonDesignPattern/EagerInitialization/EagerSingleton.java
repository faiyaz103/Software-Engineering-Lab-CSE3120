package LAB2.SingletonDesignPattern.EagerInitialization;

public class EagerSingleton {
    
    private static final EagerSingleton ins = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return ins;
    }
}
