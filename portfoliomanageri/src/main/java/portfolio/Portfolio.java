package portfolio;


import java.util.ArrayList;
import java.util.Date;

public class Portfolio {

    private String namePortfolio;
    private ArrayList<Position> positions;

    private ArrayList<String> openPositions;
//    private String openPosition;

    public Portfolio(String name) {
        positions = new ArrayList<Position>();
        this.namePortfolio = name;
    }

    public String getName() {
        return namePortfolio;
    }

    public void add(Position position) {
        positions.add(position);
    }

    public String getOpenPositions() {

        openPositions = new ArrayList<String>();

        for (int i = 0; i < positions.size(); i++) {

            if ((positions.get(i).getEndDate()).compareTo(new Date()) > 0) {
//
//                System.out.print(positions.get(i).getName() + " fasz " + positions.get(i).getEndDate());

                if (positions.get(i).getName().contains("pA")) {
                    openPositions.add("portfolioA" + " : " + positions.get(i).getUuid());

                } else {
                    openPositions.add("portfolioB" + " : " + positions.get(i).getUuid());
                }
        //            openPositions.add("\n");
//                System.out.println(openPositions + " : ");
            }
//            System.out.println(" | ");
        }
        StringBuilder s = new StringBuilder();


        for (String openPosition : openPositions) {
            s.append(openPosition);
            s.append(" | ");
        }

        String str = s.toString();

        return str.substring(0, str.length()-3);
//        System.out.println(openPositions.toString() + "--------" );
//        System.out.println("+++++hi");
//        return "h";
//        System.out.println(openPositions);

//        return openPositions;
    }


//        return this.toString();


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Position position : positions) {
            s.append(position.toString());
            s.append(" | ");
        }
        return s.toString();
    }
}