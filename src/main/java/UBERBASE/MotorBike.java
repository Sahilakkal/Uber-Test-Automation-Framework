package UBERBASE;
abstract class x {
	  abstract void brake();
	}

	class SportsBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("SportsBike Brake");
	  }
	}

	class MountainBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() 
	  {
	    System.out.println("MountainBike Brake");
	  }
	}

	class MotorBike {
	  public static void main(String[] args) {
	    MountainBike m1 = new MountainBike();
	    m1.brake();
	    SportsBike s1 = new SportsBike();
	    s1.brake();
	  }
	}