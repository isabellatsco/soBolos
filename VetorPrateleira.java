package soBolos;

public class VetorPrateleira implements IPrateleira {
	private int qtdBolo;
	private IBolo[] prateleira;
	
	public VetorPrateleira() {
		this.prateleira = new IBolo[10];
		this.qtdBolo = 0;
	}
	
	public VetorPrateleira(int tamanho) {
		this.prateleira = new IBolo[tamanho];
		this.qtdBolo = 0;

	}

	@Override
	public int buscar(IBolo bolo) {
		if (bolo == null) return -1;
		for (int i = 0; i < qtdBolo; i++) {
			if (prateleira[i].equals(bolo)) {
				return i;
			}
		}
		return -1;
	}
	

	@Override
	public boolean cheia() {
		return qtdBolo == prateleira.length;
	}

	@Override
	public boolean vazia() {
		return qtdBolo == 0;
	}

	@Override
	public boolean existe(IBolo bolo) {
		return buscar(bolo) != -1;
	}

	@Override
	public boolean inserir(IBolo bolo) throws Exception {
		if (existe(bolo)) {
            throw new Exception("Bolo já cadastrado.");  
        }
		
		if (this.cheia()) {return false;}
		
		prateleira[qtdBolo] = bolo;
		qtdBolo++;
		return true;
	}

	@Override
	public IBolo remover(IBolo bolo) throws Exception{
		int posicao = buscar(bolo);
		
        if (posicao == -1) {
            throw new Exception("Bolo não encontrado."); 
        }
        
        return remover(posicao);
	}

	@Override
	public IBolo remover(int posicao) throws Exception {
		
		if (posicao < 0 || posicao >= qtdBolo) {
            throw new Exception("Bolo não encontrado na posição informada."); 
        }
		
		IBolo removido = prateleira[posicao];

        for (int i = posicao; i < qtdBolo - 1; i++) {
            prateleira[i] = prateleira[i + 1];
        }

        prateleira[qtdBolo - 1] = null;
        qtdBolo--;
        return removido; 
	}

	@Override
	public IBolo consultar(IBolo bolo) {
		int posicao = buscar(bolo);
		if (posicao == -1) return null;
		return prateleira[posicao];
	}

	@Override
	public IBolo[] listar() {
		int cont = 0, i = 0;
		for (IBolo bolo : prateleira) {
			if (bolo != null) cont++;
		}
		
		IBolo[] resultado = new IBolo[cont];
		for (IBolo bolo : prateleira) {
			if (bolo != null) {
				resultado[i] = bolo;
				i++;
			}
		}
		return resultado;
	}

	@Override
	public IBolo[] listar(char tipo) {
		int cont = 0, i = 0;
		for (IBolo bolo : prateleira) {
			if (bolo != null) {
				if (tipo == 'S' && bolo instanceof BoloSimples) {
					cont++;
				} else if (tipo == 'T' && bolo instanceof Torta) {
					cont++;
				}
			}
		}
		
		IBolo[] lista = new IBolo[cont];
		for (IBolo bolo : prateleira) {
			if (bolo != null) {
				if (tipo == 'S' && bolo instanceof BoloSimples) {
					lista[i++] = bolo;
				} else if (tipo == 'T' && bolo instanceof Torta) {
					lista[i++] = bolo;
				}
			}
		}
		return lista;
	}

}
