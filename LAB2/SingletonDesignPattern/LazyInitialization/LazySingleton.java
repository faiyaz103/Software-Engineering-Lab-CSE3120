package LAB2.SingletonDesignPattern.LazyInitialization;

public class LazySingleton {
    
    private static LazySingleton ins = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){

        if(ins == null){
            ins = new LazySingleton();
        }

        return ins;
    }
}
