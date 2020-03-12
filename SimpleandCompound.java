import java.io.IOException;
import java.util.*;
public class Main {
	private static final Logger LOGGER=Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
         try{
        	 
           Scanner sc=new Scanner(System.in);
           double pr,rate,time,simple,compound;
           pr=sc.nextDouble();
           rate=sc.nextDouble();
           time=sc.nextDouble();
           simple=(pr*time*rate)/100;
           compound=pr*Math.pow(1.0*rate/100.0, time)-pr;
}
catch(Exception e)
{
   LOGGER.log(Level.SEVERE,"Exception Occured",e);
}           
           
	}

}
