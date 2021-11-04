public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.innerCall();
        main.anonimusCall();
        Calculate.staticCalculate();
        main.instanceCall();
        main.lamdaCall();

    }

    private void lamdaCall(){
        Calculate calculate = () -> {
            System.out.println("Лямда метод: ");
            System.out.println("1 part of lab");
            FindRoots findRoot = new FindRoots();
            findRoot.calculate();
            System.out.println("2 part of lab");
            CalculateIntegralOneDimensional calculateIntegralOneDimensional = new CalculateIntegralOneDimensional();
            calculateIntegralOneDimensional.calculate();
        };
        calculate.calculate();
    }

    private void instanceCall(){
        System.out.println("Метод экземпляра: ");
        System.out.println("1 part of lab");
        FindRoots findRoot = new FindRoots();
        findRoot.calculate();
        System.out.println("2 part of lab");
        CalculateIntegralOneDimensional calculateIntegralOneDimensional = new CalculateIntegralOneDimensional();
        calculateIntegralOneDimensional.calculate();
    }

    private void anonimusCall() {
        Calculate calculate = new Calculate() {
            @Override
            public void calculate() {
                System.out.println("Анонимный класс: ");
                System.out.println("1 part of lab");
                FindRoots findRoot = new FindRoots();
                findRoot.calculate();
                System.out.println("2 part of lab");
                CalculateIntegralOneDimensional calculateIntegralOneDimensional = new CalculateIntegralOneDimensional();
                calculateIntegralOneDimensional.calculate();
            }
        };
        calculate.calculate();
    }

    private void innerCall() {
        Inner inner = new Inner();
        inner.calculate();
    }

    private class Inner implements Calculate {
        @Override
        public void calculate() {
            System.out.println("Вложенный класс: ");
            System.out.println("1 part of lab");
            FindRoots findRoot = new FindRoots();
            findRoot.calculate();
            System.out.println("2 part of lab");
            CalculateIntegralOneDimensional calculateIntegralOneDimensional = new CalculateIntegralOneDimensional();
            calculateIntegralOneDimensional.calculate();
        }
    }


}

