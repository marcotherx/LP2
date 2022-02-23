#include<stdio.h>

struct Point{
  int a1;
  int a2;
  int b1;
  int b2;
};
typedef struct Point Point;
int main() {
    Point p1;
    p1.a1 = -3;
    p1.a2 = 3;
    p1.b1 = 2;
    p1.b2 = -2;
    printf("Ponto A1 da elipse no grafico: %d \n", p1.a1);
    printf("Ponto A2 da elipse no grafico: %d \n", p1.a2);
    printf("Ponto B1 da elipse no grafico: %d \n", p1.b1);
    printf("Ponto B2 da elipse no grafico: %d \n", p1.b2);
    return 0;
}