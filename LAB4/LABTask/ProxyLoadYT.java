package LAB4.LABTask;

public class ProxyLoadYT implements Youtube{
    private LoadYT firstLoadYoutube;
    @Override
    public void runYoutube() {
        if(firstLoadYoutube==null){
            firstLoadYoutube=new LoadYT();
            System.out.println("Youtube Starting");
        }
        firstLoadYoutube.runYoutube();
    }
}
