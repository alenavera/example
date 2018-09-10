package Animals;

public class LovelyAnimalArrays {

    public static void main(String[] args) {
        try{
            doTest();
        }
        catch(MyException me){
            System.out.println(me);
        }
    }
    
    static void doTest() throws MyException{
        int[] array = new int[10];
        array[10] = 1000;
        doAnotherTest();
    }
    
    static void doAnotherTest() throws MyException{
        throw new MyException("Exception from doAnotherTest");
    }
}
class MyException extends Exception {
    public MyException(String msg){
     super(msg);
    }
	}


//      if (args[0].equals("open")) {
//         if (args[1].equals("someone")) {
//            System.out.println("Hello!");
//         }
//      else System.out.println("Go away "+ args[1]);
//      }}}
//	
//	String[] animal=new String[11];
//	animal[0]="cat";
//	animal[1]="dog";
//	animal[2]="bird";
//	animal[3]="owl";
//	animal[4]="crocodile";
//	animal[5]="snake";
//	animal[6]=" monkey";
//	animal[7]="donkey";
//	animal[8]="horse";
//	animal[9]="rabbit";
//	animal[10]="koala";
// System.out.println(animal[0]);
// System.out.println(animal[1]);
// System.out.println(animal[2]);
// System.out.println(animal[3]);
// System.out.println(animal[4]);
// System.out.println(animal[5]);
// System.out.println(animal[6]);
// System.out.println(animal[7]);
// System.out.println(animal[8]);
// System.out.println(animal[9]);
// System.out.println(animal[10]);

