

public class Main {
	
	public static void main(final String[] args) {
		PigLatin sim = new PigLatin();
        	String[] lines = loadstrings{"words.txt"};
		System.out.println("there are " + lines.length + " lines");
		for (int i = 0 ; i < lines.length; i++) 
		{
			System.out.println(pigLatin(lines[i]));
		}
	}
	
	public static int findFirstVowel(String sWord)
	{
	  for (int i = 0; i < sWord.length(); i++)
	  {
	    String str = (sWord.substring(i,i+1));
	    if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u"))
	      {return i;}
	  }
	  return -1;
	}

	public static String pigLatin(String sWord)
	{
	  if(findFirstVowel(sWord) == 0)
	  {return sWord + "way";}
	  if(sWord.substring(0,2).equals("qu"))
	  {return sWord.substring(2) + "quay";}
	  if(findFirstVowel(sWord) == -1)
	  {return sWord + "ay";}
	  return sWord.substring(findFirstVowel(sWord)) + sWord.substring(0,findFirstVowel(sWord)) + "ay";
	}
}

