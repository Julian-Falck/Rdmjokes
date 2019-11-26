package rdmjokes;

import rdmjokes.Jokelist;

public class Joker{

    private Jokelist list = new Jokelist();

    //use Jokelist to get a random joke
    public void tellJoke(){
        Joke joke = list.returnJoke();
        
        Output window = new Output();
        window.output(joke);

        ColoredOutput colwindow = new ColoredOutput();
        colwindow.output(joke);
    }
}
