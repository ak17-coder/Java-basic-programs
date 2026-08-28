public class CinemaSeating
{
    public static void main(String[] args)
    {
        int total_members = 125;
        int seats_per_row = 12;
        System.out.println("Total members : " + total_members);
        System.out.println("Total number of rows : " +
        (total_members/seats_per_row));
        System.out.println("Remaining members : " + (total_members%seats_per_row));
    }
}
