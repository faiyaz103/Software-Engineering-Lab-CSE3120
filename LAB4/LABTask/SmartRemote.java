package LAB4.LABTask;

public class SmartRemote extends Remote{

    SmartRemote(){

    }
    SmartRemote(TV tv){
        super(tv);
    }
    void showYoutube(Youtube yt){
        tv.Youtube(yt);
    }
}
