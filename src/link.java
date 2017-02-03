public class link {
    public String bookName  ; 
    public  int millionSold; 

    public link next ;

    public static void main(String [] args)
    {
        linkList linkedlist = new linkList(); 
        linkedlist.insertLink("Head first java", 200);
        linkedlist.insertLink("Head first design pattern", 400);
        linkedlist.insertLink("Head first design", 600);
        linkedlist.display();
        System.out.println(linkedlist.isEmpty()); 
//        linkedlist.findItem("Head first java"); 
    }

    public void display()
    {
        System.out.println(bookName +":"+millionSold+"000.000"); 
    }

    public link(String bookName,int millionSold)
    {
        this.bookName=bookName; 
        this.millionSold=millionSold; 
    }
    public String toString()
    {
        return bookName ; 
    }
}