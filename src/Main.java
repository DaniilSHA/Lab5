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
            FindRoots findRoot = new FindRoots();
            findRoot.calculate();
        };
        calculate.calculate();
    }

    private void instanceCall(){
        System.out.println("Метод экземпляра: ");
        FindRoots findRoot = new FindRoots();
        findRoot.calculate();
    }

    private void anonimusCall() {
        Calculate calculate = new Calculate() {
            @Override
            public void calculate() {
                System.out.println("Анонимный класс: ");
                FindRoots findRoot = new FindRoots();
                findRoot.calculate();
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
            FindRoots findRoot = new FindRoots();
            findRoot.calculate();
        }
    }


}

