//ceng497-labwork6
//201611018
//Ecem Emiroðlu

import java.awt.*;
import java.awt.event.*;



public class Transformation extends Frame implements ActionListener {
	 static final int windowWidth = 800;
	 static final int windowHeight = 800;
	// Initialize coordinates of the triangle
	 int[] x = {500,700,600};
	 int[] y = {300,300,100};
	 
	 public static void main(String[] args) {
	 // Set Frame size to 800x800)
	 // Set background color
	 // Set visibility
		 Transformation trans =new Transformation();
		 trans.setSize(windowWidth,windowHeight);
		 trans.setVisible(true);
		 trans.setBackground(Color.getHSBColor(0.8f, 0.2f, 0.9f));
	 
	 }
	 public Transformation() {
	 // Set title
	 // Create menu
	 // Add WindowListener to exit the program when window is closed
	 // Set layout
	 // Add control panel
	 // Add buttons
	 
		 addWindowListener(new MyFinishWindow());
		 setTitle("Transformations");
		 
		//menu:
			MenuBar menu_bar = new MenuBar();
				
			Menu def = new Menu("File");
			def.add(new MenuItem("Set Default"));
			def.addActionListener(this);
			
			
			menu_bar.add(def);
			setMenuBar(menu_bar);
			//https://www.javatpoint.com/java-awt-panel
	        Panel panel=new Panel();  
	        panel.setBounds(0,40,windowWidth ,40);  
			
	        //https://beginnersbook.com/2015/06/java-awt-tutorial/
			Button button_up = new Button();
			button_up.setLabel("Translate Up");
			button_up.addActionListener(this);
			Button button_down = new Button();
			button_down.addActionListener(this);
			button_down.setLabel("Translate Down");
			Button button_right= new Button();
			button_right.setLabel("Translate Right");
			button_right.addActionListener(this);
			Button button_left= new Button();
			button_left.setLabel("Translate Left");
			button_left.addActionListener(this);
			Button button_reflectx = new Button();
			button_reflectx.setLabel("Reflect X");
			button_reflectx.addActionListener(this);
			Button button_reflecty = new Button();
			button_reflecty.setLabel("Reflect Y");
			button_reflecty.addActionListener(this);
			
			panel.add(button_up);
			panel.add(button_down);
			panel.add(button_right);
			panel.add(button_left);
			panel.add(button_reflectx);
			panel.add(button_reflecty);
			
			panel.setBackground(Color.black); 
			
			add(panel);
			setLayout(null);
	 
	 }
	 // Draw 2 lines and paint 1 filled triangle
	 public void paint(Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
		 g2d.setColor(Color.white);
		 g2d.drawLine(400, 0, 400, 800);
		 g2d.drawLine(0, 400, 800, 400);
		 g2d.setColor(Color.blue);
		 g2d.fillPolygon(x, y, 3);
		
		 
		 
		 
	 }
	
	 
	 public class MyFinishWindow extends WindowAdapter
	   {
	     public void windowClosing(WindowEvent e)
	     {
	       System.exit(0);
	     }
	   }

	 // Action listener
	 public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
					String str = e.getActionCommand();
					//System.out.println(str);
					if(str.equals("Set Default")) {
						x[0]=500;
						x[1]=700;
						x[2]=600;
						
						y[0]=300;
						y[1]=300;
						y[2]=100;
						
						repaint();
						
					}
					else if(str.equals("Translate Up")) {
						
						y[0]=y[0]-20;
						y[1]=y[1]-20;
						y[2]=y[2]-20;
						repaint();
					}
					else if(str.equals("Translate Down")) {

							
						y[0]=y[0]+20;
						y[1]=y[1]+20;
						y[2]=y[2]+20;
						
						repaint();
					}
					else if(str.equals("Translate Right")) {

							
						x[0]=x[0]+20;
						x[1]=x[1]+20;
						x[2]=x[2]+20;
						
						repaint();
					}
					else if(str.equals("Translate Left")) {

							
						x[0]=x[0]-20;
						x[1]=x[1]-20;
						x[2]=x[2]-20;
						
						repaint();
					}
					else if(str.equals("Reflect X")) {

							
						
						y[0]=800-y[0];
						y[1]=800-y[1];
						y[2]=800-y[2];
						
						repaint();
					}
					else if(str.equals("Reflect Y")) {
						x[0]=800-x[0];
						x[1]=800-x[1];
						x[2]=800-x[2];
							
						
						
						repaint();
					}
	 }
}
