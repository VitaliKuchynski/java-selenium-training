package homeworks.carExample;


public class Mercedes extends Car {

    //Declare type variable
    private String type;

    //Constrictor sets model and type of car
    public Mercedes(String model, String type) {
        super(model);
        this.type = type;
    }
    //Shows message that engine started
    @Override
    public void startEngine() {
        super.startEngine();

    }
    //Shows message gear changed
    @Override
    public void changeGears(char gears){
       super.changeGears(gears);
    }

    //Shows message that engine stopped
    @Override
    public void stopEngine() {
        super.stopEngine();

    }
    @Override
    //Increased/decreased speed
    public void move(double speed){
        super.move(speed);
    }


}
