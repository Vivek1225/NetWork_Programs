
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class UDP_Sender_Program{
    public static void main(String[] args)throws Exception{
        DatagramSocket ds = new DatagramSocket();
        String str = "Welcome To Java";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);
        // System.out.println(dp.getPort());
        ds.close();
    }
}
