package homeworks.carExample;

public class Main {

    public static void main (String [] arg) {

        //Instance of tesla car
        Tesla tesla = new Tesla("Tesla", "S");
        //Instance of mercedes
        Mercedes mercedes = new Mercedes("Mercedes","C140");


        tesla.move(100);
        //Calls method start engine for tesla car
        startCar(tesla);
        //Prints empty line
        System.out.println();
        //Calls method start engine for mercedes car
        startCar(mercedes);


    }

    //Calls appropriate startEngine method depends on what object passed as an argument, shows polymorphism
    public static  void startCar(Car car){
        car.startEngine();
    }

}
