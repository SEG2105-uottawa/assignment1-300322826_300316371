import java.util.Random;

/**
 * Test Performance of PointCP, PointCP2, and PointCP3
 */
public class PerformanceTest {

    private static final int ITERATIONS = 100000000;

    public static void main(String[] args) {
        Random random = new Random();
        PointCP point1 = new PointCP('C', random.nextDouble(), random.nextDouble());
        PointCP point2 = new PointCP('P', random.nextDouble(), random.nextDouble());
        PointCP2 point3 = new PointCP2(random.nextDouble(), random.nextDouble());
        PointCP3 point4 = new PointCP3(random.nextDouble(), random.nextDouble());
        long startTime, endTime, runTime;

        startTime = System.currentTimeMillis();
        // test PointCP (Cartesian)
        System.out.println("****** PointCP Cartesian ******");
        testPointCP(point1);
        System.out.println("****** PointCP  Cartesian ******" + "\n" + "\n");

        // test PointCP (Polar)
        System.out.println("****** PointCP  Polar ******");
        testPointCP(point2);
        System.out.println("****** PointCP Polar ******" + "\n" + "\n");

        // test PointCP2
        System.out.println("****** PointCP2 ******");
        testPointCP2(point3);
        System.out.println("****** PointCP2 ******" + "\n" + "\n");

        // test PointCP3
        System.out.println("****** PointCP3 ******");
        testPointCP3(point4);
        System.out.println("****** PointCP3 ******" + "\n" + "\n");

        endTime = System.currentTimeMillis();
        runTime = (endTime - startTime)/1000;
        System.out.println("Total run time of program: " + runTime + " s");

    }

    public static void testPointCP(PointCP pointCP) {
        Random random = new Random();
        long startTime, endTime, elapsedTime, totalTime;

        double rotation = random.nextDouble();

        // test time of getX()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getX();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getX() in PointCP: " + elapsedTime + " ms");
        totalTime = elapsedTime;

        // test time of getY()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getY();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getY() in PointCP: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of getRho()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getRho();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getRho() in PointCP: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of getTheta()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getTheta();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getTheta() in PointCP: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of getDistance()
        // `pointCP` type "Cartesian"
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getDistance(pointCP);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getDistance() in PointCP: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of rotatePoint()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.rotatePoint(rotation);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for rotatePoint() in PointCP: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        System.out.println();
        System.out.println("*  Total time for pointCP: " + totalTime + " ms");
    }

    public static void testPointCP2(PointCP5 point) {
        Random random = new Random();
        long startTime, endTime, elapsedTime, totalTime;

        double rotation = random.nextDouble();

        // test time of getX()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getX();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getX() in PointCP2: " + elapsedTime + " ms");
        totalTime = elapsedTime;

        // test time of getY()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getY();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getY() in PointCP2: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of getRho()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getRho();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getRho() in PointCP2: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of getTheta()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getTheta();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getTheta() in PointCP2: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of getDistance()
        // `pointCP` type "Cartesian"
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getDistance(point);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getDistance() in PointCP2: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of rotatePoint()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.rotatePoint(rotation);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for rotatePoint() in PointCP2: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        System.out.println();
        System.out.println("*  Total time for pointCP2: " + totalTime + " ms");
    }

    public static void testPointCP3(PointCP5 point) {
        Random random = new Random();
        long startTime, endTime, elapsedTime, totalTime;

        double rotation = random.nextDouble();

        // test time of getX()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getX();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getX() in PointCP3: " + elapsedTime + " ms");
        totalTime = elapsedTime;

        // test time of getY()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getY();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getY() in PointCP3: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of getRho()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getRho();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getRho() in PointCP3: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of getTheta()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getTheta();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getTheta() in PointCP3: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of getDistance()
        // `pointCP` type "Cartesian"
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getDistance(point);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for getDistance() in PointCP3: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        // test time of rotatePoint()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.rotatePoint(rotation);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("*  Elapsed time for rotatePoint() in PointCP3: " + elapsedTime + " ms");
        totalTime += elapsedTime;

        System.out.println();
        System.out.println("*  Total time for pointCP3: " + totalTime + " ms");
    }



}
