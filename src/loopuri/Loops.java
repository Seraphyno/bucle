package loopuri;

public class Loops {
  
  public static void main(String[] args) {
    
    int contor1 = 0;
    while (contor1 < 10) {
      System.out.println("WHILE | Valoare contor: " + contor1);
      contor1++;
    }
  
    System.out.println("================================");
    
    int contor2 = 0;
    do {
      System.out.println("DO WHILE | Valoare contor: " + contor2);
      contor2++;
    } while (contor2 < 10);
    
    //diferenta intre cele 2 este ca DO WHILE va executa 1 data apoi va evalua, pe cand WHILE va evalua intai
    System.out.println("================================");
    
    for (int contor = 0; contor < 10; contor++) {
      System.out.println("FOR | Valoare contor: " + contor);
    }
  
    System.out.println("================================");
  
    /*
     * Exemplificare keyworduri break si continue
     */
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println("BREAK | Valoarea lui 'i': " + i);
    }
  
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }
      System.out.println("CONTINUE | Valoarea lui 'i': " + i);
    }
    
    System.out.println("================================");
    
  }
}
