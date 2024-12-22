package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ws.Compte;

import java.util.List;
import java.util.Date;
@WebService(serviceName = "BanqueWS")
public class BanqueWS {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*10.54;
    }
    @WebMethod(operationName = "getCmpte")
    public Compte getCompte(@WebParam(name = "code") int code ){

      return new Compte(code,Math.random()*70.54,new Date());

    }
@WebMethod(operationName = "getAll")
    public List<Compte> getComptes(){

        return List.of(
                new Compte(1,Math.random()*70.54,new Date()),
                new Compte(2,Math.random()*70.54,new Date()),
                new Compte(3,Math.random()*70.54,new Date())
        );

    }




}
