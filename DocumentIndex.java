
/**
 * Write a description of class DocumentIndex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DocumentIndex extends ArrayList<IndexEntry>
{
    public DocumentIndex()
    {
        super();
    }
    
    public DocumentIndex(int capacity)
    {
        super(capacity);
    }
    
    public void addWord(String word, int num)
    {
        int objPlace = foundOrInserted(word);
        IndexEntry entry = super.get(objPlace);
        entry.add(num);
    }
    
    public void addAllWords(String str, int num)
    {
        String[] array = str.split("\\W+");
        for(String string : array)
        {
            if (string.length()!= 0)
            {
                addWord(string, num);
            }
        }
    }
    
    private int foundOrInserted(String word)
    {
        if(this.size() == 0)
        {
            IndexEntry first = new IndexEntry(word);
            this.add(first);
            return 0;
        }
        for (int i = 0; i < this.size(); i++)
        {
            IndexEntry entry = get(i);
            String str = entry.getWord();
            int temp = str.compareToIgnoreCase(word);
            if (temp == 0)
            {
                return i;
            }
            if (temp < 0)
            {
                IndexEntry insert = new IndexEntry(word);
                this.add(i, insert);
                return i;
            }
        }
        IndexEntry insert = new IndexEntry(word);
        this.add(insert);
        return this.size() - 1;
        
    }
}
