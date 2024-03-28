import java.net.*;       
public class inet_class_address {
    public static void main(String[] args)throws Exception{   
        InetAddress ip1 = InetAddress.getLocalHost(); 
        // InetAddress ip=InetAddress.getByName("www.google.com");   
        System.out.println("Host Name: "+ip1.getHostName());   
        System.out.println("IP Address: "+ip1.getHostAddress());   
    }  
} 