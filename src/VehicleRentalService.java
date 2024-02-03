class VehicleRentalService{
    void vehicle(String type,boolean hasAnEngine,String rentalDuration,int engineCapacity,boolean insuranceIncluded){
        if(hasAnEngine && insuranceIncluded){
            System.out.println("Vehicle type rented is "+type+". It has an engine of capacity "+engineCapacity+" and has no insurance include.Tne rental duration selected is "+
                    rentalDuration);

        }
    }

    void vehicle(String type,boolean insuranceIncluded,String rentalDuration,boolean hasTwoWheels){
        if(insuranceIncluded && hasTwoWheels){
            System.out.println("Vehicle type rented is "+type+".it has two wheels and the rental duration chosen is "+rentalDuration+" .Note that insurance is included");
        }
    }

    void vehicle(String type,String rentalDuration,boolean hasbrakeBywire,boolean insuranceIncluded){
        if(insuranceIncluded && hasbrakeBywire){
            System.out.println("Vehicle type rented is "+type+".it has break by wire mechanism instead of the common mechanical breaking. Rental duration is "+rentalDuration+" .Note that insurance is not included");
        }
    }

    void vehicle(String type,int numberOfTurbines,boolean insuranceIncluded,String rentalDuration ){
        if(insuranceIncluded ){
            System.out.println("Vehicle type rented is "+type+".it has "+numberOfTurbines+" . Rental duration is "+rentalDuration+" .Note that insurance is included");
        }
    }
}

class main{
    public static void main(String[] args) {
        VehicleRentalService vehicleRentalService=new VehicleRentalService();
        System.out.println("The vehicle rented is ");
        vehicleRentalService.vehicle("car",true,"10 days",1400,true);
        System.out.println("*********************************** ");

        System.out.println("The vehicle rented is ");
        vehicleRentalService.vehicle("bike",false,"1 day",true);
        System.out.println("*********************************** ");

        System.out.println("The vehicle rented is ");
        vehicleRentalService.vehicle("scooter","10 days",true,true);
        System.out.println("*********************************** ");

        System.out.println("The vehicle rented is ");
        vehicleRentalService.vehicle("boat",10,true,"50 days");
        System.out.println("*********************************** ");

    }
}