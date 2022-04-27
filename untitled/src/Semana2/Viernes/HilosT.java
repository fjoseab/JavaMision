package Semana2.Viernes;

public class HilosT extends Thread {

    public void run(){
        System.out.println("Ejecucion del hilo");
    }

    public static void main(String[] args) {
        HilosT hilo = new HilosT();
        hilo.start();
    }
}
class HilosR implements Runnable{

    @Override
    public void run() {
        System.out.println("El Hilo esta activo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}
