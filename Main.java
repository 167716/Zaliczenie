import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Zakończ wczytywanie na 150");
    Scanner scan= new Scanner(System.in);
    int nowa=scan.nextInt();
    int najwieksza=0;
    int najmniejsza=99999;
    
    while(nowa!=150){
      if(nowa>najwieksza)najwieksza=nowa;
      if(nowa<najmniejsza)najmniejsza=nowa;
      nowa = scan.nextInt();
    }
 System.out.println("Najmniejsza to:"+najmniejsza+" Najwieksza to: "+najwieksza);
  }
}