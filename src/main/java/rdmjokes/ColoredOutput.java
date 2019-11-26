package rdmjokes;

import java.util.*;

import java.awt.Color;



public class ColoredOutput implements Output{
    
    //randomnumbergenerator
    private Random generator = new Random();

    public void output(Joke joke){

        String randomColor = getrdmcolor();

        System.out.println(randomColor + joke.joke + ConsoleColors.RESET );
        
        
    }

    private String getrdmcolor(){
        List <String> colors = Arrays.asList(
            ConsoleColors.RED,
            ConsoleColors.BLUE,
            ConsoleColors.GREEN,
            ConsoleColors.YELLOW,
            ConsoleColors.CYAN,
            ConsoleColors.RED_BRIGHT,
            ConsoleColors.BLUE_BRIGHT,
            ConsoleColors.GREEN_BRIGHT,
            ConsoleColors.YELLOW_BRIGHT,
            ConsoleColors.CYAN_BRIGHT

        );

        int i = generator.nextInt(colors.size());
        return colors.get(i);
    }
}