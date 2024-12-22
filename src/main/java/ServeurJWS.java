import jakarta.xml.ws.Endpoint;
import org.glassfish.jaxb.runtime.v2.runtime.output.StAXExStreamWriterOutput;
import ws.BanqueWS;
import ws.Compte;
import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class ServeurJWS {
    public static void main(String[] args)
    {
        String address="http://0.0.0.0:9191/";
        Endpoint.publish(address,new BanqueWS());
        System.out.printf("Web service deployed on this %s",address);


    }
}
