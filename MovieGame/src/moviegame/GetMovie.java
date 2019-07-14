package moviegame;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import static moviegame.HauptProgram.hauptProgram;

public class GetMovie {
    
    public static void getMovieTitle() throws FileNotFoundException {

//        File file = new File("C:\\Users\\DPorter\\Desktop\\movieList.txt");

//        Scanner listScanner = new Scanner(file);

        // to save movieList.txt, each element will be a movie title
        ArrayList<String> movieList = new ArrayList<>();
        movieList.add("The Lord of the Rings");
        movieList.add("Fight Club");
        movieList.add("Star Wars");
        movieList.add("The Silence of the Lambs");
        movieList.add("Batman Begins");
        movieList.add("Die Hard");
        movieList.add("Fargo");
        movieList.add("No Country for Old Men");
        movieList.add("The Lost City");
        movieList.add("Life Is Beautiful");
        movieList.add("Good Will Hunting");
        movieList.add("The Shawshank Redemption");
        movieList.add("Kung Fu Panda");
        movieList.add("The Dark Knight");
        movieList.add("The Matrix");
        movieList.add("Forrest Gump");
        movieList.add("American Beauty");
        movieList.add("The Godfather");
        movieList.add("The Departed");
        movieList.add("The Prestige");
        movieList.add("Gladiator");
        movieList.add("The Good the Bad and the Ugly");
        movieList.add("Inglourious Basterds");
        movieList.add("Million Dollar Baby");
        movieList.add("The Aviator");
        movieList.add("Avatar");
        movieList.add("V for Vendetta");
        movieList.add("Big Fish");
        movieList.add("Meet Joe Black");
        movieList.add("The Town");
        movieList.add("Schindlers List");
        movieList.add("Titanic");
        movieList.add("Psycho");
        movieList.add("Paycheck");
        movieList.add("Invictus");
        movieList.add("Se7en");
        movieList.add("Saving Private Ryan");
        movieList.add("Cast Away");
        movieList.add("The Last Samurai");
        movieList.add("Memoirs of a Geisha");
        movieList.add("The Longest Yard");
        movieList.add("Bruce Almighty");
        movieList.add("Inception");
        movieList.add("Pulp Fiction");
        movieList.add("Finding Nemo");
        movieList.add("If Only");
        movieList.add("The Exorcist");
        movieList.add("Philadelphia");
        movieList.add("The Sixth Sense");
        // reads the movieList.txt and saves each line as an element in ArrayList
//        while (listScanner.hasNextLine()) {
//            String line = listScanner.nextLine();
//            movieList.add(line);
//        }

        // to choose the movie title from the list
        int titleNumberHolder = (int) (24 * Math.random() + 0);

        // saves the chosen element(movie title) from ArrayList as its own 
        // variable (String), so that I can work with it easier
        String movieTitle = movieList.get(titleNumberHolder);

        // counts the length of the movie (includes whitespaces for now)
        int letterCount = movieTitle.length();

        // an array temp place holder, so each element will be a --- ------
        // instead of the movie title,zB index 0,1,2 - t,h,e = -,-,-....
        String[] title = new String[letterCount];
        for (int i = 0; i < title.length; i++) {
            title[i] = "-";
        }
        
        // finds out the index from every whitespace in String movieTitle
        // saves each index number in an ArrayList, then uses these elements
        // to add a " " to the correct index positions of the array which holds
        // the movieTitle as --- ------- -- -----
        if (movieTitle.contains(" ")) {
            
            ArrayList<Integer> spaces = new ArrayList<>();

                int index = movieTitle.indexOf(" ");
                while (index >= 0) {
                    spaces.add(index);
                    index = movieTitle.indexOf(" ", index + 1);
                }
                
                for (int s = 0; s < spaces.size(); s++) {
                    title[spaces.get(s)] = title[spaces.get(s)].replace("-", " ");
                }
        }
        String name = null;
        hauptProgram(movieTitle, title, name);
    }

}
