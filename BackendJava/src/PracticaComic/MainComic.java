package PracticaComic;
import imonsh.*;
public class MainComic {
    public static void main(String[] args) {
        Screen screen=new Screen();
        Deadpool deadpool= new Deadpool(" PracticaComic.Deadpool: Samurai","Samurai","Espaniol","Marvel comics/Shueisha",36,1);
        deadpool.cambiarPagina(screen);
    }
}
