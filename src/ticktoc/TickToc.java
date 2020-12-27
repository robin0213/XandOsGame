
package ticktoc;

/**
 *
 * @author robin
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class TickToc implements ActionListener
{
    JFrame jf;
    JButton b1=new JButton();
    JButton b2=new JButton();
    JButton b3=new JButton();
    JButton b4=new JButton();
    JButton b5=new JButton();
    JButton b6=new JButton();
    JButton b7=new JButton();
    JButton b8=new JButton();
    JButton b9=new JButton();
    String str;
    int count;
    Color color;
    Font font=new Font("Arial",1,50);
    boolean win=false;
   
    TickToc()
    {
        jf=new JFrame("'X' and '0's Game");
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3,3));
        jf.setLocationRelativeTo(null);
       // jf.setResizable(false);
        
        jf.add(b1);
        b1.addActionListener(this);
        jf.add(b2);
        b2.addActionListener(this);
        jf.add(b3);
        b3.addActionListener(this);
        jf.add(b4);
        b4.addActionListener(this);
        jf.add(b5);
        b5.addActionListener(this);
        jf.add(b6);
        b6.addActionListener(this);
        jf.add(b7);
        b7.addActionListener(this);
        jf.add(b8);
        b8.addActionListener(this);
        jf.add(b9);
        b9.addActionListener(this);
        
        jf.setVisible(true);
    }
  
    public static void main(String[] args) 
    {
        new TickToc();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        count++;
        if(count%2==0)
        {
            str="0";
           color= color.yellow;
            
        }
        else
        {
            str="X";
            color=color.orange;
        }
        if(e.getSource()==b1)
        {
            b1.setText(str);
            b1.setEnabled(false);
            b1.setBackground(color);
            b1.setFont(font);
        }
        if(e.getSource()==b2)
        {
            b2.setText(str);
            b2.setEnabled(false);
            b2.setBackground(color);
            b2.setFont(font);
        }
        if(e.getSource()==b3)
        {
            b3.setText(str);
            b3.setEnabled(false);
            b3 .setBackground(color);
            b3.setFont(font);
        }
        if(e.getSource()==b4)
        {
            b4.setText(str);
            b4.setEnabled(false);
            b4.setBackground(color);
            b4.setFont(font);
        }
        if(e.getSource()==b5)
        {
            b5.setText(str);
            b5.setEnabled(false);
            b5.setBackground(color);
            b5.setFont(font);
        }
        if(e.getSource()==b6)
        {
            b6.setText(str);
            b6.setEnabled(false);
            b6.setBackground(color);
            b6.setFont(font);
        }
        if(e.getSource()==b7)
        {
            b7.setText(str);
            b7.setEnabled(false);
            b7.setBackground(color);
            b7.setFont(font);
        }
        if(e.getSource()==b8)
        {
            b8.setText(str);
            b8.setEnabled(false);
            b8.setBackground(color);
            b8.setFont(font);
        }
        if(e.getSource()==b9)
        {
            b9.setText(str);
            b9.setEnabled(false);
            b9.setBackground(color);
            b9.setFont(font);
        }
        winPossibilities();
        
    }
        void winPossibilities()
        {
            if(b1.getText().equals( b2.getText()) && b2.getText().equals(b3.getText()) && !b1.getText().equals(""))
            {
                win=true;
            }
            else if(b4.getText().equals(b5.getText()) && b5.getText().equals(b6.getText()) && !b4.getText().equals(""))
            {
                win=true;
            }
           else if(b7.getText().equals(b8.getText()) && b8.getText().equals(b9.getText()) && !b7.getText().equals(""))
            {
                win=true;
            }
            else if(b1.getText().equals(b4.getText()) && b4.getText().equals(b7.getText()) && !b1.getText().equals(""))
            {
                win=true;
            }
            else if(b2.getText().equals(b5.getText()) && b5.getText().equals(b8.getText()) && !b2.getText().equals(""))
            {
                win=true;
            }
            else if(b3.getText().equals(b6.getText()) && b6.getText().equals(b9.getText()) && !b3.getText().equals(""))
            {
                win=true;
            }
            
            else if(b1.getText().equals(b5.getText()) && b5.getText().equals(b9.getText()) && !b1.getText().equals(""))
            {
                win=true;
            }
            else if(b3.getText().equals(b5.getText()) && b5.getText().equals(b7.getText()) && !b3.getText().equals(""))
            {
                win=true;
            }
            else
            {
                win=false;
            }
            whoWins();
            
        }    
        void whoWins()
        {
            if(win==true)
            {
                JOptionPane.showMessageDialog(jf, str +" Win");
                restartGame();
            }
            else if(win==false&&count==9)
            {
                JOptionPane.showMessageDialog(jf," Match Draw");
                restartGame();
            }
            
        }
    void restartGame()
    {
    
        
       int i=JOptionPane.showConfirmDialog(jf,"Do you want to replay");
       if(i==0)
       {
            str="";
            count=0;
            color=null;
            win=false;
       
            b1.setText("");
            b1.setBackground(color);
            b1.setEnabled(true);
            
            b2.setText("");
            b2.setBackground(color);
            b2.setEnabled(true);
            
            b3.setText("");
            b3.setBackground(color);
            b3.setEnabled(true);
            
            b4.setText("");
            b4.setBackground(color);
            b4.setEnabled(true);
            
            b5.setText("");
            b5.setBackground(color);
            b5.setEnabled(true);
           
            b6.setText("");
            b6.setBackground(color);
            b6.setEnabled(true);
            
            b7.setText("");
            b7.setBackground(color);
            b7.setEnabled(true);
            
            b8.setText("");
            b8.setBackground(color);
            b8.setEnabled(true);
            
            b9.setText("");
            b9.setBackground(color);
            b9.setEnabled(true);
       }
       else if(i==1)
       {
           System.exit(0);
       }
       else
       {
           b1.setEnabled(false);
           b2.setEnabled(false);
           b3.setEnabled(false);
           b4.setEnabled(false);
           b5.setEnabled(false);
           b6.setEnabled(false);
           b7.setEnabled(false);
           b8.setEnabled(false);
           b9.setEnabled(false);
       }
    }

}
