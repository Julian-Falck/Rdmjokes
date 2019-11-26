package rdmjokes;

import java.util.Random;

public class Jokelist{
    
    //jokelist
    private Joke[] list = {
        new Joke ("Anti-Feminist Joke"),

        new Joke ("'Racist' Joke"),

        new Joke ("Anti-Religious Joke")
    };
    
    //randomnumbergenerator
    private Random generator = new Random();


    
    //Return the joke
    public Joke returnJoke(){
        return rdmJoke();
        
    }
    
    //get a random joke from list
    private Joke rdmJoke(){
        
        //get a random number
        int rdmnum = generator.nextInt(list.length);

        //get a random Joke from array
        return list[rdmnum];

    }

}