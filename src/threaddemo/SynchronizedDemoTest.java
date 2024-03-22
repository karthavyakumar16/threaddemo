package threaddemo;

public class SynchronizedDemoTest {
    public static void main(String[] args) {
        PetrolStation petrolStation=new PetrolStation();

        Vehicle ts02en4941=new Vehicle(3,"empty","Petrol",petrolStation);
        ts02en4941.setName("ts02en4941");

        Vehicle ap2418199=new Vehicle(2,"empty","Petrol",petrolStation);
        ap2418199.setName("ap2418199");

        Vehicle ap074301=new Vehicle(2,"empty","Petrol",petrolStation);
        ap074301.setName("ap074301");

        Vehicle ap12345=new Vehicle(15,"empty","Diesel",petrolStation);
        ap12345.setName("ap12345");

        Vehicle tg11111=new Vehicle(20,"empty","Diesel",petrolStation);
        tg11111.setName("tg11111");

        ts02en4941.start();
        ap2418199.start();
        ap074301.start();
        ap12345.start();
        tg11111.start();

}
}

