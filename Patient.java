
public class Patient {
    String name;
    double height;
    double weight;

    public Patient(String s,double h,double w)
    {
        this.name=s;
        this.height=h;
        this.weight=w;
    }

    public static void main(String[] args) {
        String s=args[0];
        double h=Double.parseDouble(args[1]);
        double w=Double.parseDouble(args[2]);
        Patient p=new Patient(s,h,w);   
        double bmi=p.Bmi();
        bmi=bmi*10000;
        System.out.println("BMI is "+bmi);
    }

    public double Bmi()
    {
        return weight/(height*height);
    }    
  
}
