public class test {
    public static void main(String[] args) {
        stopnwait simpleProtocol4 = new stopnwait(1, 2400);
        network simpleNetwork = new network(40000.0, 56);
        int currentTime = 0;
        currentTime += simpleProtocol4.sendFrames(simpleNetwork, currentTime);
        System.out.println("Current time is : " + currentTime + "ms");
    }
}