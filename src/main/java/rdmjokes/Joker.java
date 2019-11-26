package rdmjokes;

import rdmjokes.Jokelist;

public class Joker{

    private Jokelist list = new Jokelist();

    //use Jokelist to get a random joke
    public void tellJoke(){
        Joke joke = list.returnJoke();
        
        ColoredOutput colwindow = new ColoredOutput();
        colwindow.output(joke);

        ConsOutput window = new ConsOutput();
        window.output(joke);

        GuiOutput guiwindow = new GuiOutput();
        guiwindow.output(joke);

    }
}
