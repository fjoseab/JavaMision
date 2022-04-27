package PracticaComic;

import java.awt.*;

public class Deadpool extends  Comic implements ComicAction{
    public Deadpool(String nombre, String capitulo, String idioma, String editorial, int numeroPaginas, int tomo) {
        super(nombre, capitulo, idioma, editorial, numeroPaginas, tomo);
    }
    @Override
    public void cambiarPagina(Screen screen) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                screen.setVisible(true);
                screen.cls();
                screen.repaint();
                screen.out(Deadpool.super.toString()+"\n", "Helvetica", 28, Color.BLACK);
                for (int i = 1; i < numeroPaginas; i++) {
                    screen.showImage(i+".JPG");
                    screen.setBounds(0,0,1920,1080);
                    screen.out("\n", "Helvetica", 28, Color.BLACK);
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
