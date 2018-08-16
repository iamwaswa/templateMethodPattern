import base.classes.Animal;
import sub.classes.Cat;
import sub.classes.Dog;
import sub.classes.Owl;

/**
 * The Main class contains the main method for the application.
 * @author Waswa Olunga
 */

public class Main {

	public static void main(String[] args) {

		Animal cat = new Cat();
		cat.animalSpeaks();

		Animal dog = new Dog();
		dog.animalSpeaks();

		Animal owl = new Owl();
		owl.animalSpeaks();
	}

}