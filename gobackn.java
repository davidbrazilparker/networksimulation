/* Go Back N  */
public class gobackn
{
    private int frameSize;
    private int bitSeqNum;

    public gobackn(int frameSize, int bitSeqNum)
    {
        this.frameSize = frameSize;
        this.bitSeqNum = bitSeqNum;
    }

    public int getFrameSize()
    {
        return this.frameSize;
    }

    public void setFrameSize(int frameSize)
    {
        this.frameSize = frameSize;
    }

    public int getBitSeqNum()
    {
        return this.bitSeqNum;
    }

    public void setBitSeqNum(int bitSeqNum)
    {
        this.bitSeqNum = bitSeqNum;
    }

    public int sendFrames(network someNetwork, int time){

    }

    public int waitForAck(network someNetwork, int time){
        
    }
}