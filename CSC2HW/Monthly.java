package CSC2HW;

public class Monthly extends Appt
{
    public Monthly(int day, int month, int year, String desc)
    {
        super(day, month, year, desc);
    }
public boolean occursOn(int day, int month, int year, String desc)
{
    if (month == this.getMonth())
    {
        return true;
    }
    else
    {
        return false;
    }

}

}