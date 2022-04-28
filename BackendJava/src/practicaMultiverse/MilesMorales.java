package practicaMultiverse;

import imonsh.*;

public class MilesMorales extends HombreAraña implements MilesMoralesActions{

    public MilesMorales(String nombre, String alias, String estado, String descripcion, String aparece) {
        super(nombre, alias, estado, descripcion, aparece);
    }

    @Override
    public void superhumanStrength(Screen s) {
        s.setVisible(true);
        s.out(toString()+ " Ataque Superhuman Strength\n", "Helvetica", 28, Colors.BLACK);
        s.showImage("Miles_Morales_Spider-Man.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void superhumanSpeed(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Superhuman Speed\n", "Helvetica", 28, Colors.BLACK);
        s.showImage("Miles_Morales_Spider-Man.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void superhumanAgility(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Superhuman Agility\n", "Helvetica", 28, Colors.BLACK);
        s.showImage("Miles_Morales_Spider-Man.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void spiderSense(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Spider Sense\n", "Helvetica", 28, Colors.BLACK);
        s.showImage("Miles_Morales_Spider-Man.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void wallCrawling(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Wall Crawling\n", "Helvetica", 28, Colors.BLACK);
        s.showImage("Miles_Morales_Spider-Man.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void camouflage(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Camouflage\n", "Helvetica", 28, Colors.BLACK);
        s.showImage("Miles_Morales_Spider-Man.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void venomStrike(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Venom Strike\n", "Helvetica", 28, Colors.BLACK);
        s.showImage("Miles_Morales_Spider-Man.jpg");
        s.setBounds(200,100,1100,900);
    }
}
