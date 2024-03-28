import java.net.*;

public class url_class_demo {
    public static void main(String[] args)throws Exception {
        URL url = new URL("file:///C:/Users/aniru/OneDrive/Desktop/STUDY/Advanced%20Java%20Programming/New%20folder/Network%20programs/first.html");
        System.out.println("Protocal: "+url.getProtocol());
        System.out.println("Host Name: "+url.getHost());
        System.out.println("Port number: "+url.getPort());
        System.out.println("File name: "+url.getFile());
    }    
}
//Here the file is a local so host name is not returned
//port number is different since we are not using any protocal