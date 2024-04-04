package Aula4Main;

import Aula4.ConstructorDefault;
import Aula4.ConstructorOverload;
import Aula4.ConstructorOverwrite;

public class Constructor {
    public static void main(String args[]){
        System.out.println("ConstructorDefaut Examples");
        ConstructorDefault default_ = new ConstructorDefault();
        default_.printName();

        System.out.println("\nConstructorOverload Examples");
        ConstructorOverload overload = new ConstructorOverload("Andre", "Silva");
        overload.printName();
        ConstructorOverload overload2 = new ConstructorOverload("Andre Silva");
        overload2.printName();

        System.out.println("\nConstructorOverwrite Examples");
        ConstructorOverwrite overwrite = new ConstructorOverwrite("Andre", "Silva");
        overwrite.printName();
        ConstructorOverwrite overwrite2 = new ConstructorOverwrite();
        overwrite2.printName();
    }
    
}
