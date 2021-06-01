package Exercises.technology;

public class Laptop extends Computer{
    private int model;

    public Laptop(int storage, int ram, boolean hasKeyboard,int model){
        super(storage,ram,hasKeyboard);
        this.model = model;

    }
    public void model1(){
        System.out.println("The model is:");
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
