public class DartOnTarget extends Target {

    private double dartPoint=0.0;
    private int points=0;
    private int innerRadius;
    private int middleRadius;
    private int OuterRadius;
    private int OutsideTarget;


    DartOnTarget()
    {
        innerRadius = 1;
        middleRadius = 5;
        OuterRadius = 10;
        OutsideTarget = 20;  //assumption

    }

    public void setPoint(double dartPoint)
    {
        this.dartPoint = dartPoint;
        CalculateDartPoints(dartPoint);
    }

    public void CalculateDartPoints(double dartPoint)
    {
        if( dartPoint <= innerRadius )
        {
            points = dartInnerCircleOfTarget();

        }
        else if( dartPoint <= middleRadius)
        {
            points = dartMiddleCircleOfTarget();
        }
        else if( dartPoint <= OuterRadius )
        {
            points = dartOuterCircleOfTarget();
        }
        else
        {
            points = dartLandsOutsideTheTarget();
        }

    }

    public int getPoints()
    {
        return points;
    }

}
