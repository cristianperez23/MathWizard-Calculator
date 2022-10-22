import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class MathWizard extends JFrame implements ActionListener {
   private JLabel commandLabel;
   private JTextField fieldPrompt;
   private JTextField fieldPrompt2;
   private JLabel commandDescription;
   private JButton buttonAdd;
   private JButton buttonSubtract;
   private JButton buttonMultiply;
   private JButton buttonDivide;


   public MathWizard() {
       super("Math Wizard");
 
       initComponents();
   
       setLocation(50, 100);
       setSize(380, 160);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      }
   
   
   private void initComponents() {
        commandLabel = new JLabel("Enter two numbers!");
        fieldPrompt = new JTextField(5);
        fieldPrompt2 = new JTextField(5);
        commandDescription = new JLabel("Select a symbol. Your inputs will then be computed.");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("x");
        buttonDivide = new JButton("/");
 
        setLayout(new FlowLayout());
 
        add(commandLabel);
        add(fieldPrompt);
        add(fieldPrompt2);
        add(commandDescription);
        add(buttonAdd);
        add(buttonSubtract);
        add(buttonMultiply);
        add(buttonDivide);
        
        JButton btnCloseApp = new JButton("Close");
        add(btnCloseApp);
        btnCloseApp.addActionListener(e -> System.exit(0)); 
        
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        
        
        
        }
        
    public void actionPerformed(ActionEvent event){
        String newline = System.lineSeparator();
        float num = Float.parseFloat(fieldPrompt.getText());
        float num2 = Float.parseFloat(fieldPrompt2.getText());

        if (event.getSource() == buttonAdd){
            float total = calculateAdd(num, num2);
            JOptionPane.showMessageDialog(this, "You chose " + num + " and " + num2 + "." + newline + 
        num + " + " + num2 + " = " + total);
        }
        
        else if (event.getSource() == buttonSubtract){
            float total = calculateSubtract(num, num2);
            JOptionPane.showMessageDialog(this, "You chose " + num + " and " + num2 + "." + newline + 
            num + " - " + num2 + " = " + total);
             
               }
        
        else if (event.getSource() == buttonMultiply){
            float total = calculateMultiply(num, num2);
            JOptionPane.showMessageDialog(this, "You chose " + num + " and " + num2 + "." + newline + 
         num + " x " + num2 + " = " + total);
        }
        
        else if (event.getSource() == buttonDivide){
            float total = calculateDivide(num, num2);
            JOptionPane.showMessageDialog(this, "You chose " + num + " and " + num2 + "." + newline + 
            num + " / " + num2 + " = " + total); 
          }
        }
        

    private float calculateAdd(float num, float num2) {
         return (num + num2);}
    
    
    private float calculateSubtract(float num, float num2) {
            return (num - num2);}
            
         
    private float calculateMultiply(float num, float num2) {
         return (num * num2);}
         
         
    private float calculateDivide(float num, float num2) {
         return (num / num2);}
       
         
    public static void main(String[] args) {
      new MathWizard().setVisible(true);
    }
}
