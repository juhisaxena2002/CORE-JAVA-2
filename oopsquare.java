public class oopsquare {
    public static void main(String[] args) {
        sqaure s = new sqaure();
        s.set_side(6);
        s.calc_parameter();
        s.area_calc();

    }
}

class sqaure{
    int side;
    int parameter;
    int area;

    int set_side(int edges){
        side = edges;
        System.out.println("edge is " + edges);
        return edges;
    }

    void area_calc(){
        System.out.println("the area of the square is" + side*side);
    }

    void calc_parameter(){
        System.out.println("the pramater of the square is " + 4*side);
    }
}
