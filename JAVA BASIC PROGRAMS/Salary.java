class Salary
{

    static void calculateBasic()
    {
        System.out.println("Basic Calculated");
    }

    static void calculateHRA()
    {
        calculateBasic();
        System.out.println("HRA done");
    }

    static void calculateDA()
    {
        calculateHRA();
        System.out.println("DA is calculated");
    }

    static void calculateTax()
    {
        calculateDA();
        System.out.println("Tax done");
    }

    static void calculateSalary()
    {
        calculateTax();
        System.out.println("Final Salary");
    }

    public static void main(String[] args)
    {
        calculateSalary();
;    }
}