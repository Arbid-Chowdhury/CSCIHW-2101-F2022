package CSC2HW;

public class Appt {
    private int day;
    private int month;
    private int year;
    private String desc;
    
    public Appt(int day, int month, int year, String desc)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.desc = desc;
    }
    
    public int getDay()
    {
        return day;
    }
    public void setDay(int day)
    {
        this.day = day;
    }

    public int getMonth()
    {
        return month;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    public String getDesc()
    {
        return desc;
    }
    public void setDesc(String desc)
    {
        this.desc = desc;
    }
    
    public boolean occursOn(int day, int month, int year)
    {
        if (day == this.day && month == this.month && year == this.year)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
    

