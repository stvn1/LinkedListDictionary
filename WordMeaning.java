public class WordMeaning 
{
   private String name;
   private String meaning;
   
   public WordMeaning(String n, String m)
   {
       name = n;
       meaning = " - " + m;
   }
   
   public String getWord()
   {
       return name;
   }
   
   public String getMeaning()
   {
       return meaning;
   }
}
