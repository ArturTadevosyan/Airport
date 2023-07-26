package service;

import model.Plane;

public class PlaneService {
    /*
     Task 1. (score 5)
    Create function:
    Parameter one Plane
    Result: print all information of the plane
    */
    public void task1PrintInfo(Plane plane) {
        System.out.println("Model = " + plane.getModel());
        System.out.println("Country = " + plane.getCountry());
        System.out.println("Year = " + plane.getYear());
        System.out.println("Is Military = " + plane.isMilitary());
        System.out.println("Hours = " + plane.getHours());
        System.out.println("Weight = " + plane.getWeigth());
        System.out.println("Wingspan = " + plane.getWingspan());
        System.out.println("Top Speed= " + plane.getTopSpeed());
        System.out.println("Seats= " + plane.getSeats());
        System.out.println("Cost= " + plane.getCost());
        System.out.println("----------------------------------");
    }


/*
Task 2. (score 5)
Create function:
Parameter one Plane
Result: print cost and topSpeed if the plane is military otherwise print model and country

*/

    public void task2(Plane plane) {
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

    public Plane task3(Plane plane1, Plane plane2) {
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

    public Plane task4(Plane plane1, Plane plane2) {
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

    public void task5(Plane plane1, Plane plane2, Plane plane3) {
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


    public void task6(Plane[] planes) {
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
Result: print all military planes which were in air more then 100 hours
*/

    public void task7(Plane[] planes) {
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
Result: return the plane whit minimal weigth (if there are some of them return last one)
*/

    public Plane task8(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (min.getWeigth() >= planes[i].getWeigth()) {
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

    public Plane task9(Plane[] planes) {
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

    public void task10(Plane[] planes) {
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
