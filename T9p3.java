//sucesos de la tortuga
public class T9p3 extends T9p1 {
    //tortuga
    private int posicion;
    private boolean ganador = false;
    public T9p3(int posicion){
        this.posicion = posicion;
    }

    public synchronized void avanzaR() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion + 3);
        notifyAll();
    }

    public synchronized void avanzaL() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion + 3);
        notifyAll();
    }

    public synchronized void resbala() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion - 6);
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
