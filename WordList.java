public class WordList 
{
    WordMeaningNode head;
    
    //initializing list
    WordList()
    {
        head = null;
    }
    
    public void add(WordMeaning s)
    {   
        WordMeaningNode temp = new WordMeaningNode(s); //assigns node to user input
        
        if(isEmpty())
            head = temp; //adding node to head of list if list is empty
        else
        {
            WordMeaningNode back = null; //initialing pointer to trail
            WordMeaningNode current = head; //pointer to traverse the list
            boolean found = false;
            
            while(current != null && !found)
            {
                if(temp.data.getWord().compareTo(current.data.getWord()) <= 0)//searches list to see if word already exists
                    found = true;
                else
                {
                    back = current; //tail pointer assigned to traversing pointer
                    current = current.next; //travering pointer continues to traverse
                }
            }
            
            temp.next = current;
            
            if (back == null) 
                head = temp;
            else
                back.next = temp;
        }
    }
    
    //method removes word entered by user
    public boolean remove(String s)
    {
        if(isEmpty()) 
            return false;
        else
        {
            WordMeaningNode current = head;
            WordMeaningNode back = null;
            
            //finds word and reassigns node to "delete" from list
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
    
    //returns list
    @Override
    public String toString()
    {
        String result = "";
        WordMeaningNode current = head;
        
        //loops through list and prints all values
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
