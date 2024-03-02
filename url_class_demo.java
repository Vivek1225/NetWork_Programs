import java.net.*;

public class url_class_demo {
    public static void main(String[] args)throws Exception {
        URL url = new URL("https://www.javatpoin.com/java-tutorial");
        System.out.println("Protocal: "+url.getProtocol());
        System.out.println("Host Name: "+url.getHost());
        System.out.println("Port number: "+url.getPort());
        System.out.println("File name: "+url.getFile());
        

    }    
}
