import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class readAll extends Questions {

	
	///// Setter For All Results
	@Override
	public void highestSetter(int l) throws IOException {
		
	
		
		if (l==1){
			kazanilan2="500";	
		}
		else if (l==2){
			kazanilan2="1000";	
		}
		else if (l==3){
			kazanilan2="2000";	
		}
		else if (l==4){
			kazanilan2="3000";	
		}
		else if (l==5){
			kazanilan2="5000";	
		}
		else if (l==6){
			kazanilan2="7500";	
		}
		else if (l==7){
			kazanilan2="15000";	
		}
		else if (l==8){
			kazanilan2="30000";	
		}
		else if (l==9){
			kazanilan2="60000";	
		}
		else if (l==10){
			kazanilan2="125000";	
		}
		else if (l==11){
			kazanilan2="250000";	
		}
		else if (l==12){
			kazanilan2="1000000";	
		}
		
	
		BufferedWriter writer2 = new BufferedWriter(new FileWriter(AllFile,true));
		
		
		
		writer2.write("Result =  " +kazanilan2);
		writer2.newLine();
		writer2.write("\r\n");

	
		writer2.close();
	
	}

	
	
	
	
}
