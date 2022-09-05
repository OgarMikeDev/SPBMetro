import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import core.Line;
import core.Station;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Proba {

    private static String dataFile = "SPBMetro/src/main/resources/map.json";

    private static String getJsonFile() {

        StringBuilder builder = new StringBuilder();

        try {

            List<String> lines = Files.readAllLines(Paths.get(dataFile));

            lines.forEach(line -> builder.append(line));

        }

        catch (Exception ex) {

            ex.printStackTrace();

        }

        return builder.toString();

    }

//    static ArrayList<Station> routeForDuration;
    static Station station_1__1;
    static Station station_1__2;
    static Station station_1__3;


    static Station station_2__1;
    static Station station_2__2;
    static Station station_2__3;


    static Station station_3__1;
    static Station station_3__2;
    static Station station_3__3;

    static ArrayList arrayListRoute = new ArrayList<>();
    public static void main(String[] args) {

//        routeForDuration = new ArrayList<>();

        Line line1 = new Line(1, "Кировско-Выборгская линия");
        Line line2 = new Line(2, "Московско-Петроградская линия");
        Line line3 = new Line(2, "Невско-Василеостровская линия");

        station_1__1 = new Station("Площадь Ленина" , line1);
        station_1__2 = new Station("Чернышевская" , line1);
        station_1__3 = new Station("Площадь Восстания" , line1);


        station_2__1 = new Station("Петроградская", line2);
        station_2__2 = new Station("Горьковская", line2);
        station_2__3 = new Station("Невский проспект", line2);

        station_3__1 = new Station("Василеостровская", line3);
        station_3__2 = new Station("Гостиный двор", line3);
        station_3__3 = new Station("Маяковская", line3);

//        arrayListRoute.add(station_1__1);
//        arrayListRoute.add(station_1__2);
//        arrayListRoute.add(station_1__3);
//        arrayListRoute.add(station_2__1);
//        arrayListRoute.add(station_2__2);
//        arrayListRoute.add(station_2__3);
//        arrayListRoute.add(station_3__1);
//        arrayListRoute.add(station_3__2);
//        arrayListRoute.add(station_3__3);
        //__//
        arrayListRoute.add(station_1__3);
        arrayListRoute.add(station_3__3);
        arrayListRoute.add(station_3__2);
        arrayListRoute.add(station_2__3);


//
//        for (Station route : routeForDuration) {
//            System.out.println(route);
//        }


//        //Создание объекта класса RouteCalculator()
//        StationIndex stationIndex = new StationIndex();
//        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);
//
//        //Использование методов класса RouteCalculator()
//        routeCalculator.getShortestRoute(station_1__1, station_1__3);

        //Вывод продолжительности маршрута


        System.out.println(calculateDuration(arrayListRoute));

//        Proba proba = new Proba();
//        proba.probaGetRouteOnTheLine();
    }


    //Расчёт продолжительности маршрута
    public static double calculateDuration(ArrayList route) {
        int durationInt = 0;
        Station previousStation = null;
        Station presentStation;
        for (int i = 0; i <= route.size(); i++) {
            presentStation = route.get(i);
            int numberPreviousStation = previousStation.getLine().getNumber();
            int numberPresentStation = presentStation.getLine().getNumber();

            if (numberPreviousStation == numberPresentStation) {
                durationInt += 2;
            } else {
                durationInt += 3;
            }

        }
        return durationInt;

//        double duration = 0.0;
//        Station previousStation = null;
//        for(int i = 0; i < route.size(); i++) {
//            Station station = route.get(i);
//            if(i > 0) {
//                duration += previousStation.getLine().equals(station.getLine()) ?
//                        2 : 3;
//            }
//            previousStation = station;
//        }
//        return duration;
    }



//    List<Station> route;
//
//    Line line1 = new Line(1, "Первая");
//
//        public void probaGetRouteOnTheLine() {
//            route.add(new Station("Петровская", line1));
//            route.add(new Station("Арбузная", line1));
//            RouteCalculator directionDir = null;
//            System.out.println(directionDir.getShortestRoute(route.get(0), route.get(1)));
//        }

//        String one = "one";
//        String two = "two";
//        String five = "five";
//
//        int one_1 = 1;
//        int two_2 = 2;
//        int five_5 = 5;
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(5);
//
//        System.out.println(arrayList.get(1).compareTo(arrayList.get(0)));

//        switch (five) {
//            case 2:
//                System.out.println("True");
//                break;
//            case 1:
//                System.out.println("False_1");
//                break;
//            case 5:
//                System.out.println("False_2");
//                break;
//        }
}
