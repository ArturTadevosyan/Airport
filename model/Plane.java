package model;

public class Plane {
    private String model; // - name of the plane +
    private String country;// - country the plane belongs to +
    private int year = 1903;// - year of publishing (from 1903 to 2021) +
    private int hours = 0; //- hours in air (from 0 to 10000) +
    private boolean military;// - is military or not +
    private int weight = 10000;// - weigthof plane (from 10000 KG to 160000 KG) +
    private int wingspan = 10;// - the maximum extent across the wings of an aircraft (from 10 - 45)+
    private int topSpeed = 1;// - maximal speed per hour (1000 km/h) (any not negative value)+
    private int seats;// - number of seats (any not negative value)+
    private double cost = 0; //- cost of the plane(ex: 445.8$) (any not negative value)+

    public Plane(String model, String country, int year, int hours, boolean military, int weight, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        setYear(year);
        setHours(hours);
        this.military = military;
        setWeight(weight);
        setWingspan(wingspan);
        setTopSpeed(topSpeed);
        setSeats(seats);
        setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2021) {
            this.year = year;
        } else {
            System.out.println("Wrong set year [1903-2021], is set default value: 1903 ");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Wrong set hour [0-10000], is set default value: 0");
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 10000 && weight <= 160000) {
            this.weight = weight;
        } else {
            System.out.println("Wrong set weight [10000-160000] ,is set default value: 10000");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("Wrong set Wingspan[10-45], is set default value: 10");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed > 0 && topSpeed <= 1000) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("Wrong set top speed(0-1000], is set default value: 1");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            System.out.println("Cost was not negative(0 greater),is set default value: 1 ");
        }
    }

    public void printInfo() {
        System.out.println("Model = " + model);
        System.out.println("Country = " +country);
        System.out.println("Year = " + year);
        System.out.println("Is Military = " + military);
        System.out.println("Hours = " + hours);
        System.out.println("Weight = " + weight);
        System.out.println("Wingspan = " + wingspan);
        System.out.println("Top Speed= " + topSpeed);
        System.out.println("Seats= " + seats);
        System.out.println("Cost= " + cost);
        System.out.println("----------------------------------");
    }
}
