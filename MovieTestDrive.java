class Movie{

String title;
String genre;
int rating;



void playit()
{
System.out.println("Playing the movie");

}


}

public class MovieTestDrive{

public static void main(String[] args){

Movie one = new Movie();
one.title="Gone with the stock";
one.genre = "Tragic";
one.rating = -2;


Movie two = new Movie();
two.title=" with the stock";
two.genre = "comedy";
two.rating = 5;

two.playit();


Movie three= new Movie();
three.title="Byte club";
three.genre = "Tragic";
three.rating = 122;






}

}