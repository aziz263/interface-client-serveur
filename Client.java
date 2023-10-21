import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8080);
            System.out.println("waiting for connection");
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            Scanner sc = new Scanner(System.in);
            int nb = sc.nextInt();
            os.write(nb);
            int res = is.read();
            System.out.println("Res= " + res);
            os.write(res);
            s.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
