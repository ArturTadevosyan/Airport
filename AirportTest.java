import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest implements Menu {

    public static void main(String[] args) {
        AirportTest airportTest = new AirportTest();
        boolean isActive = true;
        while (isActive) {
            isActive = airportTest.menu();
        }
    }


    @Override
    public boolean menu() {
        Scanner scanner = new Scanner(System.in);
        PlaneService service = new PlaneService();
        System.out.println("Menu");
        System.out.println("Task2 = 2,");
        System.out.println("Task3 = 3,");
        System.out.println("Task4 = 4,");
        System.out.println("Task5 = 5,");
        System.out.println("Task6 = 6,");
        System.out.println("Task7 = 7,");
        System.out.println("Task8 = 8,");
        System.out.println("Task9 = 9,");
        System.out.println("Task10 = 10");

        System.out.print("Chose Task: ");
        int chooseMenu = scanner.nextInt();
        int arrayLength;
        switch (chooseMenu) {
            case 0:
                return false;
            case 2:
                Plane plane = service.create();
                service.task2(plane);
                break;
            case 3:
                System.out.println("Enter plane 1");
                Plane plane1 = service.create();
                System.out.println("Enter plane 2");
                Plane plane2 = service.create();
                service.task1PrintInfo(service.task3(plane1, plane2));
                break;
            case 4:
                System.out.println("Enter plane 1");
                Plane plane3 = service.create();
                System.out.println("Enter plane 2");
                Plane plane4 = service.create();
                service.task1PrintInfo(service.task4(plane3, plane4));
                break;
            case 5:
                System.out.println("Enter plane 1");
                Plane plane5 = service.create();
                System.out.println("Enter plane 2");
                Plane plane6 = service.create();
                System.out.println("Enter plane 3");
                Plane plane7 = service.create();
                service.task5(plane5, plane6, plane7);
                break;
            case 6:
                arrayLength = scanner.nextInt();
                System.out.println("Enter Plains Array length");
                service.task6(service.createPlainArray(arrayLength));
                break;
            case 7:
                System.out.println("Enter Plains Array length");
                arrayLength = scanner.nextInt();
                service.task7(service.createPlainArray(arrayLength));
                break;
            case 8:
                System.out.println("Enter Plains Array length");
                arrayLength = scanner.nextInt();
                service.task1PrintInfo(service.task8(service.createPlainArray(arrayLength)));
                break;
            case 9:
                System.out.println("Enter Plains Array length");
                arrayLength = scanner.nextInt();
                service.task1PrintInfo(service.task9(service.createPlainArray(arrayLength)));
                break;
            case 10:
                System.out.println("Enter Plains Array length");
                arrayLength = scanner.nextInt();
                service.task10(service.createPlainArray(arrayLength));
                break;

        }

        return true;

    }


}
