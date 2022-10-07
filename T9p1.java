public class T9p1 {
    static T9p2 liebre = new T9p2(1);
    static T9p3 tortuga = new T9p3(1);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1... 2... 3... START!");
        boolean fin = false;
        while(!fin){
            int prob1 = (int) ((Math.random()*100)+1);
            int prob2 = (int) ((Math.random()*100)+1);
            liebre(prob1);
            tortuga(prob2);
            int p1 = liebre.get();
            int p2 = tortuga.get();

            for(int i = 0; i < p1; i++){
                System.out.print(" ");
            }
            System.out.println("L");
            System.out.println(prob1);

            for(int i = 0; i < p2; i++){
                System.out.print(" ");
            }
            System.out.println("T");
            System.out.println(prob2);

            boolean liewins = liebre.getGanador();
            boolean tortwins = tortuga.getGanador();
            if(liewins && tortwins){
                System.out.println("Empate");
                fin = true;
            }
            else if(liewins){
                System.out.println("Ganó la liebre");
                fin = true;
            }
            else if(tortwins){
                System.out.println("Ganó la tortuga");
                fin = true;
            }
        }
    }
    public static void liebre(int valor) throws InterruptedException {
        if(0 <= valor && valor <= 20){
            liebre.duerme();
        }
        else if(21 <= valor && valor <= 40){
            liebre.gransalto();
        }
        else if(41 <= valor && valor <= 50){
            liebre.granresbalon();
        }
        else if(51 <= valor && valor <= 80){
            liebre.salto();
        }
        else{
            liebre.resbalon();
        }
    }

    public static void tortuga(int valor) throws InterruptedException{
        if(0 <= valor && valor <= 50){
            tortuga.avanzaR();
        }
        else if(51 <= valor && valor <= 70) {
            tortuga.resbala();
        }
        else if(71 <= valor && valor <= 100){
            tortuga.avanzaL();
        }
    }
}
