public class Date {
    int date;
    int month;
    int year;

    Date(int date,int month,int year ){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        return this.month + "-" + this.date + "-" + this.year;
    }
}
