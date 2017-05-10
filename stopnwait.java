/* Stop and Wait  */
import java.util.*;

public class stopnwait
{
    private int frameSize;
    private int packets;
    private int waitTime = 10;

    public stopnwait(int packets, int frameSize)
    {
        this.packets = packets;
        this.frameSize = frameSize;
    }

    public int getFrameSize()
    {
        return this.frameSize;
    }

    public void setFrameSize(int frameSize)
    {
        this.frameSize = frameSize;
    }

    public int getPacketsSize(){
        return this.packets;
    }

    public int sendFrames(network someNetwork, int time){
        int bandwidthBPMS = someNetwork.getBandwidth();
        for(int i = this.getFrameSize(); i>0; i-=bandwidthBPMS){
            time++;
        }
        return time;
    }

    public int waitForAck(network someNetwork, int time) {
        Random rand = new Random();
        int loss = rand.nextInt(20); //lost packet simulation
        if(loss != packets){
           int bandwidthBPMS = someNetwork.getBandwidth();
            double physicalDelay = (someNetwork.getHeight()/someNetwork.speedOfLight) * 1000.0;
            int ackSendTime = 0;
            for(int i = this.getFrameSize(); i>0; i-=bandwidthBPMS){
                ackSendTime++;
            }
            System.out.println("ACK SEND TIME: " + ackSendTime);
            System.out.println("PHYSICAL DELAY: " + physicalDelay);
            time = ackSendTime + (int) physicalDelay;
            packets--;
        } else {
            time = 0;
        }
        return time;
    }

    public void multipleFrames(network someNetwork, int time, int frames){
        int frameNum = 0;
        while(frameNum < frames){
            int sent = sendFrames(someNetwork, time);
            System.out.println("Frame " + frameNum + " sent after " + sent);
            int ack = waitForAck(someNetwork, time);
            if(ack != 0){
                System.out.println("ACK received for frame " + frameNum + " after " + ack);
                frameNum++;
            }
        }
    }
}