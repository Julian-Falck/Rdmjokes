package rdmjokes;

import javax.swing.JOptionPane;

public class GuiOutput implements Output{
    
    public void output(Joke joke){
        JOptionPane.showMessageDialog(null,joke.joke);
        
        
        
    }
}