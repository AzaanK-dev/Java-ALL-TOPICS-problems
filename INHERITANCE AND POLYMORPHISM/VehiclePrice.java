// Create a base class Vehicle and its subclasses Car and Bike. Apply constructor chaining, method overriding, and membership-based price discounts using polymorphism.

class Vehicle {
    public String brand; 
    public String model;
    public int year;
    public double basePrice;
    public String member;

    public Vehicle(String brand,String model){
        this(brand,model,2007,0.0,"no");
    }

    public Vehicle(String brand,String model,int year,double basePrice,String member){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
        this.member = member;
    }

    public void displayDetail() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
        System.out.println(basePrice);
        System.out.println(member);
    }

    public double calculatePrice(){
        return basePrice;
    }
}

class Car extends Vehicle {
    String seater;
    String origin;

    public Car(String brand,String model,int year,double basePrice,String member,String seater,String origin){
        super(brand,model,year,basePrice,member);
        this.seater=seater;
        this.origin=origin;
    }

    @Override 
    public double calculatePrice(){
        if(member=="yes") return basePrice-(basePrice*(7.5/100));
        return basePrice;
    }
}

class Bike extends Vehicle{
    String gears;
    String hp;

    public Bike(String brand,String model,int year,double basePrice,String member,String gears,String hp){
        super(brand,model,year,basePrice,member);
        this.gears=gears;
        this.hp=hp;
    }

    @Override 
    public double calculatePrice(){
        if(member=="yes") return basePrice-(basePrice*(15.0/100));
        return basePrice;
    }
}

public class VehiclePrice {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Hello World","Am-24",2021,2000.20,"yes");
        System.out.println(v1.calculatePrice());

        Car car = new Car("Hello World","Am-24",2021,2000.20,"no","four","Japan");
        System.out.println(car.calculatePrice());

        Bike bike = new Bike("Hello World","Am-24",2021,2000.20,"yes","five","150CC");
        System.out.println(bike.calculatePrice());
    }
}
