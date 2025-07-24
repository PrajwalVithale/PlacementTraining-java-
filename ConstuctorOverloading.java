
class Area{
    Area(int s){
        System.out.println("Area of square "+(s*s));
    }

    Area(float l,float b){
        System.out.println("Area of Triangle "+((l*b)/2));
    }

    Area(double l,double b){
        System.out.println("Area of Rhombus "+(l*b));
    }

    Area(float r){
        System.out.println("Area of circle "+(22/7*r*r));
    }
}

class ConstuctorOverloading {
    public static void main(String[] args) {
        Area a=new Area(28.5f,45.f);
        Area a1=new Area(2.5,80.5);
        Area a2=new Area(5.7f);
        
    }
}
