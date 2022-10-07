//sucesos de la liebre

public class T9p2 extends T9p1 {
    private int posicion;
    private boolean ganador = false;
    public T9p2(int posicion){
        this.posicion = posicion;
    }

    public synchronized void duerme() throws InterruptedException{
        Thread.sleep(1000);
        notifyAll();
    }

    public synchronized void gransalto() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion + 9);
        notifyAll();
    }

    public synchronized void salto() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion + 1);
        notifyAll();
    }

    public synchronized void granresbalon() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion - 12);
        if(posicion < 1){
            posicion = 1;
        }
        notifyAll();
    }

    public synchronized void resbalon() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion - 2);
        if(posicion < 1){
            posicion = 1;
        }
        notifyAll();
    }

    public synchronized int get() {
        notifyAll();
        return posicion;
    }

    public synchronized boolean getGanador(){
        if(posicion >= 70){
            ganador = true;
        }
        return ganador;
    }
}
