package bus;

import bus.interfacee.Printable;

public class Driver implements Printable {
    static int ROUTE_BUS = 101;
    static int END_DATE_BUS = 2005;
    static int END_MILEAGE_BUS = 200000;
    String Fname_driver;
    private int bus_mileage;
    int bus_number;
    String bus_brand;
    int bus_start_date;
    int bus_route;

    @Override
    public String getFnameDriver() {
        return Fname_driver;
    }

    public int getMileageBus() {
        return bus_mileage;
    }

    public int getNumberBus() {
        return bus_number;
    }

    public String getBrandBus() {
        return bus_brand;
    }

    public int getDateStartBus() {
        return bus_start_date;
    }

    public int getBusRoute() {
        return bus_route;
    }

    public Driver(String name_driver, int bus_probeg, int bus_number, String bus_brand, int bus_start_date, int bus_route) {
        this.Fname_driver = name_driver;
        this.bus_mileage = bus_probeg;
        this.bus_number = bus_number;
        this.bus_brand = bus_brand;
        this.bus_start_date = bus_start_date;
        this.bus_route = bus_route;
    }
}

