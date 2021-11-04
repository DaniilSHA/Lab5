import java.lang.Math;

@FunctionalInterface
public interface Calculate {
    void calculate ();
    static double roundUp (double value) {
        return Math.ceil(value*Math.pow(10, 4))*Math.pow(10, -4);
    }
    static void staticCalculate(){
        System.out.println("================================================================");
        System.out.println("Статический метод: ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1 part of lab");
        FindRoots findRoot = new FindRoots();
        findRoot.calculate();
        System.out.println("----------------------------------------------------------------");
        System.out.println("2 part of lab");
        CalculateIntegralOneDimensional calculateIntegralOneDimensional = new CalculateIntegralOneDimensional();
        calculateIntegralOneDimensional.calculate();
        System.out.println("----------------------------------------------------------------");
        System.out.println("3 part of lab");
        CalculateIntegralTwoDimensional calculateIntegralTwoDimensional = new CalculateIntegralTwoDimensional();
        calculateIntegralTwoDimensional.calculate();
        System.out.println("================================================================");
    }
}
