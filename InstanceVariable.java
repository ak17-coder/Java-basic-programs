
public class InstanceVariable {

    static float age; //-->Default value will be 0.0

    public static void main(String[] args) {
        // int age; -->The local variable age may not have been initialized
        System.out.println(age);
    }
}
