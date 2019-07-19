/***************************
* Aurthor : ISHWOR KARKI
* Date : 09/04/2017
* Assignment : 
***************************/

import java.util.*;

public class Word 
{
	private String word;
	private int syllableCount;
	
	public void setWord(String word)
	{
		this.word = word;
	}
	public String getWord()
	{
		return word;
	}
	public int getSyllableCount()
	{
		Scanner sc = new Scanner(word);
		sc.useDelimiter("[aeiouy]+");
		
		while(sc.hasNext())
			{
				syllableCount++;
				sc.next();
			}
		
		if (!word.endsWith("a") && !word.endsWith("i") && !word.endsWith("o") && 
			!word.endsWith("u") && !word.endsWith("y"))
			syllableCount = syllableCount - 1;
       
      if (syllableCount == 0)
			syllableCount = 1;
		
		return syllableCount;
	}
	
	//The main statement needs to be removed and be replaced in the Document class file so
	//so that Word is only called for the getSyllableCount method is called.
	public static void main (String [] args)
	{
		int syllables;
		
		Word newWord = new Word();
		newWord.setWord("cd");
		
		syllables = newWord.getSyllableCount();
		System.out.println(syllables);
	}
}