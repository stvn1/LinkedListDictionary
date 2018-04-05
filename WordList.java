public class WordList 
{
    WordMeaningNode head;
    
    WordList()
    {
        head = null;
    }
    
    public void add(WordMeaning s)
    {   
        WordMeaningNode temp = new WordMeaningNode(s);
        
        if(isEmpty())
            head = temp;
        else
        {
            WordMeaningNode back = null;
            WordMeaningNode current = head;
            boolean found = false;
            
            while(current != null && !found)
            {
                if(temp.data.getWord().compareTo(current.data.getWord()) <= 0)
                    found = true;
                else
                {
                    back = current;
                    current = current.next;
                }
            }
            
            temp.next = current;
            
            if (back == null) 
                head = temp;
            else
                back.next = temp;
        }
    }
    
    
    public boolean remove(String s)
    {
        if(isEmpty()) 
            return false;
        else
        {
            WordMeaningNode current = head;
            WordMeaningNode back = null;
            
            while (current != null)
            {
                if (current.data.getWord().equals(s)) 
                { 
                    if (back != null) 
                    {
                        back.next = current.next;   
                    } 
                    else 
                    {
                        head = head.next;  
                    }
                    return true;
                }
                back = current;
                current = current.next;
            } 
            return false;
        }          
    }
    
    @Override
    public String toString()
    {
        String result = "";
        WordMeaningNode current = head;
        
        while(current != null)
        {
            result += current.data.getWord() + current.data.getMeaning() + "\n";
            current = current.next;
        }
        return result;
    }
    
    public boolean isEmpty()
    {
        boolean empty = false;
        
        if(head == null)
            empty = true;

        return empty;
    }
}
