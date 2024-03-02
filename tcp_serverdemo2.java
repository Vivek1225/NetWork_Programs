import java.util.Scanner;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;

public class tcp_serverdemo2 {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(7777);
            Socket socket = serverSocket.accept();
            DataOutputStream dataout = new DataOutputStream(socket.getOutputStream());
            DataInputStream datain = new DataInputStream(socket.getInputStream());
            Scanner scanner = new Scanner(System.in);
            String input="",output="";
            do {
                output = datain.readUTF();
                System.out.println("Client says: "+output);
                System.out.println("Enter message to the client: ");
                input = scanner.nextLine();
                dataout.writeUTF(input);
                dataout.flush();
            }while (!(input.equals("Bye") && output.equals("Bye")));
            serverSocket.close();
            scanner.close();
            //System.exit(1);
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
