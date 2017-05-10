/* Stop and Wait  */
public class stopnwait
{
    private int frameSize;
    private int packets;

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
        int bandwidthBPMS = someNetwork.getBandwidth();
        double physicalDelay = (someNetwork.getHeight()/someNetwork.speedOfLight) * 1000.0;
        int ackSendTime = 0;
        for(int i = this.getFrameSize(); i>0; i-=bandwidthBPMS){
            ackSendTime++;
        }
        System.out.println(ackSendTime);
        System.out.println(physicalDelay);
        time = ackSendTime + (int) physicalDelay;
        return time;
    }
}