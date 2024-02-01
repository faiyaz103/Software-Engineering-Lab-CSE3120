package LAB4.LABTask;

// Roll = 2007103
// Design Pattern Used -> Bridge and Proxy


public class Main {
    public static void main(String[] args) {


        GeneralTV gentv=new GeneralTV();
        Remote remote= new Remote(gentv);
        remote.togglePower();
        remote.volumeUp();
        remote.channelUp();
        remote.channelDown();
        remote.volumeDown();

        SmartRemote smremote= new SmartRemote(gentv);
        smremote.togglePower();
        smremote.volumeUp();
        smremote.channelUp();
        smremote.channelDown();
        smremote.volumeDown();

        Youtube yt=new ProxyLoadYT();

        smremote.showYoutube(yt);
        smremote.showYoutube(yt);
    
        gentv.Youtube(yt);
    }

}
