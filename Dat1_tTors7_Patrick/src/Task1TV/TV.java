package Task1TV;

public class TV {
    private boolean on = false;
    private int channel;
    private int volume;

    TV(){
    }

    public void setChannel(int input){
        if(on) {
            this.channel = input;
            System.out.println("You are on channel: " + input);
        }
        else{
            System.out.println("Tv is not turned on");
        }
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        if(on) {
            return channel;
        }else{
            System.out.println("Tv is not on");
            return 0;
        }
    }
    public boolean getOn(){
        return on;
    }

    public int getVolume() {
        if(on) {
            return volume;
        }else{
            System.out.println("Tv is not on");
            return 0;
        }
    }

    public void setVolume(int input) {
        if (on) {
            this.volume = input;
            System.out.println("volume set to: " + input);
        }else{
            System.out.println("Tv is not turned on");
        }

    }
    public void channelUp() {
        if (on) {

            this.channel++;
            System.out.println("You are on channel: " + this.channel);
        }else{
            System.out.println("Tv is not turned on");
        }
    }
    public void channelDown() {
        if (on) {
            this.channel--;
            System.out.println("You are on channel: " + this.channel);
        } else {
            System.out.println("Tv is not turned on");
        }
    }
    public void volumeUp(){
        this.volume++;
        System.out.println("Volume: " + this.volume);
    }
    public void volimeDown() {
        if (on) {
            this.volume--;
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("Tv is not turned on");
        }
    }
    public void turnOn(){
        if(!on) {
            this.on = true;
        }else{
            System.out.println("Tv is already on");
        }
    }
    public void turnOff(){
        if(on) {
            this.on = false;
        }else{
            System.out.println("tv is already off");
        }
    }

}
