package computeemploywages;

public class Employwagescomputeuc4 {

		  public static final int IS_PART_TIME=1;
		  public static final int IS_FULL_TIME =2;
		  public static final int EMP_RATE_PER_HOUR=20;


		  public void empWage(){
		      int emphrs=0;
		      int empwage=0;

		      double empcheck = Math.floor(Math.random() * 10) % 3;

		      switch ((int)empcheck){
		      case IS_FULL_TIME:
		       emphrs=8;
		       break;
		      case IS_PART_TIME:
		       emphrs=4;
		       break;
		      default:
		       emphrs=0;
		      }
		      empwage=emphrs * EMP_RATE_PER_HOUR;
		      System.out.println("EMPWAGE="+empwage);
		      }
		    public static void main(String args[]){
		      Employwagescomputeuc4  e=new Employwagescomputeuc4 ();
		      e.empWage();
		    }
		 }



