/* Stop and Wait  */
public class stopnwait
{
    private int frameSize;

    public stopnwait(int packets, int frameSize)
    {
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

    public int sendFrames(network someNetwork, int time){
        int bandwidthBPMS = someNetwork.getBandwidth();
        for(int i = this.getFrameSize(); i>0; i-=bandwidthBPMS){
            time++;
        }
        return time;
    }
}