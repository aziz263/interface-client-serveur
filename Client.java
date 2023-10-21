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
            char nm = sc.nextInt();
            os.write(nm);
            int res = is.read();
            System.out.println("Bonjour Mr " + nm);
            os.write(nm);
            s.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}