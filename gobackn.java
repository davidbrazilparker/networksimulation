/* Go Back N  */
public class gobackn
{

    private int frameSize;
    private int windowSize;

    public gobackn(int windowSize, int frameSize)
    {
        this.frameSize = frameSize;
        this.windowSize = windowSize;
    }

    public int getFrameSize()
    {
        return this.frameSize;
    }

    public void setFrameSize(int frameSize)
    {
        this.frameSize = frameSize;
    }

    public int getWindowSize()
    {
        return this.windowSize;
    }

    public void setWindowSize(int windowSize)
    {
        this.windowSize = windowSize;
    }

    public void sendFrames(network someNetwork)
    {
        int time = 0;
        int bandwidthBPMS = someNetwork.getBandwidth();

        for(int i = 0; i < windowSize; i++)
        {
            for(int j = this.getFrameSize(); j>0; j-=bandwidthBPMS)
            {
                time++;
            }

            System.out.println("Frame " + i + " has been sent!");
            System.out.println("Time: " + time);
        }
    }

    public void waitForAck(network someNetwork)
    {
        int time = 0;
        int bandwidthBPMS = someNetwork.getBandwidth();
        double physicalDelay = (someNetwork.getHeight()/someNetwork.speedOfLight) * 1000.0;
        int ackSendTime = 0;

        for(int i = 0; i < windowSize; i++)
        {
            for(int j = this.getFrameSize(); j>0; j-=bandwidthBPMS)
            {
                ackSendTime++;
            }

            time = ackSendTime + (int) physicalDelay;
            System.out.println("ACK for Frame " + i + " has been sent!");
            System.out.println("Time: " + time);
        }

    }

}//End Class