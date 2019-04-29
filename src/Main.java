public class Main {

    public static void main(String[] args)
    {
        Dart dart = new DartOnTarget();
        int score=0;

        dart.setPoint(20.8);
        score = dart.getPoints();
        System.out.println("Score is :" +score);

        dart.setPoint(1.6);
        score = dart.getPoints();
        System.out.println("Score is :" +score);

        dart.setPoint(6.8);
        score = dart.getPoints();
        System.out.println("Score is :" +score);

        dart.setPoint(4.4);
        score = dart.getPoints();
        System.out.println("Score is :" +score);

        dart.setPoint(0.5);
        score = dart.getPoints();
        System.out.println("Score is :" +score);


    }


}
