package LAB4.LABTask;

public class Remote{

    protected TV tv;

    Remote(){tv=null;}

    Remote(TV tv){
        this.tv=tv;
    }

    public void togglePower() {
        if(tv.isEnabled()){
            tv.disable();
            System.out.println("Power off");
        }
        else {
            tv.enable();
            System.out.println("Power on");
        }
    }

    public void volumeUp() {
        if(tv.isEnabled()){
            tv.setVolume(tv.getVolume()+1);
            System.out.println("Volume Increased by 1");
        }
        else{
            System.out.println("TV Off");
        }
    }

    public void volumeDown() {
        if(tv.isEnabled()){
            tv.setVolume(tv.getVolume()-1);
            System.out.println("Volume Decreased by 1");
        }
        else{
            System.out.println("TV Off");
        }

    }

    public void channelUp() {
        if(tv.isEnabled()){
            tv.setChannel(tv.getVolume()+1);
            System.out.println("Channel +1");
        }
        else{
            System.out.println("TV Off");
        }


    }

    public void channelDown() {
        if(tv.isEnabled()){
            tv.setChannel(tv.getVolume()-1);
            System.out.println("Channel -1");
        }else{
            System.out.println("TV Off");
        }

    }
}