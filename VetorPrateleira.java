package soBolos;

public class VetorPrateleira implements IPrateleira {
	private int qtdBolo;
	private IBolo[] prateleira;
	
	public VetorPrateleira() {
//		super();
	}
	
	public VetorPrateleira(int qtdBolo) {
//		super();
		this.qtdBolo = qtdBolo;
		this.prateleira = new IBolo[qtdBolo];
	}

	@Override
	public int buscar(IBolo bolo) {
		if (bolo == null) return -1;
		for (int i = 0; i < prateleira.length; i++) {
			if (prateleira[i] != null && prateleira[i].equals(bolo)) {
				return i;
			}
		}
		return -1;
	}
	
	private int quantosBolos() {
		int qt = 0;
		for (int i = 0; i < this.qtdBolo; i++) {
			if (prateleira[i] != null) {
				qt++;
			}
		}
		return qt;
	}

	@Override
	public boolean cheia() {
		int qt = quantosBolos();
		return qt == this.qtdBolo ? true : false;
	}

	@Override
	public boolean vazia() {
		int qt = quantosBolos();
		return qt == 0 ? true : false;
	}

	@Override
	public boolean existe(IBolo bolo) {
		return buscar(bolo) != -1;
	}

	@Override
	public boolean inserir(IBolo bolo) {
		if (this.cheia()) {return false;}
		
		for (int i = 0; i < prateleira.length; i++) {
			if (prateleira[i] == null) {
				prateleira[i] = bolo;
				break;
			}
		}
		
		return true;
	}

	@Override
	public IBolo remover(IBolo bolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBolo remover(int bolo) {
		// TODO Auto-generated method stub
		return null;
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
					lista[i] = bolo;
				} else if (tipo == 'T' && bolo instanceof Torta) {
					lista[i] = bolo;
				}
				i++;
			}
		}
		return lista;
	}

}
