

public class Inventory {
    String title;
    String author;
    String isbn;
    double price;

    public Inventory()
    {
        this.title="Unknown Title";
        this.author="Unknown Author";
        this.isbn="000-0-00-000000-0";
        this.price=0.0;
    }

    public Inventory(String t,String a,String i)
    {
        this.title=t;
        this.author=a;
        this.isbn=i;
        this.price=20.0;
    }

    public Inventory(String t,String a,String i,double p)
    {
        this.title=t;
        this.author=a;
        this.isbn=i;
        this.price=p;
    }

    public void UpdatePrice(double p)
    {
        this.price=p;
    }

    public void Display()
    {
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("ISBN: "+this.isbn);
        System.out.println("Price: "+this.price);
        System.out.println("");
    }

    public Inventory(Inventory b)
    {
        this(b.title,b.author,b.isbn,b.price);
    }

    public static void main(String[] args)
    {
        Inventory book1=new Inventory();
        Inventory book2=new Inventory("Amit Garg","Junior Level Books Introduction to Computer","978-93-5019-561-1");
        Inventory book3=new Inventory("Sharad Kumar Verma"," Client Server Computing","978-93-8067-432-2",246.78);
        Inventory book4=new Inventory(book3);
        System.out.println("Book4");
        book4.Display();
        book3.UpdatePrice(8900.34);
        System.out.println("Book1");
        book1.Display();
        System.out.println("Book2");
        book2.Display();
        System.out.println("Book3");
        book3.Display();
        System.out.println("Book4");
        book4.Display();
    }
}
