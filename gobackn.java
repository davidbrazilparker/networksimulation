/* Go Back N  */
public class protocol5 {
    private int frameSize;
    private int bitSeqNum;

    public protocol5(int frameSize, int bitSeqNum){
        this.frameSize = frameSize;
        this.bitSeqNum = bitSeqNum;
    }

    public int getFrameSize(){
        return this.frameSize;
    }

    public void setFrameSize(int frameSize){
        this.frameSize = frameSize;
    }

    public int getBitSeqNum(){
        return this.bitSeqNum;
    }

    public void setBitSeqNum(int bitSeqNum){
        this.bitSeqNum = bitSeqNum;
    }


}