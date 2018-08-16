package base.classes;

/**
 * The base.classes.Animal class describes the
 * base class of the application.
 *
 * @author Waswa Olunga
 */

public abstract class Animal {

	public void animalSpeaks(){
		System.out.println("The " + animalType() + " " + animalSound());
	}
	
	public abstract String animalType();

	public abstract String animalSound();
}