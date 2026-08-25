
public class AverageAndPercentage
{
    public static void main(String[] args) 
    {
        int sub1 = 23;
        int sub2 = 43;
        int sub3 = 47;

        int total = sub1 + sub2 + sub3;
        System.out.println("Total : " + total);
        double avg = (total)/3.0;
        System.out.println("Average : "+avg);
        double percentage = (total/300.0) * 100;
        System.out.println("Percentage : " + percentage + "%");


    }
}
