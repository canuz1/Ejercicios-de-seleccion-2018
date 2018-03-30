package modelo;
import java.util.*;
 
public class textoMorse {
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Ingresa una palabra");
  String palabra=sc.nextLine();
   
  
  String morse[]= new String[100];
  
  morse[32]="  "; //Espacio 
  morse[48]="-----";//0
  morse[49]=".----";//1
  morse[50]="..---";//2
  morse[51]="...--";//3
  morse[52]="....-";//4
  morse[53]=".....";//5
  morse[54]="-....";//6
  morse[55]="--...";//7
  morse[56]="---..";//8
  morse[57]="----.";//9
  
  morse[65]=".-";//A
  morse[66]="-...";//B
  morse[67]="-.-.";//C
  morse[68]="-..";//D
  morse[69]=".";//E
  morse[70]="..-.";//F
  morse[71]="--.";//G
  morse[72]="....";//H
  morse[73]=".."; //I
  morse[74]=".---";//J
  morse[75]="-.-";//K
  morse[76]=".-..";//L
  morse[77]="--";//M
  morse[78]="-.";//N
  morse[79]="---";//O
  morse[80]=".--.";//P
  morse[81]="--.-";//Q
  morse[82]=".-.";//R
  morse[83]="...";//S
  morse[84]="-";//T
  morse[85]="..-";//U
  morse[86]="...-";//V
  morse[87]=".--";//W
  morse[88]="-..-";//X
  morse[89]="-.--";//Y
  morse[90]="--..";//Z


  palabra=palabra.toUpperCase();
  char frase[]=palabra.toCharArray();
   
  for(int k=0;k<(frase.length);k++){
   int i=(int)frase[k];
   System.out.print(morse[i]+" ");
  }
  
 }
 
}
