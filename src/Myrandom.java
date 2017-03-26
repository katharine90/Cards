import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Myrandom {


	public Myrandom(){

			Random random = new Random();
			int randomcard = random.nextInt(51);
			System.out.println("Random kort: " + AllCards.deck[randomcard]);
	}
	

	public void Test(){ // Retunerar index plats
		Integer[] array = {1,2,3,4,5,6};

		int ret = Arrays.binarySearch(array, 2);
		System.out.println("Index number: " + ret); // Skriver ut vilken plats 2an är på
		System.out.println("Index value: " + array[2]);
		
	}
	
	public static int getInt1(int max){
		Random random = new Random();
		int retur = random.nextInt(max + 1);	
		return retur;
	}
	

	public static int getInt(int min, int max){
//		max = 10;  - skriver över
//		min = 5;
		Random random = new Random();
		int retur = random.nextInt((max - min)) + min;  // min kommer vara 5
		
		return retur;		
	}
	
	public static int getsecondInt(int min, int max)

	{

		Random rand = new Random();

		int returned = rand.nextInt((max-min)+1) + min;

		//exempel
		//max=10
		//min=2

		//rand.nextInt(10-2)+1)-->rand.nextInt(9)
		//detta kommer ge 0,1,2,3,4,5,6,7,8
		//adderar min=2 då kommer vi alltid att få ett värde 

		//större än eller lika med min

		return returned;

	}
	
	private void myRandom(){  // En privat metod som går anropa endst i klassen, ett annat exempel på utility class är java.utily.Math 
 
	}

	
}
