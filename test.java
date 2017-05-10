public class test {
    public static void main(String[] args) {
        stopnwait simpleProtocol4 = new stopnwait(1, 2400);
        network simpleNetwork = new network(40000.0, 56);
        int prot4time = 0;
        for(int i = 0; i < simpleProtocol4.getPacketsSize(); i++){
            int sendFramesTime = simpleProtocol4.sendFrames(simpleNetwork, prot4time);
            System.out.println(sendFramesTime);
            int ackTime = simpleProtocol4.waitForAck(simpleNetwork, prot4time);
            System.out.println(ackTime);
            prot4time += (sendFramesTime + ackTime);
            System.out.println(prot4time);
        }
        System.out.println("Current time is : " + prot4time + "ms");
    }
}