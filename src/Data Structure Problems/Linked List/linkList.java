
class linkList
{
    public link firstLink ;

    linkList()
    {
        firstLink = null ; 
    }

    public boolean isEmpty()
    {
        boolean empty ; 
        if(firstLink==null)
        {
            empty = true ; 
        }
        else
        {
            empty = false ;
        }
        return empty; 
    }

    public void insertLink(String bookName , int millionSold)
    {
        link newLink = new link(bookName,millionSold);

        newLink.next = firstLink;
        firstLink=newLink ; 
    }
    public link removeLink()
    {
        link linkReference = firstLink ; 
        if(!isEmpty())
            linkReference.next= firstLink;
        else
            System.out.println("The List is Empty");

        return linkReference ; 
    }

    public void display()
    {
        while(firstLink!=null)
        {
            firstLink.display();
            System.out.println("The Next :"+firstLink.next);
            firstLink = firstLink.next; 
            System.out.println();
        }
    }

        public link findItem(String bookName)
        {   
            if(!isEmpty())
            {
                while(firstLink.bookName != bookName)
                {
                    if(firstLink.next == null)
                    {
                        return null ; 
                    }
                    else
                    {
                        firstLink=firstLink.next;
                    }
                }
            }
            else
            {
                System.out.println("Can not find a match");
            }
            return firstLink ;
        }
    }