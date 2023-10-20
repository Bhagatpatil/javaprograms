class a{
    int i;

     a(int x) {
         i=x;

    }
}

class b extends  a{
    int j;
    b(int x, int y){
        super(x);
        j=y;

    }
}

class c extends b{
    int k;
    c(int x,int y,int z){
        super(x,y);
        k=z;

    }

     void add(){
         System.out.println(i+j+k);
    }

}



public class inheritance_constructor_01 {
    public static void main(String[] args) {
        c ob = new c(11,22,33);
        ob.add();

    }
}
