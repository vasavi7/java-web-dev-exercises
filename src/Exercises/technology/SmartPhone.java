package Exercises.technology;

public class SmartPhone extends Computer {
    private String brand;

    public SmartPhone(int storage, int ram, boolean hasKeyboard,String brand,int model){
        super(storage,ram,hasKeyboard);
        this.brand = brand;
    }
    public void brands(){
        System.out.println("The brandname is:");

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
