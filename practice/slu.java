import acm.program.*;
 
public class CopyOfSyllableCounting extends ConsoleProgram {
     
    public void run() {
        /* Repeatedly prompt the user for a word and print out the estimated
         * number of syllables in that word.
         */
        while (true) {
            String word = readLine("Enter a single word: ");
            println("  Syllable count: " + syllablesIn(word));
        }
    }
         
    private int syllablesIn(String word) {
        int numSyllables = 0;
        //Set everything to upper case
        String upperCaseWord = word.toUpperCase();
        //The loop will run from 1 to the character before the last
        for (int i = 1; i < upperCaseWord.length()-1; i++){
            char ch = upperCaseWord.charAt(i);
            char c = (upperCaseWord.charAt(i-1));
        //Only adds if the char is in the index AND if there is no
        //other letter in the index fore i  
            if ("AEIOUY".indexOf(ch) >= 0 && "AEIOUY".indexOf(c) == -1){
                numSyllables++;
            }
             
        }
        //Check the first character
        char a = upperCaseWord.charAt(0);
        //Check the last character
        char b = upperCaseWord.charAt(upperCaseWord.length()-1);
         
        //Not count if 'E' is the last char
        if (b == 'E'){
            numSyllables = numSyllables;
        } 
        //Add if the last char is not 'E'
        else if ("AIOUY".indexOf(b) >= 0){
            numSyllables++;
        }
        //Add if the first character is in the index
        if ("AEIOUY".indexOf(a) >= 0){
            numSyllables++;
        }
        //There must be atleast one syllable
        if(numSyllables <= 0){
            numSyllables = 1;
        }
        return numSyllables;
    }
}