abstract public class Target implements Dart {

    int points=0;

    public int  dartLandsOutsideTheTarget()
    {
        points= 0;
        return points;
    }

    public int dartOuterCircleOfTarget()
    {
        points = 1;
        return points;
    }

    public int dartMiddleCircleOfTarget()
    {
        points = 5;
        return points;

    }

    public int dartInnerCircleOfTarget()
    {
        points = 10;
        return points;

    }


}
