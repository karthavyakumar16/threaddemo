package threaddemo;

public class PetrolStation {


        public synchronized void petrol(String vehicleNumber,int noOfLiters){
            for(int i=0;i<=noOfLiters;i++){
                System.out.println("Vehicle Number= " +vehicleNumber +"Filled Petrol in liters=  " +i);
            }
        }
        public synchronized void diesel(String vehicleNumber,int noOfLiters){
            for(int i=0;i<=noOfLiters;i++){
                System.out.println("Vehicle Number= " +vehicleNumber +"Filled Diesel in liters=  " +i);
            }
        }
    }
