package homeworks.carExample;


/**
 Homework #1.
 Start with a Car class as base class. 
 Finally, create another class, a specific type of Car that inherits 
 from the Car class. You should be able to hand steering, changing gears, 
 and moving (speed in other words).You will want to decide where to 
 put the appropriate state and behaviors (fields and methods).As mentioned 
 above, changing gears, increasing/decreasing speed should be included.
 For you specific type of vehicle you will want to add something 
 specific for that type of car.


 Homework #2
 Now create 3 sub classes for your favorite vehicles.
 Override the appropriate methods to demonstrate polymorphism in use.
 put all classes in the one java file.
**/

public class Car  implements  InterfaceCar{
    //Declares speed variable
    private double speedMPH;
    //Declares model variables
    private String model;
    //Declare gear variable
    private char gears;

    //Sets model of the car
    public Car(String model) {
        this.model = model;
    }

//beginning getters/setters block
    public double getSpeedMPH() {
        return speedMPH;
    }

    public String getModel() {
        return model;
    }

    public char getGears() {
        return gears;
    }

    public void setGears(char gears) {
        this.gears = gears;
    }//end getters/setters block

    //Starts engine
    @Override
    public void startEngine() {
        System.out.println(getModel() + " engine started");
    }
    //Changes gears
    @Override
    public void changeGears(char gears){
        this.gears = gears;
        System.out.println(getModel() + " gear: " + getGears());
    }

    //Increases or decreases speed
    public void move(double speed){
    //Checks if speed increases or decreases
        if(this.speedMPH <= speed) {
            speedMPH = speedMPH + speed;
            System.out.println( getModel() + " speed increase for: " + speed + " ml and now = "+ getSpeedMPH()+ " ml");
        }else if (this.speedMPH == 0){
            System.out.println(getModel() + " has already stopped");

        }else {
            speedMPH = speedMPH - (- speed);
            System.out.println(getModel()+ " speed decrease for: " + speed + " ml and now = "+ getSpeedMPH()+ " ml");
        }

    }
    //Stops engine
    @Override
    public void stopEngine() {
        System.out.println(getModel() + " engine stopped");

    }

}
