public class test
{
    

    public static void main(String[] args)
    {
        stopnwait simpleProtocol4 = new stopnwait(2400);
        network simpleNetwork = new network(40000, 56);
        int currentTime = 0;
        currentTime = simpleNetwork.sendFrames(simpleProtocol4.getFrameSize(), currentTime);
        System.out.println("Time to send frames: " + currentTime + "ms");
    }


}