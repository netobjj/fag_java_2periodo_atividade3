#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int number;
	
	printf("Digite um numero: ");
	scanf("%d", &number);
	
	if(number <= -1) {
		printf("O numero %d e negativo!", number);
	} else if(number >= 1) { 
		printf("O numero %d e positivo!", number);
	} else {
		printf("O numero %d e zero!", number);
	}
	
	return 0;
}
