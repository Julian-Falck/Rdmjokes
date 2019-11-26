package rdmjokes;


public class ConsOutput implements Output{
    
    public void output(Joke joke){
       
        System.out.println(joke.joke);
        
        
    }
}