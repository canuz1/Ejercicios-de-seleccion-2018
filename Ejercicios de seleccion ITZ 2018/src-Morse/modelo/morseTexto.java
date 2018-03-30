package modelo;
import java.util.*;
 
public class morseTexto {
 
 public static void main(String[] args) {
	   String frase;
	 Scanner sc = new Scanner(System.in);

     System.out.println("Ingrese la Palabra Morse");
     frase=sc.nextLine();
     StringTokenizer tokens = new StringTokenizer(frase);
     while(tokens.hasMoreTokens()){
         System.out.println(tokens.nextToken());
     }

     System.out.println("");
     String [ ] palabra = frase.split(" ");
  int j=0;
  
  while(j <= palabra.length-1){
    
	  if (palabra[j].equals("-----"))
	  {
		  System.out.println("0");
		  
	  }
	  else if (palabra[j].equals(".----")) 
	  {
		  System.out.println("1");
	  } 
	  else if (palabra[j].equals("..---")) 
	  {
		  System.out.println("2");
	  } 
	  else if (palabra[j].equals("...--")) 
	  {
		  System.out.println("3");
	  } 
	  else if (palabra[j].equals("....-")) 
	  {
		  System.out.println("4");
	  } 
	  else if (palabra[j].equals(".....")) 
	  {
		  System.out.println("5");
	  } 
	  else if (palabra[j].equals("-....")) 
	  {
		  System.out.println("6");
	  } 
	  else if (palabra[j].equals("--...")) 
	  {
		  System.out.println("7");
	  } 
	  else if (palabra[j].equals("---..")) 
	  {
		  System.out.println("8");
	  } 
	  else if (palabra[j].equals("----.")) 
	  {
		  System.out.println("9");
	  } 
	  
	  
	  
	  	else if (palabra[j].equals(".-"))
      {
           System.out.print("A ");

      }
	  	else if (palabra[j].equals("-..."))
      {
       System.out.print("B ");
      }
         else if (palabra[j].equals("-.-.-"))
      {
      System.out.print("C ");
      }
         else if (palabra[j].equals("-.."))
      {
      System.out.print("D ");
      }
         else if (palabra[j].equals("."))
      {
      System.out.print("E ");
      }
         else if (palabra[j].equals("..-."))
      {
      System.out.print("F ");
      }
         else if (palabra[j].equals("--."))
      {
      System.out.print("G ");
      }
         else if (palabra[j].equals("...."))
      {
      System.out.print("H ");
      }
         else if (palabra[j].equals(".."))
      {
      System.out.print("I ");
      }
         else if (palabra[j].equals(".---"))
      {
      System.out.print("J ");
      }
         else if (palabra[j].equals("-.-"))
      {
      System.out.print("K ");
      }
         else if (palabra[j].equals(".-.."))
      {
      System.out.print("L ");
      }
         else if (palabra[j].equals("--"))
      {
      System.out.print("M ");
      }
         else if (palabra[j].equals("-."))
      {
      System.out.print("N ");
      }
         else if (palabra[j].equals("---"))
      {
      System.out.print("O ");
      }
         else if (palabra[j].equals(".--."))
      {
      System.out.print("P ");
      }
         else if (palabra[j].equals("--.-"))
      {
      System.out.print("Q ");
      }
         else if (palabra[j].equals(".-."))
      {
      System.out.print("R ");
      }
         else if (palabra[j].equals("..."))
      {
      System.out.print("S ");
      }
         else if (palabra[j].equals("-"))
      {
      System.out.print("T ");
      }
         else if (palabra[j].equals("..-"))
      {
      System.out.print("U ");
      }
         else if (palabra[j].equals("...-"))
      {
      System.out.print("V ");
      }
         else if (palabra[j].equals(".--"))
      {
      System.out.print("W ");
      }
         else if (palabra[j].equals("-..-"))
      {
      System.out.print("X ");
      }
         else if (palabra[j].equals("-.--"))
      {
      System.out.print("Y ");
      }
         else if (palabra[j].equals("--.."))
      {
      System.out.print("Z ");
      }
         else if (palabra[j].equals(" "))
      {
      System.out.print(" ");
      }
       
  j++;
  }


 }
 
}
