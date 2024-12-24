package powerpackage;

//fixed the naming convention and errors 
//used the camelCase for method name and PascalCase for class name
//used the meaningful variable names with camelCase

public class PowerFinder {
    public static int getPowerOf(int base, int expo) {
        int result = 1;
        for (int i = 0; i<expo; i++) {
            result *= base;
        }
        return result;
    }
}
