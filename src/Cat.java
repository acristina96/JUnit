public class Cat {

    private String name;
    private boolean happy = false;

    public Cat(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public boolean isHungry() {
        return happy;
    }
}
