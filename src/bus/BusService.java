package bus;

import bus.Driver;
import bus.interfacee.Printable;

public class BusService {
    public static void overMileages(Printable[] printables) {
        System.out.println("Spisok avtobusov probeg u kotoryx bolwe zadannogo rasstoyaniya" + Driver.END_MILEAGE_BUS);
        for(Printable i : printables){
            if (i.getMileageBus() > Driver.END_MILEAGE_BUS){
                System.out.println(((Driver) i).Fname_driver +  ": " + ((Driver) i).bus_brand + "=" + i.getMileageBus());
            }
        }
    }
    public static void startDateBuses(Printable[] printables){
        System.out.println("Spisok avtobusov kotorye ekspluatiruyutysa bolwe zadannogo sroka " + Driver.END_DATE_BUS);
        for (Printable i : printables) {
            if (((Driver) i).bus_start_date > Driver.END_DATE_BUS) {
                System.out.println(((Driver) i).Fname_driver + ": " + ((Driver) i).bus_brand + "=" + ((Driver) i).bus_start_date);
            }
        }
    }
    public static void Route(Printable[] printables) {
        System.out.println("Spisok avtobusov dlya zadannogo marshruta " + Driver.ROUTE_BUS);
        for (Printable i : printables) {
            if (((Driver) i).bus_route == ((Driver) i).ROUTE_BUS) {
                System.out.println(((Driver) i).Fname_driver + ": " + ((Driver) i).bus_brand + "=" + ((Driver) i).bus_route);
            }
        }
    }
}
