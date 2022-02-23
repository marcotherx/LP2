public class TriaPrint {
    public static void main (String[] args){
        Tria r1 = new Tria(5,5,5);
        r1.print();
    }
}
class Tria {
    int x,y,z,k;
    Tria (int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void print (){
        System.out.format("Os pontos do triangulo sao AB:(%d), BC:(%d) e CA(%d).\n", this.x, this.y, this.z);
           
    }
    


}