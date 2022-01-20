package computeemploywages;

public class Employwagecomputationuc1 {
	int IS_FULL_TIME =1;

    public void employeecheck(){
      double empcheck = Math.floor(Math.random() * 10) % 2;
      if (empcheck == IS_FULL_TIME)
        System.out.println("PRESENT");
      else
        System.out.println("ABSENT");
      }
    public static void main(String args[]){
       Employwagecomputationuc1 e=new Employwagecomputationuc1();
       e.employeecheck();
      }
    }

