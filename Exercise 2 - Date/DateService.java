import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

public interface DateService extends Remote {
	
	/**
     * Returns the date and time with the current date and time
     *
     * @param s a string
     * @return the same string passed as parameter
     * @throws RemoteException (in case anything goes wrong with the network connectivity)
     */
	 Calendar date() throws RemoteException;
}