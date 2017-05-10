public class test {
    public static void main(String[] args) {
        System.out.println("PROTOCOL 4: STOP-AND-WAIT");
        stopnwait simpleProtocol4 = new stopnwait(1, 2400);
        network simpleNetwork = new network(40000.0, 56);
        int prot4time = 0;
        for(int i = 0; i < simpleProtocol4.getPacketsSize(); i++){
            int sendFramesTime = simpleProtocol4.sendFrames(simpleNetwork, prot4time);
            System.out.println("SEND TIME: " + sendFramesTime);
            int ackTime = simpleProtocol4.waitForAck(simpleNetwork, prot4time);
            System.out.println("ACK TIME: " + ackTime);
            prot4time += (sendFramesTime + ackTime);
            System.out.println("STOP-AND-WAIT: " + prot4time);
        }
        System.out.println("Current time is : " + prot4time + "ms");
        System.out.println("--------------------------------------");
        
        System.out.println("PROTOCOL 5: GO-BACK-N");
        gobackn simpleProtocol5 = new gobackn(5, 2400);
        simpleProtocol5.sendFrames(simpleNetwork);
        simpleProtocol5.waitForAck(simpleNetwork);

        prot4time = 0;
        System.out.println("--------------------------------------");
        System.out.println("PROTOCOL 4: STOP-AND-WAIT");
        stopnwait complexProtocol4 = new stopnwait(5, 2400);
        complexProtocol4.multipleFrames(simpleNetwork, prot4time, 5);


    }
}