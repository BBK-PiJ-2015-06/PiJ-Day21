import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DateServerLauncher {

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            Registry registry = LocateRegistry.getRegistry();
            DateServer server = new DateServer();
            registry.rebind("Date", server);
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}