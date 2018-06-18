package portfolio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Portfolio portfolioA = new Portfolio("portfolioA");
        Portfolio portfolioB = new Portfolio("portfolioB");


        Position positionA1 = new Position("pA 1", new Date(1497037920000L), new Date(1629265120000L));
        Position positionA2 = new Position("pA 2", new Date(1483991520000L), new Date(1429261120000L));
        Position positionA3 = new Position("pA 3", new Date(1391971420000L), new Date(1629265120000L));
        Position positionB1 = new Position("pB 1", new Date(1463443290000L), new Date(1499265120000L));
        Position positionB2 = new Position("pB 2", new Date(1193992220000L), new Date(1429265120000L));
        Position positionB3 = new Position("pB 3", new Date(1513431930000L), new Date(1911265120000L));
        portfolioA.add(positionA1);
        portfolioA.add(positionA2);
        portfolioA.add(positionA3);
        portfolioB.add(positionB1);
        portfolioB.add(positionB2);
        portfolioB.add(positionB3);

        portfolioA.getOpenPositions();
        portfolioB.getOpenPositions();
//        System.out.println();
//        System.out.println(positionA1.getStartDate());
//        System.out.println(positionA2.getEndDate());
//

    }


}
