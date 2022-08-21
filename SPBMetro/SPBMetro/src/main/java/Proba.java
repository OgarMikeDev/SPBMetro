import java.util.ArrayList;
import core.Line;
import core.Station;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

public class Proba {
    public static void main(String[] args) {
        Proba proba = new Proba();
        proba.probaGetRouteOnTheLine();
    }

    List<Station> route;

    Line line1 = new Line(1, "Первая");

        public void probaGetRouteOnTheLine() {
            route.add(new Station("Петровская", line1));
            route.add(new Station("Арбузная", line1));
            RouteCalculator directionDir = null;
            System.out.println(directionDir.getShortestRoute(route.get(0), route.get(1)));
        }

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
