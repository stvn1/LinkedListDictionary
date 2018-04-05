import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Dictionary
{
    public static void main(String args[])
    {   
        WordList list = new WordList();
        WordList deleted = new WordList();
        boolean done = false;
        
        while(!done)
        {
            int menu = GetData.getInt("\tDictionary\n"+"\t"+ 
                    "\n\nPlease choose from the following:"+
                    "\n1. Add New Word\n2. Delete a Word\n"
                    + "3. View Dictionary\n4. View Deleted Words\n5. Exit");
        
            switch(menu)
            {
                case 1: 
                    String n = GetData.getWord("Enter the word");
                    String m = GetData.getWord("Enter the definition");
                    WordMeaning word = new WordMeaning(n,m);
                    WordMeaningNode node = new WordMeaningNode(word);
                    list.add(word);
                break;
                
                case 2:
                    String name = GetData.getWord("Please enter word you wish to delete");
                    word = new WordMeaning(name, "");
                    deleted.add(word);
                    list.remove(name);
                break;
                
                case 3:
                    String view = list.toString();
                    if(list.isEmpty())
                        JOptionPane.showMessageDialog(null, "List is empty");
                    else
                    {
                        display(view, "Current List", 
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                break;
                            
                case 4:
                    view = deleted.toString();
                    if(list.isEmpty())
                        JOptionPane.showMessageDialog(null, "List is empty");
                    else
                    {
                        display(view, "Current List", 
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                break;
                        
                case 5:
                    done = true;
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Invalid");
                break;
            }
        }
    }
    static void display(String s, String heading, int MESSAGE_TYPE)
    {
        JTextArea text = new JTextArea(s,20,47);
        JScrollPane pane = new JScrollPane(text);
        JOptionPane.showMessageDialog(null, pane, heading, MESSAGE_TYPE);
    }
}
