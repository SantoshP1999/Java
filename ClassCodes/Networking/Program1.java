import java.net.*;
import java.io.*;

class IPAddress{
    public static void main(String[]args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String site = br.readLine();
        InetAddress ip=InetAddress().getName(site);
        System.out.println("IP Address="+ ip);
    }
}