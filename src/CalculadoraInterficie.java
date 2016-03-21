import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Dionis on 22/02/2016.
 */
public interface CalculadoraInterficie extends Remote{

    //Metodos de las operaciones
    public double sumar(String operacion) throws RemoteException;

    public double restar(String operacion) throws RemoteException;

    public double multiplicar(String operacion) throws RemoteException;

    public double dividir(String operacion) throws RemoteException;

}
