public class RectApp {
    public static void main (String[] args) {
        Rect r1 = new Rect(1,1, 10,10);
        
        r1.drag(25,25);
        r1.print();
        
    }
}
class Rect {
    int x, y;
    int w, h;
    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
       
  }
  
 
int area(){
	return (this.w*this.h); }

void drag(int dx,int dy){  
	this.x=+ dx; 
	this.y=+ dy;

 }
    void print () {
        System.out.format("Tamanho do retangulo: (%d,%d) na posicao: (%d,%d)  .\n",
            this.w, this.h, this.x, this.y);
   

         System.out.format("Area do retarngulo: (%d)  .\n",
            this.w*this.h);
	
 	System.out.format("Retangulo deslocado para o ponto: (%d,%d)  .\n",
             this.x, this.y);


	}	
  
}