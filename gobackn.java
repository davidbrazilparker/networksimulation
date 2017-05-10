/* Go Back N  */

public class gobackn
{

    private int windowSize;
    private int bitSeqNum;

    public gobackn(int windowSize, int bitSeqNum)
    {
        this.windowSize = windowSize;
        this.bitSeqNum = bitSeqNum;
    }

    public int getWindowSize()
    {
        return this.windowSize;
    }

    public void setWindowSize(int frameSize)
    {
        this.windowSize = frameSize;
    }

    public int getBitSeqNum()
    {
        return this.bitSeqNum;
    }

    public void setBitSeqNum(int bitSeqNum)
    {
        this.bitSeqNum = bitSeqNum;
    }

    public int sendFrames(network someNetwork, int time)
    {
        return 1;
    }

    public int waitForAck(network someNetwork, int time)
    {
        return 1;
    }
}