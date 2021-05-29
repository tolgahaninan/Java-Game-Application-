
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.File;





public class Interface2 extends JFrame implements ActionListener{
	
	
	private final int WINDOW_HEIGHT = 1200;
	private final int WINDOW_WIDTH = 800;
	
	JRadioButton optionA;
	JRadioButton optionB;
    JRadioButton optionC;
	JRadioButton optionD;
	JButton resign = new JButton ("resign");
	JButton half;
	JButton change;
	JTextField highest = new JTextField();
	JTextField question;
	JTextField m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12 = new JTextField();
	JButton restart= new JButton("RESTART");
	JButton exit = new JButton ("EXÝT");
	
	
	Questions QText = new Questions();
	JPanel centerPanel = new JPanel();
	ButtonGroup options1;
	int soruSayac=1;
	File HighFile = new File ("C:\\highest.txt");
	JPanel end = new JPanel();
	JLabel b=new JLabel();
	
	
	
	

	int QFlag;
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Interface2 i2 = new Interface2();
		
		i2.Interface23();
			
		}
	
	
	public void Interface23() throws IOException, InterruptedException{
		
		setTitle ("WHO WANTS TO BE A MILLONIARE");
		setSize (WINDOW_HEIGHT,WINDOW_WIDTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		
		//////////////////////// CENTER
		
	
	
		JLabel a;
		JPanel centerPanel;
		centerPanel = new JPanel();
		centerPanel.setLayout(null);
		
	
		Questions QText = new Questions();
		QText.setOptions();
		QText.mechanism();

	
		
		question = new JTextField (QText.QuestionArray[QText.QFlag]);
		optionA = new JRadioButton("A) " +QText.AArray[(QText.QFlag)]); //optionA.addActionListener(this);
		optionB = new JRadioButton("B) " +QText.BArray[(QText.QFlag)]); //optionB.addActionListener(this);
		optionC = new JRadioButton("C) " +QText.CArray[(QText.QFlag)]); //optionC.addActionListener(this);
		optionD = new JRadioButton("D) " +QText.DArray[(QText.QFlag)]); //optionD.addActionListener(this);
		resign=new JButton(); resign.addActionListener(this);
		half = new JButton (); half.addActionListener(this);
		change = new JButton (); change.addActionListener(this);
		restart.addActionListener(this);exit.addActionListener(this);
	
		ButtonGroup options1 = new ButtonGroup();
		
		options1.add(optionA);options1.add(optionB);
		options1.add(optionC);options1.add(optionD);
		
		QText.readHighest();
		highest = new JTextField ("HÝGHEST:"+String.valueOf(QText.k)+" TL"); highest.setEditable(false);
	
		
		
	
		a=new JLabel();
		
		Image backg = new ImageIcon(this.getClass().getResource("/arkaplan2.png")).getImage();
		a.setIcon(new ImageIcon(backg));
		Image fifty = new ImageIcon(this.getClass().getResource("/5050.jpg")).getImage();
		half.setIcon(new ImageIcon(fifty));
		Image change1 = new ImageIcon(this.getClass().getResource("/change.jpg")).getImage();
		change.setIcon(new ImageIcon(change1));
		Image lock = new ImageIcon(this.getClass().getResource("/Lock.jpg")).getImage();
		resign.setIcon(new ImageIcon(lock));
		
		
		centerPanel.add(change);
		centerPanel.add(optionA);centerPanel.add(optionB);
		centerPanel.add(optionC);centerPanel.add(optionD);
		centerPanel.add(question);centerPanel.add(highest);centerPanel.add(resign);
		centerPanel.add(a); centerPanel.add(half);
		centerPanel.add(restart);centerPanel.add(exit);
		
		half.setBounds(230, 100, 100, 58); change.setBounds(400, 100, 98, 60);
		optionA.setBounds(112, 475, 250, 75);optionB.setBounds(438, 475, 250, 75);
		optionC.setBounds(112, 600, 250, 75);optionD.setBounds(438, 600, 250, 75);
		question.setBounds(112, 250, 575, 200);highest.setBounds(487, 180, 200,60);
		resign.setBounds(112,180,100, 60);a.setBounds(0, 0, 800, 800);
		question.setEditable(false);
		exit.setBounds(200,450,400,200);restart.setBounds(200,150, 400, 200);
		
		restart.setBackground(Color.black); restart.setForeground(Color.white);restart.setFont(new Font("sansserif", Font.BOLD, 25));
		exit.setBackground(Color.BLACK); exit.setForeground(Color.white);exit.setFont(new Font("sansserif", Font.BOLD, 25));
		restart.setVisible(false);exit.setVisible(false);
		
		
		question.setBackground(Color.black);question.setFont(new Font("sansserif", Font.BOLD, 18));
		optionA.setBackground(Color.black);optionA.setFont(new Font("sansserif", Font.BOLD, 15));
		optionB.setBackground(Color.black);optionB.setFont(new Font("sansserif", Font.BOLD, 15));
		optionC.setBackground(Color.black);optionC.setFont(new Font("sansserif", Font.BOLD, 15));
		optionD.setBackground(Color.black);optionD.setFont(new Font("sansserif", Font.BOLD, 15));
		highest.setBackground(Color.black);highest.setFont(new Font("sansserif", Font.BOLD, 15));
		
		question.setForeground(Color.white);question.setHorizontalAlignment(SwingConstants.CENTER);
		optionA.setForeground(Color.white);
		optionB.setForeground(Color.white);
		optionC.setForeground(Color.white);
		optionD.setForeground(Color.white);
		highest.setForeground(Color.white);
		
	
	
		add (centerPanel,BorderLayout.CENTER);
	
		
		////////////////////////////////////////////  EAST
		JPanel eastPanel;
	
		
		eastPanel= new JPanel();
		eastPanel.setLayout(null);
		eastPanel.setBackground(Color.BLUE);
		
		
	
		/// TEXT FIELDS ///
		
		
		m12=new JTextField ("1.000.000 TL");m11=new JTextField ("250.000 TL");m10=new JTextField ("125.000 TL");
		m9=new JTextField ("60.000 TL");m8=new JTextField ("30.000 TL");m7=new JTextField ("15.000 TL");
		m6=new JTextField ("7.500 TL");m5=new JTextField ("5.000 TL");m4=new JTextField ("3.000 TL");
		m3=new JTextField ("2.000 TL");m2=new JTextField ("1.000 TL");m1=new JTextField ("500 TL");
		
		m12.setBackground(Color.BLACK);	m11.setBackground(Color.BLACK);	m10.setBackground(Color.BLACK);
		m9.setBackground(Color.BLACK);	m8.setBackground(Color.BLACK);	m7.setBackground(Color.BLACK);
		m6.setBackground(Color.BLACK);	m5.setBackground(Color.BLACK);	m4.setBackground(Color.BLACK);
		m3.setBackground(Color.BLACK);	m2.setBackground(Color.BLACK);	m1.setBackground(Color.YELLOW);
		
		m12.setEditable(false);m11.setEditable(false);m10.setEditable(false);m9.setEditable(false);
		m8.setEditable(false);m7.setEditable(false);m6.setEditable(false);m5.setEditable(false);
		m4.setEditable(false);m3.setEditable(false);m2.setEditable(false);m1.setEditable(false);
	
		
		eastPanel.add(m12);eastPanel.add(m11);eastPanel.add(m10);eastPanel.add(m9);eastPanel.add(m8);
		eastPanel.add(m7);eastPanel.add(m6);eastPanel.add(m5);eastPanel.add(m4);
		eastPanel.add(m3);eastPanel.add(m2);eastPanel.add(m1);
		
		m1.setFont(new Font("sansserif", Font.BOLD, 30));m2.setFont(new Font("sansserif", Font.BOLD, 30));m3.setFont(new Font("sansserif", Font.BOLD, 30));
		m4.setFont(new Font("sansserif", Font.BOLD, 30));m5.setFont(new Font("sansserif", Font.BOLD, 30));m6.setFont(new Font("sansserif", Font.BOLD, 30));
		m7.setFont(new Font("sansserif", Font.BOLD, 30));m8.setFont(new Font("sansserif", Font.BOLD, 30));m9.setFont(new Font("sansserif", Font.BOLD, 30));
		m10.setFont(new Font("sansserif", Font.BOLD, 30));m11.setFont(new Font("sanssserif", Font.BOLD, 30));m12.setFont(new Font("sansserif", Font.BOLD, 35));
		
		m1.setForeground(Color.WHITE);m4.setForeground(Color.WHITE);m7.setForeground(Color.WHITE);m10.setForeground(Color.WHITE);
		m2.setForeground(Color.WHITE);m5.setForeground(Color.WHITE);m8.setForeground(Color.WHITE);m11.setForeground(Color.WHITE);
		m3.setForeground(Color.WHITE);m6.setForeground(Color.WHITE);m9.setForeground(Color.WHITE);m12.setForeground(Color.WHITE);
		
		m1.setHorizontalAlignment(SwingConstants.CENTER);m5.setHorizontalAlignment(SwingConstants.CENTER);m9.setHorizontalAlignment(SwingConstants.CENTER);
		m2.setHorizontalAlignment(SwingConstants.CENTER);m6.setHorizontalAlignment(SwingConstants.CENTER);m10.setHorizontalAlignment(SwingConstants.CENTER);
		m3.setHorizontalAlignment(SwingConstants.CENTER);m7.setHorizontalAlignment(SwingConstants.CENTER);m11.setHorizontalAlignment(SwingConstants.CENTER);
		m4.setHorizontalAlignment(SwingConstants.CENTER);m8.setHorizontalAlignment(SwingConstants.CENTER);m12.setHorizontalAlignment(SwingConstants.CENTER);
		
		m1.setBounds(40,700,320, 55);m2.setBounds(40,635,320, 53);m3.setBounds(40,573,320, 53);m4.setBounds(40,511,320, 53);
		m5.setBounds(40,449,320, 53);m6.setBounds(40,387,320, 53);m7.setBounds(40,325,320, 53);m8.setBounds(40,263,320, 53);
		m9.setBounds(40,201,320, 53);m10.setBounds(40,139,320, 53);m11.setBounds(40,75,320, 53);m12.setBounds(40,10,320, 53);
		
		
	
		
		
		eastPanel.setPreferredSize(new Dimension(400,800));
		add (eastPanel,BorderLayout.EAST);
	
	
     	setVisible(true);
		
		QFlag=QText.QFlag;
		
	
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
	boolean cont = false;
	
	 if (e.getSource()== half){
			
			try {
				halfJ();
				half.setEnabled(false);
			} catch (IOException e1) {
				e1.printStackTrace();
			}}
	 else if (e.getSource()== change){
			try {
				changeJ();
				change.setEnabled(false);
			} catch (IOException e1) {
			
			e1.printStackTrace();
			}}
	 else if(e.getSource()==restart){
		 try {
			QText.readHighest();
			highest.setText("HÝGHEST:"+String.valueOf(QText.k)+" TL");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		 	 QText.soru1=0;QText.soru2=0;QText.soru3=0;QText.soru4=0;QText.soru5=0;QText.soru6=0;
		 	QText.soru7=0;QText.soru8=0;QText.soru9=0;QText.soru10=0;QText.soru11=0;QText.soru12=0;
		 	QText.QuestionNum=0;
		 	 	
		 	new Interface2();
		 	
		 	exit.setVisible(false);
			restart.setVisible(false);
		 	optionA.setVisible(true);
			optionB.setVisible(true);
			optionC.setVisible(true);
			optionD.setVisible(true);
			resign.setVisible(true);
			question.setVisible(true);
			highest.setVisible(true);
			half.setVisible(true);
			change.setVisible(true);
			half.setEnabled(true);
			change.setEnabled(true);
			soruSayac=1;
			QText.qsoruSayac=1;
			m1.setBackground(Color.YELLOW);m3.setBackground(Color.BLACK);m5.setBackground(Color.BLACK);m7.setBackground(Color.BLACK);
			m2.setBackground(Color.BLACK);m4.setBackground(Color.BLACK);m6.setBackground(Color.BLACK);m8.setBackground(Color.BLACK);
			m9.setBackground(Color.BLACK);m10.setBackground(Color.BLACK);m11.setBackground(Color.BLACK);m12.setBackground(Color.BLACK);
			
	
	 }
	 else if (e.getSource()== exit){
		 System.exit(0);
	 }
	

	 else if (e.getSource()==resign){
		
		if (QFlag <= 10 && (optionA.isSelected())){
			
			cont=true;	
			soruSayac++;	
			QText.qsoruSayac++;
			}
		else if (QFlag > 10 && QFlag <=20 && (optionB.isSelected())){
			soruSayac++;
			QText.qsoruSayac++;
			cont=true;
			}
		else if(QFlag > 20 && QFlag <=30 && optionC.isSelected() ){
			soruSayac++;
			QText.qsoruSayac++;
			cont=true;
			}
		else if(QFlag > 30 && QFlag <=40 && (optionD.isSelected())){
			
			soruSayac++;
			QText.qsoruSayac++;
			cont=true;}
		else{
			cont = false;
			
		}
	
	if (!(optionA.isSelected()|| optionB.isSelected()|| optionC.isSelected()|| optionD.isSelected ())){
		
		System.out.println("boþbýrakma");
	}
	
	
	if (cont==true){
		try {
			
			JOptionPane.showMessageDialog(null," GREATTT!!! YOUR ANSWER ÝS TRUE");
			
			
			System.out.println(soruSayac);
			System.out.println(cont);
			QText.mechanism();
			QText.setOptions();
			QFlag=QText.QFlag;
		
			question.setText(QText.QuestionArray[(QFlag)]);
			optionA.setText(QText.AArray[(QFlag)]);
			optionB.setText(QText.BArray[(QFlag)]);
			optionC.setText(QText.CArray[(QFlag)]);
			optionD.setText(QText.DArray[(QFlag)]);
			
			optionA.setEnabled(true);	
			optionB.setEnabled(true);	
			optionC.setEnabled(true);	
			optionD.setEnabled(true);	
			
			colorC(soruSayac);
			
			cont=true;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		readAll RText2 = new readAll();
		if (soruSayac==13){
			prizeF(soruSayac-1);
			try {
				QText.highestSetter(soruSayac-1);
				RText2.highestSetter(soruSayac-1);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			endScreen();
			
			}
	}
	
	
	
	
	
	else if (cont==false){
		
		
	
		prizeF(soruSayac);
		try {
			QText.highestSetter(soruSayac);
			//QText.highestSetter(soruSayac);
			//RText.highestSetter(soruSayac);
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		readAll RText = new readAll();
		Questions QText = RText;
		
		try {
			QText.highestSetter(soruSayac);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	

		endScreen();
				
	}}
	
	
	}
	
	
	
	
		
	

	public void changeJ () throws IOException{
		
		
		QText.mechanism();
		QText.setOptions();
		QFlag=QText.QFlag;
		question.setText(QText.QuestionArray[(QFlag)]);
		optionA.setText(QText.AArray[(QFlag)]);
		optionB.setText(QText.BArray[(QFlag)]);
		optionC.setText(QText.CArray[(QFlag)]);
		optionD.setText(QText.DArray[(QFlag)]);
		
		optionA.setEnabled(true);
		optionB.setEnabled(true);
		optionC.setEnabled(true);
		optionD.setEnabled(true);
	}
	
	public void halfJ () throws IOException{
		
		if (QFlag<=10){
			
			optionB.setEnabled(false);
			optionC.setEnabled(false);
		}
		else if (QFlag<=20){
			optionC.setEnabled(false);
			optionD.setEnabled(false);
			
		}
		else if (QFlag<=30){
			optionA.setEnabled(false);
			optionB.setEnabled(false);
			
		}
		else if (QFlag<=40){
			optionA.setEnabled(false);
			optionC.setEnabled(false);
			
		}
	}
	public void colorC (int soruSayac2){
		
		if (soruSayac==2){
			m2.setBackground(Color.yellow);
			m1.setBackground(Color.black);
			
		}
		else if (soruSayac==3){
			m3.setBackground(Color.yellow);
			m2.setBackground(Color.black);
			
		}
		else if (soruSayac==4){
			m4.setBackground(Color.yellow);
			m3.setBackground(Color.black);
			
		}
		else if (soruSayac==5){
			m5.setBackground(Color.yellow);
			m4.setBackground(Color.black);
			
			
		}
		else if (soruSayac==6){
			m6.setBackground(Color.yellow);
			m5.setBackground(Color.black);
			
		}
		else if (soruSayac==7){
			m7.setBackground(Color.yellow);
			m6.setBackground(Color.black);
			
		}
		else if (soruSayac==8){
			m8.setBackground(Color.yellow);
			m7.setBackground(Color.black);
			
		}
		else if (soruSayac==9){
			m9.setBackground(Color.yellow);
			m8.setBackground(Color.black);
		}
		else if (soruSayac==10){
			m10.setBackground(Color.yellow);
			m9.setBackground(Color.black);
			
		}
		else if (soruSayac==11){
			m11.setBackground(Color.yellow);
			m10.setBackground(Color.black);
			
		}
		else if (soruSayac==12){
			m12.setBackground(Color.yellow);
			m11.setBackground(Color.black);
			
		}
		else {
			System.out.println("ben else oldum");
			
		}
			
		
	}
	
	public void prizeF(int l){
		
		String award="aa";
		
		if (l==1){
			award = "Congrats!!! You earned 500 TL !!!";	
		}
		else if (l==2){
			award = "Congrats!!! You earned 1000 TL !!!";
		}
		else if (l==3){
			award = "Congrats!!! You earned 2000 TL !!!";
		}
		else if (l==4){
			award = "Congrats!!! You earned 3000 tl !!!";
		}
		else if (l==5){
			award = "Congrats!!! You earned 5000 TL !!!";
		}
		else if (l==6){
			award = "Congrats!!! You earned 7500 TL !!!";
		}
		else if (l==7){
			award = "Congrats!!! You earned 15000 TL !!!";
		}
		else if (l==8){
			award = "Congrats!!! You earned 30000 TL !!!";
		}
		else if (l==9){
			award = "Congrats!!! You earned 60000 TL !!!";
		}
		else if (l==10){
			award = "Congrats!!! You earned 125000 TL !!!";
		}
		else if (l==11){
			award = "Congrats!!! You earned 250000 TL !!!";
		}
		else if (l==12){
			award = "OMGG!!! YOU BECOME A MILLIONAIRE";
		}
		
		JOptionPane.showMessageDialog(null, award + " Your score has sucsessfully recorded");
		
		
	}
	
	
	
	public void endScreen(){
		
		
		optionA.setVisible(false);
		optionB.setVisible(false);
		optionC.setVisible(false);
		optionD.setVisible(false);
		resign.setVisible(false);
		question.setVisible(false);
		highest.setVisible(false);
		half.setVisible(false);
		change.setVisible(false);
		
		
		restart.setVisible(true);
		exit.setVisible(true);
		
		
		
		
	}

}

