package rdmjokes;

import javax.swing.JOptionPane;

public class Output{
    
    public void output(Joke joke){
        JOptionPane.showMessageDialog(null,joke.joke);
        System.out.println(joke.joke);
        
        
    }
}