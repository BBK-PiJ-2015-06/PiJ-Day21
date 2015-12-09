import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Calendar;

public class DateClientLauncher {
	
	public static void main(String[] args) {
		if(System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			String name = "Date";
			Registry registry = LocateRegistry.getRegistry("localhost");
			DateService dateService = (DateService) registry.lookup(name);
			Calendar receivedTime = dateService.date();
			System.out.println("Received time is: " + receivedTime);
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}