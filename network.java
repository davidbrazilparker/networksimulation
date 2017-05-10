/* Simulation class for a satellite network */

public class network {

    public static final int speedOfLight = 300000;
    private int height;
    private int bandwidth;

    public network(int height, int bandwidth){
        this.height = height; //Height is measured in km
        this.bandwidth = bandwidth; //Bandwidth is measured in kbps
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getBandwidth(){
        return this.bandwidth;
    }

    public void setBandwidth(int bandwidth){
        this.bandwidth = bandwidth;
    }

    public int sendFrames(int frameSize, int time){
        int bandwidthBPMS = this.getBandwidth();
        System.out.println("Sending frames...");
        for(int i = frameSize; i>0; i-=bandwidthBPMS){
            time++;
        }
        System.out.println("Finished sending frames!");
        return time;
    }
}