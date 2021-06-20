import java.net.*;
import java.io.*;

class JavaWebsocket {

    public static void main(String[] args) {

        try {

            Socket s = new Socket("192.168.1.29", 5005);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeBytes("Yes");
            dout.flush();
            dout.close();
            s.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
