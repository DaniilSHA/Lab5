import java.lang.Math;

public class CalculateIntegralOneDimensional implements Calculate {

    public double findIntegral (String function, double leftRange, double rightRange, double accuracy) {
        switch (function) {
            case "Ln": {
                double interval = (rightRange-leftRange)/accuracy;
                double sumSquare=0;
                double axisOX=leftRange;
                for (int i=0; i<accuracy;i++){
                    axisOX +=interval;
                    double square = interval*functionLn(axisOX-(interval/2));
                    sumSquare +=square;
                }
                return sumSquare;
            }
            case "SquarePlus": {
                double interval = (rightRange-leftRange)/accuracy;
                double sumSquare=0;
                double axisOX=leftRange;
                for (int i=0; i<accuracy;i++){
                    axisOX +=interval;
                    double square = interval*functionSquarePlus(axisOX-(interval/2));
                    sumSquare +=square;
                }
                return sumSquare;
            }
            case "Exp":{
                double interval = (rightRange-leftRange)/accuracy;
                double sumSquare=0;
                double axisOX=leftRange;
                for (int i=0; i<accuracy;i++){
                    axisOX +=interval;
                    double square = interval*functionExp(axisOX-(interval/2));
                    sumSquare +=square;
                }
                return sumSquare;
            }
            case "Square": {
                double interval = (rightRange-leftRange)/accuracy;
                double sumSquare=0;
                double axisOX=leftRange;
                for (int i=0; i<accuracy;i++){
                    axisOX +=interval;
                    double square = interval*functionSquare(axisOX-(interval/2));
                    sumSquare +=square;
                }
                return sumSquare;
            }
            case "Sin":{
                double interval = (rightRange-leftRange)/accuracy;
                double sumSquare=0;
                double axisOX=leftRange;
                for (int i=0; i<accuracy;i++){
                    axisOX +=interval;
                    double square = interval*functionSin(axisOX-(interval/2));
                    sumSquare +=square;
                }
                return sumSquare;
            }
        }
        throw new IllegalArgumentException ("Такой функции нету");
    }

    public double functionLn (double x) {
        return Math.log(x);
    }

    public double functionSquarePlus (double x) {
        return Math.pow(x, 2) + x;
    }

    public double functionExp (double x) {
        return Math.exp(-x);
    }

    public double functionSquare (double x) {
        return Math.pow(x, 2);
    }

    public double functionSin (double x) {
        return x*Math.sin(x);
    }



    @Override
    public void calculate() {
        System.out.println("Ln: "+ Calculate.roundUp(this.findIntegral("Ln", 2, 5, 100)));
        System.out.println("SquarePlus: "+ Calculate.roundUp(this.findIntegral("SquarePlus", 3, 4, 100)));
        System.out.println("Exp: "+ Calculate.roundUp(this.findIntegral("Exp", 0.01, 2, 100)));
        System.out.println("Square: "+ Calculate.roundUp(this.findIntegral("Square", 1, 3, 100)));
        System.out.println("Sin: "+ Calculate.roundUp(this.findIntegral("Sin", 0, 1, 100)));
    }
}
