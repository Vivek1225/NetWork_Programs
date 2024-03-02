// import java.net.ServerSocket;
import java.io.DataOutputStream;
import java.net.Socket;

public class tcp_clientdemo {
    public static void main(String[] args) {
        //Socket, connect
        try{
        Socket s = new Socket("localhost",7777);
        System.out.println("Connection was established with server");
        String msg = "Hello server... Good afternoon!";
        DataOutputStream dos =  new DataOutputStream(s.getOutputStream());//Dataoutputstream is used to send data from client to the server
        dos.writeUTF(msg);
        s.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}