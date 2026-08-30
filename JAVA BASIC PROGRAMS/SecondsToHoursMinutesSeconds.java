
class SecondsToHoursMinutesSeconds
{

    public static void main(String[] args)
    {
        int sec = 7200;
        int minutes = sec / 60;
        int hours = minutes / 60;

        System.out.println("Seconds : " + sec);
        System.out.println("Minutes : " + minutes);
        System.out.println("hours : " + hours);
    }
}
