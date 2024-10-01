package Sep30;

public class SampleDriver {

    // this is an example of a singleton class design pattern

    private static SampleDriver instance = null;
    private String name;

    private SampleDriver(){
        this.name= "";
    }

    public static SampleDriver getInstance(){
        if(SampleDriver.instance == null){
            instance = new SampleDriver();
            return instance;
        } else {
            return instance;
        }
    }

}
