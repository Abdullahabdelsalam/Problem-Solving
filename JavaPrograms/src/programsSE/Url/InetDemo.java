package programsSE.Url;

import java.net.InetAddress;

public class InetDemo {
    public static void main(String[] args){
        try{
            InetAddress ip= InetAddress.getByName("www.Technolamror.com");
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
        }catch(Exception e){System.out.println(e);}
    }
}
