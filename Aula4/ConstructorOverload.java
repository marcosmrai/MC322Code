package Aula4;

public class ConstructorOverload {
    private String fullName;

    public ConstructorOverload(String name, String lastName){
        this.fullName = name + " " + lastName;
    }

    public ConstructorOverload(String fullName){
        this.fullName = fullName;
    }

    public void printName(){
        System.out.println(fullName);
    }
    
}
