package Maven.maven_loggertask2;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Maven.maven_loggertask2.EstimateConstructionCost;
class App
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		final Logger LOGGER = LogManager.getLogger(App.class);
		LOGGER.info("Menu for Material standards : ");
		LOGGER.info("1->Standard Materials");
		LOGGER.info("2->Above Standard Materials");
		LOGGER.info("3->High Standard Materials");
		LOGGER.info("4->High Standard Materials and fully automated home");
		LOGGER.info("Enter your choice");
		int choice = sc.nextInt();
		LOGGER.info("Enter total area of house(square feets)");
		float area=sc.nextFloat();
		EstimateConstructionCost object=new EstimateConstructionCost();
		double result=object.calculateCost(choice,area);
		LOGGER.info("Total cost : "+result);
	}
}