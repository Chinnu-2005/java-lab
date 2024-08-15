public class Product {
    int productid;
    String productname;
    double price;
    int quantity;

    public Product(int id,String name,double p,int q)
    {
        this.productid=id;
        this.productname=name;
        this.price=p;
        this.quantity=q;
    }

    public Product(int id,String name,double p)
    {
        this.productid=id;
        this.productname=name;
        this.price=p;
        this.quantity=0;
    }

    public Product(int id,String name)
    {
        this.productid=id;
        this.productname=name;
        this.price=0.0;
        this.quantity=0;
    }

    public void addStock(int q)
    {
        this.quantity+=q;
    }

    public void sellStock(int q)
    {
        if(this.quantity>=q)
        {
            this.quantity-=q;
        }
        else
        {
            System.out.println("Not enough stock");
        }
    }

    public void sellStock(int q,double discount)
    {
        if(this.quantity>=q)
        {
            this.quantity-=q;
            this.price=(this.price-(this.price*discount));
        }
        else
        {
            System.out.println("Not enough stock");
        }
    }

    public void display()
    {
        System.out.println("Product ID: "+this.productid);
        System.out.println("Product Name: "+this.productname);
        System.out.println("Price of the Product:   "+this.price);
        System.out.println("Quantity of the Product: "+this.quantity);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Product p1=new Product(1,"Apple",10.0);
        Product p2=new Product(2,"Banana");
        Product p3=new Product(3,"orange",34.6,6);
        p1.addStock(23);
        p2.addStock(12);
        p3.addStock(2);
        p1.sellStock(3);
        p3.sellStock(15,3);
        p1.display();
        p2.display();
        p3.display();
    }

}
