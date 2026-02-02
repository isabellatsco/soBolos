package soBolos;

public interface IPrateleira {
	int buscar(IBolo bolo);
	boolean cheia();
	boolean vazia();
	boolean existe(IBolo bolo);
	boolean inserir(IBolo bolo) throws Exception;
	IBolo remover(IBolo bolo) throws Exception;
	IBolo remover(int posicao) throws Exception;
	IBolo consultar(IBolo bolo);
	IBolo[] listar();
	IBolo[] listar(char c);
	
}
