public class Classobject {
    int sID;
    String name;
    String course;
    double avg;
    double fees;
    Classobject( int sID,String name,String course,double avg){
        this.sID=sID;
        this.name=name;
        this.course=course;
        this.avg=avg;
       
        if(avg>=80){
            System.out.println("Fees of the student is 1,00,000(1 lakh)");
            fees=100000;
        }else{
            System.out.println("Fees of the student is 1,75,000(1.75 lakh)");
            fees=175000;
        }
    }
    public static void main(String[] args) {
        Classobject co=new Classobject(1, "Prajwal vithale", "CSE", 85.0);
        System.out.println(co.sID+" "+co.name+" "+co.course+" "+co.avg+" "+co.fees+" ");
    }
}
