package teste;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {

//		tipo [] nome = new tipo [quantidade];
		int [] idade = new int [5]; //inicializando o array
//		Todo array é inicializado com suas posições guardando 0
		
		idade[0] = 10; //Preenchendo o array
		idade[1] = 20;
		idade[2] = 30;
		idade[3] = 40;
		idade[4] = 50;
		
		int idade1 = idade[1]; //definindo uma nova variável com o valor da posição do array
		
		System.out.println(idade1);
		System.out.println("O tamanho do array é "+idade.length);
		System.out.println();
		
		int num [] = new int [5];
		
		for(int i = 0; i < num.length; i++) {
            num[i] = i * i;
        }

        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
	}

}
