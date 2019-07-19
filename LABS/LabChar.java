/***************************
* Aurthor : Nimesh Subedi
* Lab Char
***************************/

public class LabChar
{
   public static void main (String[] args)
   {
      char dash = '-';
      System.out.printf("Dash:%c%n", dash);
      
      char a = 'a';
      char letter = a;
      letter++;
      char b = letter;
      letter++;
      char c = letter;
      letter +=2;
      char e = letter;
      
      System.out.printf("Letter: a:%c b:%c c:%c e:%c%n",
         a, b, c, e);
      char copyrightSign = '\u00a9';
      System.out.printf("Copyright sign: %c %d %X%n", copyrightSign, (int)copyrightSign, (int)copyrightSign);
      char yen = '\u00a5';
      System.out.printf("Yen: %c %d %X", yen, (int)yen, (int)yen);
   }
}