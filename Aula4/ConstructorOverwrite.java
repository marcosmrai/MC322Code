package Aula4;

public class ConstructorOverwrite extends ConstructorOverload{
    private String fullName;

    public ConstructorOverwrite(){
        super("Andre", "Silva");
        fullName = "Default";
    }

    public ConstructorOverwrite(String name, String lastName){
        super(name, lastName);
        this.fullName = fullName + " Overwrite";
    }
}
