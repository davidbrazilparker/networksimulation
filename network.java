/* Simulation class for a satellite network */

public class network
{

    public final double speedOfLight = 300000.0;
    private double height;
    private int bandwidth;
    private int totalTime;

    public network(double height, int bandwidth)
    {
        this.height = 4.0 * height; //Height is measured in km
        this.bandwidth = bandwidth; //Bandwidth is measured in kbps
    }

    public double getHeight()
    {
        return this.height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getBandwidth()
    {
        return this.bandwidth;
    }

    public void setBandwidth(int bandwidth)
    {
        this.bandwidth = bandwidth;
    }

    public int run(int packets, int frameSize, int time)
    {
        time = this.sendFrames(frameSize, time);
        time = this.waitForAck(frameSize, time);
        return time;
    }

    public int sendFrames(int frameSize, int time)
    {
        int bandwidthBPMS = this.getBandwidth();
        System.out.println("Sending frames...");

        for(int i = frameSize; i>0; i-=bandwidthBPMS)
        {
            time++;
        }

        System.out.println("Finished sending frames!");
        return time;

    }

    public int waitForAck(int frameSize, int time)
    {
        int bandwidthBPMS = this.getBandwidth();
        double physicalDelay = (this.height/this.speedOfLight) * 1000.0;
        int ackSendTime = 0;

        for(int i = frameSize; i>0; i-=bandwidth)
        {
            ackSendTime++;
        }

        time = ackSendTime + (int) physicalDelay;
        return time;
    }

    /*
    public int testRun(int packets, int frameSize, int time)
    {
        int completed = new int[packets];
        for(int i = 0; i < packets; i++)
        {
            completed[i] = time;
        }
    }
    */

}//End Class