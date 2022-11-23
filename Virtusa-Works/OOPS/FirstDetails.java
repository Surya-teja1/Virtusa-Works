import java.util.*;
import javax.swing.text.PlainDocument;

class Employs
{
    private int eno, salary;
    private int age,experience;
    private long phNo;
    private String ename,mail, gender,roles,place;

     Employs(int eno, String ename, int salary,int age,String gender, Long phNo, int experience,String roles,String place,String mail){
        this.eno=eno;
        this.ename=ename;
        this.salary=salary;
        this.age=age;
        this.gender=gender;
        this.phNo=phNo;
        this.experience=experience;
        this.roles=roles;
        this.place=place;
        this.mail=mail;
     }
    public int getEno(){
        return eno;
    }
    public String getEname(){
        return ename;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public long getphNo(){
        return phNo;
    }
    public int getexp(){
        return experience;
    }
    public String getrolee(){
        return roles;
    }
    public String getPlace(){
        return place;
    }
    public String getEmail(){
        return mail;
    }
    public String toString(){
        return eno+" "+ ename+" "+ age+"-"+ gender+"  "+mail+"  "+salary +"/- "+phNo+" "+roles+" EXP="+experience+"yrs "+place;
    }
}

class FirstDetails
{
    public static void main(String args[])
    {
        List<Employs> c=new ArrayList<Employs>();
        Scanner sc= new Scanner(System.in);
        Scanner ss= new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.println("0.Exit");
            ch=sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.print("enter number: ");
                int eno=sc.nextInt();
                System.out.print("enter name: ");
                String ename = ss.nextLine();
                System.out.print("enter Salary: ");
                int salary = sc.nextInt();
                System.out.print("enter Age: ");
                int age = sc.nextInt();
                System.out.print("enter Gender: ");
                String gender = ss.nextLine().toUpperCase();
                System.out.print("enter Mail-ID: ");
                String mail = ss.nextLine();
                System.out.print("enter phone_number: ");
                Long phNo=sc.nextLong();
                System.out.print("enter the work experience: ");
                int experience=sc.nextInt();
                System.out.print("enter JOB_ROLE: ");
                String roles = ss.nextLine().toUpperCase();
                System.out.print("enter job location: ");
                String place = ss.nextLine();

                c.add(new Employs(eno,ename, salary,age,gender,phNo,experience,roles,place,mail));
            break;
            case 2:
                // System.out.println(c);
                System.out.println("---------------------");
                Iterator<Employs> i= c.iterator();
                while(i.hasNext()){
                    Employs e= i.next();
                    System.out.println(e);
                }
                System.out.println("---------------------");
                break;
            case 3:
                Boolean fnd = false;
                System.out.print("Enter ur ID to SEARCH:- ");
                int idEmp= sc.nextInt();
                System.out.println("---------------------");
                i= c.iterator();
                while(i.hasNext())
                {
                    Employs e= i.next();
                    if(e.getEno() == idEmp){
                        System.out.println(e);
                        fnd=true;
                    }
                }
                if(!fnd)
                    System.out.println("Invalid ID or ID not found");
                System.out.println("---------------------");

                break;
            case 4:
                fnd = false;
                System.out.print("Enter ur ID to DELETE:- ");
                idEmp= sc.nextInt();
                System.out.println("---------------------");
                i= c.iterator();
                while(i.hasNext())
                {
                    Employs e= i.next();
                    if(e.getEno() == idEmp){
                        i.remove();
                        fnd=true;
                    }
                }
                if(!fnd)
                    System.out.println("Invalid ID or ID not found");
                else
                    System.out.println("Record Deleted Successfully");
                System.out.println("---------------------");
                break;
            case 5:
                fnd = false;
                System.out.print("Enter ur ID to UPDATE:- ");
                eno= sc.nextInt();
                System.out.println("---------------------");
                ListIterator<Employs> li = c.listIterator();
                while(li.hasNext())
                {
                    Employs e= li.next();
                    if(e.getEno() == eno){
                        System.out.println("Previos Data is=>> "+e);
                        System.out.println("Enter new name: ");
                        ename = ss.nextLine();

                        System.out.println("Enter new Salary: ");
                        salary = sc.nextInt();

                        System.out.println("Enter new Age: ");
                        age = sc.nextInt();

                        System.out.println("Enter new Gender: ");
                        gender = ss.nextLine();

                        System.out.println("Enter new Mail-ID: ");
                        mail = ss.nextLine();

                        System.out.println("Enter new PhoneNumber: ");
                        phNo = sc.nextLong();

                        System.out.println("Enter new Experience: ");
                        experience = sc.nextInt();

                        System.out.println("Enter new role..: ");
                        roles = ss.nextLine();

                        System.out.println("Enter new Location..: ");
                        place = ss.nextLine();
                        li.set( new Employs(eno, ename, salary,age,gender,phNo,experience,roles,place,mail));
                        fnd=true;
                    }
                }
                if(!fnd)
                    System.out.println("Invalid ID - ID not found");
                else
                    System.out.println("Record UPDATED Successfully");
                System.out.println("---------------------");
                break;
        }
        }while(ch!=0 & ch<6 & ch>0);
    }
}