package CSC2HW;

public class Daily extends Appt
{
public Daily(int day, int month, int year, String desc)
{
    super(day, month, year, desc);
}
public boolean occursOn(int day, int month, int year, String desc)
{
    if (day == this.getDay())
    {
        return true;
    }
    else
    {
        return false;
    }
}
}