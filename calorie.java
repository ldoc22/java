package assign5;
import java.util.Scanner;
echo "# java" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/ldoc22/java.git
git push -u origin master
public class calorie {
		private String name;
		private int cals;
		public calorie(String foodName, int foodCals){
			name = foodName;
			cals = foodCals;
		}
		public String getName(){
			return name;
		}
		public int getCalories(){
			return cals;
		}
}
 class Test{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	boolean found = false, correctAmount = false, over = false;
	int servings = 0, saveI = 0, totalMeal = 0;
	calorie [] food = new calorie[10];
	food[0]= new calorie("fries", 23);
	food[1]= new calorie("spinach", 23);
	food[2]= new calorie("spinach", 23);
	food[3]= new calorie("spinach", 23);
	food[4]= new calorie("spinach", 23);
	food[5]= new calorie("spinach", 23);
	food[6]= new calorie("spinach", 23);
	food[7]= new calorie("spinach", 23);
	food[8]= new calorie("spinach", 23);
	food[9]= new calorie("spinach", 23);
	while(over == false){
	while(found == false){
	System.out.println("What kind of food do you like?");
	String search = input.nextLine();
	
	for(int i = 0; i<10;i++){
		if(food[i].getName()== search){
			found = true;
			saveI = i;
			
		}
	}
	}
	
	while(correctAmount ==  false){
		System.out.println("How many serving(s)?:");
		servings = input.nextInt();
		if(servings >0){
			correctAmount = true;
		}
	}
	int totalCals = food[saveI].getCalories() * servings;
	System.out.println(food[saveI].getName()+" at 2 serving(s) will have "+ totalCals+ " Calories");
	System.out.println("Do you want something else<Y or N>?");
	String yesorno = input.nextLine();
	totalMeal += totalCals;
	if(yesorno == "N" || yesorno == "n"){
		over = false;
		System.out.println("The total calories of your meal are "+ totalMeal);
	}
}
}
	
 }
