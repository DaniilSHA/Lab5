import java.lang.Math;

public class CalculateIntegralTwoDimensional implements Calculate {


    public double findIntegral(String function, double leftRangeOX, double rightRangeOX, double buttonRangeOY, double topRangeOY, double accuracy) {
        switch (function) {
            case "XY": {
                double intervalOX = (rightRangeOX - leftRangeOX) / accuracy;
                double intervalOY = (topRangeOY - buttonRangeOY) / accuracy;
                double sumSquare = 0;
                double axisOX = leftRangeOX;
                double axisOY = buttonRangeOY;
                for (int i = 0; i < accuracy; i++) {
                    axisOX += intervalOX;
                    for (int j = 0; j < accuracy; j++) {
                        axisOY += intervalOY;
                        double square = intervalOX * intervalOY * functionXY(axisOX - (intervalOX / 2), axisOY - (intervalOY / 2));
                        sumSquare += square;
                    }
                    axisOY = buttonRangeOY;
                }
                return sumSquare;
            }
            case "SquareX": {
                double intervalOX = (rightRangeOX - leftRangeOX) / accuracy;
                double intervalOY = (topRangeOY - buttonRangeOY) / accuracy;
                double sumSquare = 0;
                double axisOX = leftRangeOX;
                double axisOY = buttonRangeOY;
                for (int i = 0; i < accuracy; i++) {
                    axisOX += intervalOX;
                    for (int j = 0; j < accuracy; j++) {
                        axisOY += intervalOY;
                        double square = intervalOX * intervalOY * functionSquareX(axisOX - (intervalOX / 2), axisOY - (intervalOY / 2));
                        sumSquare += square;
                    }
                    axisOY = buttonRangeOY;
                }
                return sumSquare;
            }
            case "Exp": {
                double intervalOX = (rightRangeOX - leftRangeOX) / accuracy;
                double intervalOY = (topRangeOY - buttonRangeOY) / accuracy;
                double sumSquare = 0;
                double axisOX = leftRangeOX;
                double axisOY = buttonRangeOY;
                for (int i = 0; i < accuracy; i++) {
                    axisOX += intervalOX;
                    for (int j = 0; j < accuracy; j++) {
                        axisOY += intervalOY;
                        double square = intervalOX * intervalOY * functionExp(axisOX - (intervalOX / 2), axisOY - (intervalOY / 2));
                        sumSquare += square;
                    }
                    axisOY = buttonRangeOY;
                }
                return sumSquare;
            }
            case "CubeY": {
                double intervalOX = (rightRangeOX - leftRangeOX) / accuracy;
                double intervalOY = (topRangeOY - buttonRangeOY) / accuracy;
                double sumSquare = 0;
                double axisOX = leftRangeOX;
                double axisOY = buttonRangeOY;
                for (int i = 0; i < accuracy; i++) {
                    axisOX += intervalOX;
                    for (int j = 0; j < accuracy; j++) {
                        axisOY += intervalOY;
                        double square = intervalOX * intervalOY * functionCubeY(axisOX - (intervalOX / 2), axisOY - (intervalOY / 2));
                        sumSquare += square;
                    }
                    axisOY = buttonRangeOY;
                }
                return sumSquare;
            }
            case "Sin": {
                double intervalOX = (rightRangeOX - leftRangeOX) / accuracy;
                double intervalOY = (topRangeOY - buttonRangeOY) / accuracy;
                double sumSquare = 0;
                double axisOX = leftRangeOX;
                double axisOY = buttonRangeOY;
                for (int i = 0; i < accuracy; i++) {
                    axisOX += intervalOX;
                    for (int j = 0; j < accuracy; j++) {
                        axisOY += intervalOY;
                        double square = intervalOX * intervalOY * functionSin(axisOX - (intervalOX / 2), axisOY - (intervalOY / 2));
                        sumSquare += square;
                    }
                    axisOY = buttonRangeOY;
                }
                return sumSquare;
            }
        }
        throw new IllegalArgumentException("Такой функции нету");
    }

    public double functionXY(double x, double y) {
        return x * y;
    }

    public double functionSquareX(double x, double y) {
        return (Math.pow(x, 2) + x) * (2 * y + 1);
    }

    public double functionExp(double x, double y) {
        return Math.exp(-x * y);
    }

    public double functionCubeY(double x, double y) {
        return Math.pow(x, 2) + Math.pow(y, 3);
    }

    public double functionSin(double x, double y) {
        return x * y * Math.sin(x * y);
    }


    @Override
    public void calculate() {
        System.out.println("XY: " + Calculate.roundUp(this.findIntegral("XY", 1, 3, 1,3, 100)));
        System.out.println("SquareX: " + Calculate.roundUp(this.findIntegral("SquareX", 3, 4, 7,10,100)));
        System.out.println("Exp: " + Calculate.roundUp(this.findIntegral("Exp", 0.01, 2, 0.5,4,100)));
        System.out.println("CubeY: " + Calculate.roundUp(this.findIntegral("CubeY", 1, 3, 1,2,100)));
        System.out.println("Sin: " + Calculate.roundUp(this.findIntegral("Sin", 0, 1, 0,1,100)));

    }
}
