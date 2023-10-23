import jakarta.xml.ws.Endpoint;
import webservices.BanqueService;

public class Program {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8087/",new BanqueService());
        System.out.println("demarer sur http://localhost:8087/");
    }
}
