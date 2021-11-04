import java.lang.Math;

public class FindRoots implements Calculate{

    public double findRoots (String function, double leftRange, double rightRange, double accuracy) {
        switch (function) {
            case "Exp": {
                double midPoint = (leftRange + rightRange) / 2;;
                do {
                    if (functionExp(midPoint) == 0) return midPoint;
                    if ((functionExp(leftRange)<0 & functionExp(midPoint)>0) | ((functionExp(leftRange)>0 & functionExp(midPoint)<0))) {
                        rightRange=midPoint;
                    }
                    if ((functionExp(rightRange)<0 & functionExp(midPoint)>0) | ((functionExp(rightRange)>0 & functionExp(midPoint)<0))) {
                        leftRange=midPoint;
                    }
                    midPoint = (leftRange + rightRange) / 2;
                }
                while (!((midPoint - leftRange) < accuracy) & !((rightRange - midPoint) < accuracy));
                return midPoint;
            }
            case "Sin": {
                double midPoint = (leftRange + rightRange) / 2;;
                do {
                    if (functionSin(midPoint) == 0) return midPoint;
                    if ((functionSin(leftRange)<0 & functionSin(midPoint)>0) | ((functionSin(leftRange)>0 & functionSin(midPoint)<0))) {
                        rightRange=midPoint;
                    }
                    if ((functionSin(rightRange)<0 & functionSin(midPoint)>0) | ((functionSin(rightRange)>0 & functionSin(midPoint)<0))) {
                        leftRange=midPoint;
                    }
                    midPoint = (leftRange + rightRange) / 2;
                }
                while (!((midPoint - leftRange) < accuracy) & !((rightRange - midPoint) < accuracy));
                return midPoint;
            }
            case "Ln": {
                double midPoint = (leftRange + rightRange) / 2;;
                do {
                    if (functionLn(midPoint) == 0) return midPoint;
                    if ((functionLn(leftRange)<0 & functionLn(midPoint)>0) | ((functionLn(leftRange)>0 & functionLn(midPoint)<0))) {
                        rightRange=midPoint;
                    }
                    if ((functionLn(rightRange)<0 & functionLn(midPoint)>0) | ((functionLn(rightRange)>0 & functionLn(midPoint)<0))) {
                        leftRange=midPoint;
                    }
                    midPoint = (leftRange + rightRange) / 2;
                }
                while (!((midPoint - leftRange) < accuracy) & !((rightRange - midPoint) < accuracy));
                return midPoint;
            }
            case "Tg": {
                double midPoint = (leftRange + rightRange) / 2;;
                do {
                    if (functionTg(midPoint) == 0) return midPoint;
                    if ((functionTg(leftRange)<0 & functionTg(midPoint)>0) | ((functionTg(leftRange)>0 & functionTg(midPoint)<0))) {
                        rightRange=midPoint;
                    }
                    if ((functionTg(rightRange)<0 & functionTg(midPoint)>0) | ((functionTg(rightRange)>0 & functionTg(midPoint)<0))) {
                        leftRange=midPoint;
                    }
                    midPoint = (leftRange + rightRange) / 2;
                }
                while (!((midPoint - leftRange) < accuracy) & !((rightRange - midPoint) < accuracy));
                return midPoint;
            }
            case "Cube": {
                double midPoint = (leftRange + rightRange) / 2;;
                do {
                    if (functionCube(midPoint) == 0) return midPoint;
                    if ((functionCube(leftRange)<0 & functionCube(midPoint)>0) | ((functionCube(leftRange)>0 & functionCube(midPoint)<0))) {
                        rightRange=midPoint;
                    }
                    if ((functionCube(rightRange)<0 & functionCube(midPoint)>0) | ((functionCube(rightRange)>0 & functionCube(midPoint)<0))) {
                        leftRange=midPoint;
                    }
                    midPoint = (leftRange + rightRange) / 2;
                }
                while (!((midPoint - leftRange) < accuracy) & !((rightRange - midPoint) < accuracy));
                return midPoint;
            }
        } throw new IllegalArgumentException ("Такой функции нету");
    }

    public double functionExp (double x) {
        return Math.exp(-x)-0.5;
    }

    public double functionSin (double x) {
        return Math.sin(x)-0.75;
    }

    public double functionLn (double x) {
        return Math.log(Math.pow(x,3))-2;
    }

    public double functionTg (double x) {
        return Math.tan(x);
    }

    public double functionCube (double x) {
        return Math.pow(x, 3) - 8 * x +2;
    }


    @Override
    public double calculate() {
        return 0;
    }
}
