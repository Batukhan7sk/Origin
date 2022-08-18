package bus.runner;

import bus.Driver;
import bus.interfacee.Printable;
import bus.BusService;

public class Main {
    public static void main(String[] args) {
        //Все автобусы
        Printable[] printables = new Printable[5];
        printables[0] = new Driver("Talgat",300000,300000,"Hyundai",2010,101);
        printables[1] = new Driver("Maksat",250000,8,"Honda",2012,102);
        printables[2] = new Driver("Olzhas",200000,1,"Mercedes",2020,101);
        printables[3] = new Driver("Arman",320000,7,"Howa",1990,103);
        printables[4] = new Driver("Daniyar",275000,10,"Opel",2000,103);

        //Параметры автобусов
        BusService.Route(printables);
        BusService.startDateBuses(printables);
        BusService.overMileages(printables);
    }
}
