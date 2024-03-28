import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ur_connection_demo {
    public static void main(String[] args)throws Exception {
        URL url = new URL("file:///C:/Users/aniru/OneDrive/Desktop/STUDY/Advanced%20Java%20Programming/New%20folder/Network%20programs/first.html");
        URLConnection u = url.openConnection();
        InputStream is  = u.getInputStream();
        int i;
        while((i=is.read())!=-1){
            System.out.print((char)i);
        }
    }
}
