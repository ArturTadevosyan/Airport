import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest {

    public static void main(String[] args) {
        AirportTest airportTest = new AirportTest();
        airportTest.menu();

//        PlaneService service = new PlaneService();

//        Plane plane = airportTest.create();
//        Plane plane1 = airportTest.create();
//        Plane plane2 = airportTest.create();
//        Plane plane3 = airportTest.create();
//        Plane plane4 = airportTest.create();


//        Plane plane = new Plane("Boing 20", "Armenia", 2000, 3000, true, 50000, 16, 500, 100, 1000);
//        Plane plane1 = new Plane("Boing 21", "France", 1993, 5000, false, 19000, 30, 300, 200, 55555);
//        Plane plane2 = new Plane("Boing 22", "German", 1920, 350, true, 100000, 44, 400, 50, 25.55);
//        Plane plane3 = new Plane("Boing 23", "Argentina", 2020, 1000, false, 80000, 20, 800, 20, 50000);
//        Plane plane4 = new Plane("Boing 24", "Armenia", 2012, 500, true, 15000, 26, 900, 1000, 10000);

//        Plane[] planes = {plane, plane1, plane2, plane3, plane4};
//        System.out.println("Task2");
//        service.task2(plane);
//        System.out.println("Task3");
//        service.task1PrintInfo(service.task3(plane, plane1));
//        System.out.println("Task4");
//        service.task1PrintInfo(service.task4(plane, plane1));
//        System.out.println("Task5");
//        service.task5(plane1, plane2, plane3);
//        System.out.println("Task6");
//        service.task6(planes);
//        System.out.println("Task7");
//        service.task7(planes);
//        System.out.println("Task8");
//        service.task1PrintInfo(service.task8(planes));
//        System.out.println("Task9");
//        service.task1PrintInfo(service.task9(planes));
//        System.out.println("Task10");
//        service.task10(planes);

    }

    public Plane create() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Model = ");
        String model = scanner.nextLine();
        System.out.println("Enter Country = ");
        String country = scanner.nextLine();
        System.out.println("Enter Year = ");
        int year = scanner.nextInt();
        System.out.println("Enter Is Military =");
        boolean military = scanner.nextBoolean();
        System.out.println("Enter Hours = ");
        int hours = scanner.nextInt();
        System.out.println("Enter Weight = ");
        int weigth = scanner.nextInt();
        System.out.println("Enter Wingspan = ");
        int wingspan = scanner.nextInt();
        System.out.println("Enter Top Speed=");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter Seats= ");
        int seats = scanner.nextInt();
        System.out.println("Enter Cost= ");
        double cost = scanner.nextDouble();
        System.out.println("----------------------------------");

        return new Plane(model, country, year, hours, military, weigth, wingspan, topSpeed, seats, cost);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        PlaneService service = new PlaneService();
        System.out.println("Chose one = Task2 = 2,Task3 = 3,Task4 = 4,Task5 = 5,Task6 = 6,Task7 = 7,Task8 = 8,Task9 = 9,Task10 = 10");
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu) {
            case 2:
                System.out.println("Task2");
                Plane plane = create();
                service.task2(plane);
                break;
            case 3:
                System.out.println("Task3");
                System.out.println("Enter plane 1");
                Plane plane1 = create();
                System.out.println("Enter plane 2");
                Plane plane2 = create();
                service.task3(plane1, plane2);
                break;
            case 4:
                System.out.println("Task4");
                System.out.println("Enter plane 1");
                Plane plane3 = create();
                System.out.println("Enter plane 2");
                Plane plane4 = create();
                service.task4(plane3, plane4);
                break;
            case 5:
                System.out.println("Task5");
                System.out.println("Enter plane 1");
                Plane plane5 = create();
                System.out.println("Enter plane 2");
                Plane plane6 = create();
                System.out.println("Enter plane 3");
                Plane plane7 = create();
                service.task5(plane5, plane6, plane7);
                break;
            case 6:
                System.out.println("Task6");
                int arrayLength = scanner.nextInt();
                System.out.println("Enter Array length");
                Plane[] planes = new Plane[arrayLength];
                while (arrayLength > 0) {
                    planes[arrayLength - 1] = create();
                    arrayLength--;
                }

                service.task6(planes);
                break;
            case 7:
                System.out.println("Task7");
                System.out.println("Enter Array length");
                int arrayLength1 = scanner.nextInt();
                Plane[] planes1 = new Plane[arrayLength1];
                while (arrayLength1 > 0) {
                    planes1[arrayLength1 - 1] = create();
                    arrayLength1--;
                }

                service.task7(planes1);
                break;
            case 8:
                System.out.println("Task8");
                System.out.println("Enter Array length");
                int arrayLength2 = scanner.nextInt();
                Plane[] planes2 = new Plane[arrayLength2];
                while (arrayLength2 > 0) {
                    planes2[arrayLength2 - 1] = create();
                    arrayLength2--;
                }

                service.task7(planes2);
                break;
            case 9:
                System.out.println("Task9");
                System.out.println("Enter Array length");
                int arrayLength3 = scanner.nextInt();
                Plane[] planes3 = new Plane[arrayLength3];
                while (arrayLength3 > 0) {
                    planes3[arrayLength3 - 1] = create();
                    arrayLength3--;
                }

                service.task9(planes3);
                break;
            case 10:
                System.out.println("Task10");
                System.out.println("Enter Array length");
                int arrayLength4 = scanner.nextInt();
                Plane[] planes4 = new Plane[arrayLength4];
                while (arrayLength4 > 0) {
                    planes4[arrayLength4 - 1] = create();
                    arrayLength4--;
                }

                service.task10(planes4);
                break;
        }
    }

}
