import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe extends JPanel
{
    JButton buttons[] = new JButton[42]; 
    int alternate = 0;//if this number is a even, then put a X. If it's odd, then put an O
    
    public TicTacToe()
    {
      setLayout(new GridLayout(6,7));
      initializebuttons(); 
    }
    
    public void initializebuttons()
    {
        for(int i = 0; i <= 41; i++)
        {
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].addActionListener(new buttonListener());
            
            add(buttons[i]); //adds this button to JPanel (note: no need for JPanel.add(...)
                                //because this whole class is a JPanel already           
        }
    }
    public void resetButtons()
    {
        for(int i = 0; i <= 41; i++)
        {
            buttons[i].setText("");
        }
    }
    
// when a button is clicked, it generates an ActionEvent. Thus, each button needs an ActionListener. When it is clicked, it goes to this listener class that I have created and goes to the actionPerformed method. There (and in this class), we decide what we want to do.
    private class buttonListener implements ActionListener
    {
       
        public void actionPerformed(ActionEvent e) 
        {
            
            JButton buttonClicked = (JButton)e.getSource(); //get the particular button that was clicked
            if(alternate%2 == 0)
                buttonClicked.setText("X");
            else
                buttonClicked.setText("O");
            
            if(checkForWin() == true)
            {
                JOptionPane.showConfirmDialog(null, "Game Over.");
                resetButtons();
            }
                
            alternate++;
            
        }
        
                
        public boolean checkAdjacent(int a, int b)
        {
            if ( buttons[a].getText().equals(buttons[b].getText()) && !buttons[a].getText().equals("") )
                return true;
            else
                return false;
        }
        
    }
    
    public static void main(String[] args) 
    {
        JFrame window = new JFrame("Tic-Tac-Toe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new TicTacToe());
        window.setBounds(300,200,300,300);
        window.setVisible(true);
    }
}