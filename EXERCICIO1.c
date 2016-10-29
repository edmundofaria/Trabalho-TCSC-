#include <stdio.h>

int main(void)
{
        double a,b;
        char res;

        do
        {
           
            printf("Operadores Disponiveis\n");
            printf("'+' : soma\n");
            printf("'-' : subtracao\n");
            printf("'*' : multiplicao\n");
            printf("'/' : divisao\n");
            printf("'%%' : resto da divisao\n");

            printf("\nDigite a expressao na forma: numero1 operador numero2\n");
            printf("Exemplos: 1 + 1 ,  2.1 * 3.1\n");
            printf("Para sair digite: 0 0 0\n");


            scanf("%lf", &a);
            scanf(" %c",&res);
            scanf("%lf", &b);

            system("cls || clear");

            printf("Calculando: %.1lf %c %.1lf = ", a,res,b);


            switch(res)
            {
                case '+':
                        printf("%.1lf\n\n", a + b);
                        break;

                case '-':
                        printf("%.1lf\n\n", a - b);
                        break;

                case '*':
                        printf("%.1lf\n\n", a * b);
                        break;

                case '/':
                        if(b != 0)
                            printf("%.1lf\n\n", a / b);
                        else
                            printf("Nao existe divisao por 0\n\n");
                        break;

                case '%':
                        printf("%d\n\n", (int)a % (int)b);
                        break;

                default:
                        if(a != 0 && res != '0' && b != 0)
                            printf(" Operador invalido\n\n ");
                        else
                            printf(" Fechando calculadora!\n ");
            }

        }while(a != 0 && res != '0' && b != 0);

}
