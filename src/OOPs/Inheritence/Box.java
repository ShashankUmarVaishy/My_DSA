package OOPs.Inheritence;

public class Box {
    double h;
    double w;
    double l;

    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    //cube
    Box(double side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

    Box(double w, double l, double h) {
        this.w = w;
        this.l = l;
        this.h = h;
    }
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
    public void info(){
        System.out.println("Running a box.");
    }
}