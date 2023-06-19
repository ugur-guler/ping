import java.io.IOException;
import java.net.InetAddress;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String response = "";
        String ipAddress= new String();
        do {
            System.out.println("Please enter the target address");
            ipAddress=scanner.nextLine();
            Ping(ipAddress);

            System.out.println("Are you wanting to continue this process");
            response=scanner.nextLine();
        }
        while (response.equals("yes"));





    }
    private static void Ping(String ipAddress){
        try {
            InetAddress inetAddress= InetAddress.getByName(ipAddress);
            boolean isReacheable= inetAddress.isReachable(5000);
            if (isReacheable){
                System.out.println("The host is reachable");

            }
            else{
                System.out.println("The host is unreachable");
            }
        } catch (IOException e) {
                e.printStackTrace();
        }

    }
}
