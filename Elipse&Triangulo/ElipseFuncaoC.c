#include <stdio.h>

int main(void){

    int a1, a2, b1, b2;
    int car;
    car = 0;
    while (car!= 1){

        printf("Digite o Ponto A1 da Elipse:\n");
        scanf("%d", &a1);

        printf("Digite o Ponto A2 da Elipse:\n");
        scanf("%d", &a2);

        printf("Digite o Ponto B1 da Elipse:\n");
        scanf("%d", &b1);

        printf("Digite o Ponto B2 da Elipse:\n");
        scanf("%d", &b2);

        printf("Os pontos A1, A2, B1 e B2 da elipse sao: %d, %d, %d, %d \n", a1, a2, b1, b2);

        printf("\nDigite 1 para terminar:\n");
        scanf("%d", &car);
    }

    return 0;
}