package portfolio;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Position {

    private String name;
    private String uuid;
    private Date startDate;
    private Date endDate;


    public Position(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.uuid = UuidGenrator.getAlphaNumeric();
    }


    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getUuid() {
        return uuid;
    }
}
