package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService implements Service {

    @Override
    public Plane create() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Model = ");
        String model = scanner.nextLine();
        System.out.print("Enter Country = ");
        String country = scanner.nextLine();
        System.out.print("Enter Year = ");
        int year = scanner.nextInt();
        System.out.print("Enter Is Military = ");
        boolean military = scanner.nextBoolean();
        System.out.print("Enter Hours = ");
        int hours = scanner.nextInt();
        System.out.print("Enter Weight = ");
        int weight = scanner.nextInt();
        System.out.print("Enter Wingspan = ");
        int wingspan = scanner.nextInt();
        System.out.print("Enter Top Speed = ");
        int topSpeed = scanner.nextInt();
        System.out.print("Enter Seats = ");
        int seats = scanner.nextInt();
        System.out.print("Enter Cost = ");
        double cost = scanner.nextDouble();
        System.out.println("----------------------------------");

        return new Plane(model, country, year, hours, military, weight, wingspan, topSpeed, seats, cost);
    }

    @Override
    public Plane[] createPlainArray(int arrayLength) {
        Plane[] planes = new Plane[arrayLength];
        int i = 0;
        while (i < arrayLength) {
            System.out.println("Create Plain - " + (i + 1));
            planes[i] = create();
            i++;
        }
        return planes;
    }

    /*
     Task 1. (score 5)
    Create function:
    Parameter one Plane
    Result: print all information of the plane
    */
    @Override
    public void task1PrintInfo(Plane plane) {
        plane.printInfo();
    }


    /*
    Task 2. (score 5)
    Create function:
    Parameter one Plane
    Result: print cost and topSpeed if the plane is military otherwise print model and country
    */
    @Override
    public void task2(Plane plane) {
        System.out.println("----Task2----");
        if (plane.isMilitary()) {
            System.out.println("Cost= " + plane.getCost());
            System.out.println("Top Speed= " + plane.getTopSpeed());
        } else {
            System.out.println("Model = " + plane.getModel());
            System.out.println("Country = " + plane.getCountry());
        }
    }


    /*
    Task 3. (score 7)
    Create function:
    Parameter two Planes
    Result: return the plane which one is newer (if they have the same age return first one)
    */
    @Override
    public Plane task3(Plane plane1, Plane plane2) {
        System.out.println("----Task3----");
        if (plane1.getYear() >= plane2.getYear()) {
            return plane1;
        } else {
            return plane2;
        }
    }


    /*
    Task 4. (score 7)
    Create function:
    Parameter two planes
    Result: return the model of the plane which has  bigger wingspan (if they have the same - return second one)
    */
    @Override
    public Plane task4(Plane plane1, Plane plane2) {
        System.out.println("----Task4----");
        if (plane2.getWingspan() >= plane1.getWingspan()) {
            return plane2;
        } else {
            return plane1;
        }
    }

    /*
    Task 5. (score 7)
    Create function:
    Parameter three Planes
    Result: print country of the plane whit smallest seats count(if they have the same - print first)
    */
    @Override
    public void task5(Plane plane1, Plane plane2, Plane plane3) {
        System.out.println("----Task5----");
        if (plane1.getSeats() < plane2.getSeats() && plane1.getSeats() < plane3.getSeats()) {
            task1PrintInfo(plane1);
        } else if (plane2.getSeats() < plane1.getSeats() && plane2.getSeats() < plane3.getSeats()) {
            task1PrintInfo(plane2);
        } else {
            task1PrintInfo(plane3);
        }
    }


    /*
    Task 6. (score 7)
    Create function:
    Parameter array of Planes
    Result: print all not military planes
    */
    @Override
    public void task6(Plane[] planes) {
        System.out.println("----Task6----");
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                task1PrintInfo(plane);
            }
        }
    }

    /*
    Task 7. (score 10)
    Create function:
    Parameter array of Planes
    Result: print all military planes which were in air more 100 hours
    */
    @Override
    public void task7(Plane[] planes) {
        System.out.println("----Task7----");
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                task1PrintInfo(plane);
            }
        }
    }


    /*
    Task 8. (score 10)
    Create function:
    Parameter array of Planes
    Result: return the plane whit minimal weight (if there are some of them return last one)
    */
    @Override
    public Plane task8(Plane[] planes) {
        System.out.println("----Task8----");
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (min.getWeight() >= planes[i].getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }


    /*
    Task 9. (score 10)
    Create function:
    Parameter array of Planes
    Result: return the plane whit minimal cost from all military planes
    */
    @Override
    public Plane task9(Plane[] planes) {
        System.out.println("----Task9----");
        Plane minCostIsMilitaryPlain = null;

        for (int i = 1; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                if (minCostIsMilitaryPlain == null) {
                    minCostIsMilitaryPlain = planes[i];
                } else if (minCostIsMilitaryPlain.getCost() > planes[i].getCost()) {
                    minCostIsMilitaryPlain = planes[i];
                }

            }
        }
        return minCostIsMilitaryPlain;
    }


    /*
    Task 10. (score 12)
    Create function:
    Parameter array of planes
    Result: print planes in ascending  form order by year
     */
    @Override
    public void task10(Plane[] planes) {
        System.out.println("----Task10----");
        Plane tempPlane;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[j].getYear() < planes[j - 1].getYear()) {
                    tempPlane = planes[j - 1];
                    planes[j - 1] = planes[j];
                    planes[j] = tempPlane;
                }

            }
        }

        for (Plane plane : planes) {
            task1PrintInfo(plane);
        }
    }


}
