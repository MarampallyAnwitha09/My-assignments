package Learning;
import java.util.*;
public class House {
private static final Logger LOGGER=Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
		try{
		Scanner sc=new Scanner(System.in);
		boolean stand,fullauto;
		Double area;
		double cost=0;
		stand=sc.nextBoolean();
		area=sc.nextDouble();
		fullauto=sc.nextBoolean();
		if(stand && fullauto)
		{
			cost=area*2500;
		}
		else if(stand)
		{
			cost=area*(1200+1500+1800);
		}
}
catch(Exception e)
{
   LOGGER.log(Level.SEVERE,"Exception Occured",e);
}           

	}

}
