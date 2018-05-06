public class WordMeaning 
{
   //initializing words and their corresponding meanings
   private String name;
   private String meaning;
   
   //constructor method to establish a word and definition that will be added to the list
   public WordMeaning(String n, String m)
   {
       name = n;
       meaning = " - " + m;
   }
   
   //accessor method to fetch word
   public String getWord()
   {
       return name;
   }
   
   //accessor method to fetch meaning
   public String getMeaning()
   {
       return meaning;
   }
}
