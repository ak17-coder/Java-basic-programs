// public class TempToFahreneit {
//     public static void main(String[] args){
//         float Celsius = 36.78f;
//         float Fahreneit= (Celsius * 9/5) + 32;
//         System.out.println("Fahreneit : " + Fahreneit);
//     }
// }


public class CelsiusToFahreneit {
    public static void main(String[] args){
        float Fahreneit = 36.78f;
        float Celsius = (Fahreneit - 32) * 5/9;
        System.out.println("Celcius : " + Celsius);
    }
}
