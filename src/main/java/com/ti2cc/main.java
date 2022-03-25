package main.java.com.ti2cc;
public class main {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Carro carro = new Carro("premium", "fiat","sedan", 1);
		if(dao.inserirCarro(carro) == true) {
			System.out.println("Inserido com sucesso -> " + carro.toString());
		}
		
		//Mostrar carro do tipo sedan		
		System.out.println("==== Mostrar carros da fiat === ");
		Carro[] carros = dao.getfiat();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}

		//Atualizar carro
		carro.setnome("nova senha");
		dao.atualizarCarro(carro);

		//Mostrar carros 
		System.out.println("==== Mostrar carros === ");
		carros = dao.getCarros();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		//Excluir carros
		dao.excluirCarro((carro).getcodigo());
		
		//Mostrar carros
		carros = dao.getCarros();
		System.out.println("==== Mostrar carros === ");		
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		dao.close();
	}
}