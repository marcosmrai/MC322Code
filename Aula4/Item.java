package Aula4;


public class Item implements Cloneable{
    private String name;
    private int power;

    public Item(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void upgrade(int power) {
        this.power += power;
    }

    @Override
    public Object clone(){
        return new Item(this.name, this.power);
    }

}
