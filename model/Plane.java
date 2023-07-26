package model;

public class Plane {
    private String model; // - name of the plane +
    private String country;// - country the plane belongs to +
    private int year;// - year of publishing (from 1903 to 2021) +
    private int hours; //- hours in air (from 0 to 10000) +
    private boolean military;// - is military or not +
    private int weigth;// - weigthof plane (from 10000 KG to 160000 KG) +
    private int wingspan;// - the maximum extent across the wings of an aircraft (from 10 - 45)+
    private int topSpeed;// - maximal speed per hour (1000 km/h) (any not negative value)+
    private int seats;// - number of seats (any not negative value)+
    private double cost; //- cost of the plane(ex: 445.8$) (any not negative value)+

    public Plane(String model, String country, int year, int hours, boolean military, int weigth, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        setYear(year);
        setHours(hours);
        this.military = military;
        setWeigth(weigth);
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
            System.out.println("Wrong set year");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Wrong set hour");
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        if (weigth >= 10000 && weigth <= 160000) {
            this.weigth = weigth;
        } else {
            System.out.println("Wrong set weight");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("Wrong set Wingspan");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed > 0 && topSpeed <= 1000) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("Wrong set top speed");
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
            System.out.println("Cost was not negative");
        }
    }

}
