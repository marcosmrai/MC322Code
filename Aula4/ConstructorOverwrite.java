package Aula4;

public class ConstructorOverwrite extends ConstructorOverload{
    public ConstructorOverwrite(){
        super("Default");
    }

    public ConstructorOverwrite(String name, String lastName){
        super(name+" "+lastName+ " Overwrite");
        //this.fullName = fullName + " Overwrite";
    }
}
