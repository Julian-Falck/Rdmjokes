package rdmjokes;

import rdmjokes.Jokelist;

import java.util.Random;

public class Joker{

    private Jokelist list = new Jokelist();
    
    //Colored Terminal Output
    Output colwindow = new ColoredOutput();

    //Normal Terminal Output
    Output window = new ConsOutput();

    //GUI Output
    Output guiwindow = new GuiOutput();

    //use Jokelist to get a random joke
    public void tellJoke(){
        Joke joke = list.returnJoke();
        
        Output[] outputs = {
            colwindow, window, guiwindow
        };

        Random generator = new Random();
        int index = generator.nextInt(outputs.length);

        outputs[index].output(joke);
    }
}