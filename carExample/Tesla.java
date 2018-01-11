package homeworks.carExample;


public class Tesla extends Car {

    //Declare type variable
    String type;


    //Constrictor sets model and type of car
    public Tesla(String model, String type) {
        super(model);
        this.type = type;
    }

    //Increased/decreased speed
    @Override
    public void move(double speed){
        super.move(speed);
    }

    //Starts self driving mode
    public void selfDrivingMode(){
        System.out.println("Self driving mode applied: ");

    }
    //Shows message that engine started
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Modified by Tesla");

    }
    //Shows message gear changed
    @Override
    public void changeGears(char gears){
        super.changeGears(gears);
    }
}