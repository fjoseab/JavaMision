package practicaMultiverse;

import java.awt.*;

public class PeterPorker extends HombreAraña implements PeterPorkerActions{

    public PeterPorker(String nombre, String alias, String estado, String descripcion, String aparece) {
        super(nombre, alias, estado, descripcion, aparece);
    }

    @Override
    public void superhumanStrength(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Superhuman Strength\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void superhumanSpeed(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Superhuman Speed\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void superhumanReflexes(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Superhuman Reflexes\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void superhumanAgility(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Superhuman Agility\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void jumpingAbility(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Jumping Ability\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void superhumanDurability(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Superhuman Durability\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void superhumanStamina(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Superhuman Stamina\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void healingFactor(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Healing Factor\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void wallClimber(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Wall Climber\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void spiderSense(Screen s) {
        s.cls();
        s.repaint();
        s.out(toString()+ " Ataque Spider Sense\n", "Helvetica", 28, Color.BLACK);
        s.showImage("Spider_ham_cameo.jpg");
        s.setBounds(200,100,1100,900);
    }
}
