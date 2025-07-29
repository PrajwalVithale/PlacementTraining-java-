class InheritanceProblem {
    int id;
    String name;
    String dept;
    String Ano;
    long phno;
}

class Student extends InheritanceProblem{
    Student s=new Student();
    long attendence;
    double fee;
    void checkFee() {
        if (attendence >= 90) {
            System.out.println("No payment is to be paid.");
            fee=0;
        } else if (attendence >= 60) {
            System.out.println("You need to pay 5000rs.");
            fee=5000;
        } else {
            System.out.println("You need to pay 25000rs.");
            fee=25000;
        }
    }
}

class Staff extends InheritanceProblem{
    int Nohours;
    int daysExp=12;
    int daysNExp=22;
    int Expyear=15;

    void wroktime(){
        if(Expyear>=10){
            Nohours=daysExp*4;
        }else{
            Nohours=daysNExp*4;
        }
    }
    public static void main(String[] args) {
        
    }

}
