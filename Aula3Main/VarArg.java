package Aula3Main;

public class VarArg{
    public static void main (String args[]){
      float f1 = 3.6f;
      float f2 = 2.5f;
      float f3 = 9.7f;
      Exemplo e = new Exemplo();
  
      System.out.println("Media de f1 e f2: "+media(f1, f2));
      System.out.println("Media de f1, f2 e f3: "+media(f1, f2, f3));
      System.out.println("Media de fs: "+media(f1, f1, f2, f3, 0.635f));
      print(f1, 0.324, 1, "Oi", e);
    }
  
    public static float media(float...f){
      float media = 0.0f;
      for (float fi:f)
        media += fi;
      media /= f.length;
      return media;
    }

    public static void print(Object ... objects){
        for (Object o:objects){
          System.out.println(o);
        }
    }
  }

  class Exemplo{
    @Override
    public String toString() {
      return "dkjsaldkjasldkja";
    }

  }