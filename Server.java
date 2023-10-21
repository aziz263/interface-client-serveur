import java.net.*;
import java.io.*;

public class Server {

  public static void main(String[] args) {
    try {
      ServerSocket se = new ServerSocket(8080);
      System.out.println("waiting for connection");
      Socket s = se.accept();
      InputStream is = s.getInputStream();
      OutputStream os = s.getOutputStream();
      System.out.println("waiting for nom");
      int nb = is.read();
      int res = nb * 3;
      System.out.println("nb= " + nb);
      System.out.println("i send the response");
      os.write(res);
      s.close();
      se.close();
      System.out.println("END");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
