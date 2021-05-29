
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Questions {
	
	String [] QuestionArray = new String [3100]; 
	String [] AArray = new String [3100]; 
	String [] BArray = new String [3100]; 
	String [] CArray = new String [3100]; 
	String [] DArray = new String [3100]; 
	
	public int QFlag =0;
	String r;
	int k=0;
	int a=0;
	int x=0;
	String g = null;
	
	int readed;
	
	int soru1,soru2,soru3,soru4,soru5,soru6,soru7,soru8,soru9,soru10,soru11,soru12;
	String kazanilan;
	String kazanilan2;
	int deneme;
	int deneme2;
	
	int qsoruSayac=1;
	int QuestionNum;
	
	
	
	// ANSWER OPTÝONS
	File AFile = new File ("C:\\optionA.txt");
	File BFile = new File ("C:\\optionB.txt");
	File CFile = new File ("C:\\optionC.txt");
	File DFile = new File ("C:\\optionD.txt");
	File QFile = new File ("C:\\Questions.txt");
	File HighFile = new File ("C:\\highest.txt");
	File AllFile = new File ("C:\\allFile.txt");
	

	
	
	public void setOptions() throws IOException{
		
		
		///A
		BufferedReader readerA = null;
		readerA = new BufferedReader (new FileReader(AFile));
		String optionA = readerA.readLine();
		///B
		BufferedReader readerB = null;
		readerB = new BufferedReader (new FileReader(BFile));
		String optionB = readerB.readLine();
		
		///C
		BufferedReader readerC = null;
		readerC = new BufferedReader (new FileReader(CFile));
		String optionC = readerC.readLine();
		
		///D
		BufferedReader readerD = null;
		readerD = new BufferedReader (new FileReader(DFile));
		String optionD = readerD.readLine();
		
	while (optionA!=null){
			
			optionA= readerA.readLine(); optionB= readerB.readLine();
			optionC= readerC.readLine();optionD= readerD.readLine();
			
			AArray[x]=optionA;BArray[x]=optionB;
			CArray[x]=optionC;DArray[x]=optionD;
			x++;
						
		}
		x=0;
		readerA.close();
		readerB.close();
		readerC.close();
		readerD.close();
		
	
		
	}
	public void mechanism() throws IOException{
		
	
		//READER QUESTÝON
		BufferedReader readerQ = null;
		readerQ = new BufferedReader (new FileReader(QFile));
		String Question = readerQ.readLine();
	
		// RANDOM
		Random random = new Random();
		int QuestionNum = random.nextInt(40);
	
		
		while (soru1==QuestionNum || soru2==QuestionNum || soru3==QuestionNum || soru4==QuestionNum || soru5==QuestionNum || soru6==QuestionNum  
				|| soru7==QuestionNum || soru8==QuestionNum || soru9==QuestionNum || soru10==QuestionNum || soru11==QuestionNum || soru12==QuestionNum ){
			QuestionNum = random.nextInt(40);
		//	this.QFlag=QuestionNum;
			
		}	
		this.QFlag=QuestionNum;
	
		
		if (qsoruSayac==1){
		soru1=QuestionNum;
		
			
		}
		else if (qsoruSayac==2){
		soru2=QuestionNum;
		
		}
		else if (qsoruSayac==3){
		soru3=QuestionNum;	
			
		}
		else if (qsoruSayac==4){
		soru4=QuestionNum;	
			
		}
		else if (qsoruSayac==5){
		soru5=QuestionNum;	
	
		}
		else if (qsoruSayac==6){
		soru6=QuestionNum;	
	
		}
		else if (qsoruSayac==7){
		soru7=QuestionNum;	
	
		}
		else if (qsoruSayac==8){
		soru8=QuestionNum;	
	
		}
		else if (qsoruSayac==9){
		soru9=QuestionNum;	
	
		}
		else if (qsoruSayac==10){
		soru10=QuestionNum;		
	
		}
		else if (qsoruSayac==11){
		soru11=QuestionNum;	
	
		}
		else if (qsoruSayac==12){
		soru12=QuestionNum;	
	
		}

		
		while (Question!=null){
			
			Question= readerQ.readLine(); 
			
			QuestionArray[a]=Question;
			a++;
						
		}
		a=0;
		readerQ.close();
		
		}
	
	public void highestSetter (int l ) throws IOException{
		
		 
		 Scanner reader2 = new Scanner(new File("C:\\highest.txt"));
			while (reader2.hasNext()){
				   r = reader2.nextLine();
				  
				}
		 
		 
		reader2.close();
		
	
		if (l==1){
			kazanilan="500";	
		}
		else if (l==2){
			kazanilan="1000";	
		}
		else if (l==3){
			kazanilan="2000";	
		}
		else if (l==4){
			kazanilan="3000";	
		}
		else if (l==5){
			kazanilan="5000";	
		}
		else if (l==6){
			kazanilan="7500";	
		}
		else if (l==7){
			kazanilan="15000";	
		}
		else if (l==8){
			kazanilan="30000";	
		}
		else if (l==9){
			kazanilan="60000";	
		}
		else if (l==10){
			kazanilan="125000";	
		}
		else if (l==11){
			kazanilan="250000";	
		}
		else if (l==12){
			kazanilan="1000000";	
		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\highest.txt"));
		deneme=Integer.parseInt(r);
		deneme2=Integer.parseInt(kazanilan);
		
		if (deneme2>deneme){
			
			writer.write(kazanilan);
			
		}
		else if (deneme2 < deneme){
			writer.write(r);
			
		}
		else if (deneme2==deneme){
			writer.write(r);
			
		}
		
		writer.close();
	
		
	}
	
	public void readHighest() throws FileNotFoundException{
		
		Scanner reader = new Scanner(new File("C:\\highest.txt"));
		while (reader.hasNext()){
			   k = reader.nextInt();
			   
			}
		
		reader.close();

		
	}
	
}
