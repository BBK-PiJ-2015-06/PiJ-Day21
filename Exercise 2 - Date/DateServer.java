import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;


public class DateServer extends UnicastRemoteObject implements DateService {

    public DateServer() throws RemoteException {}

    @Override
    public Calendar date() throws RemoteException {
        System.out.println("Replied to some client requesting current time and date");
        return Calendar.getInstance();
    }
}