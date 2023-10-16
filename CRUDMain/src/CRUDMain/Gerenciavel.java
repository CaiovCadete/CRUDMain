package CRUDMain;

public interface Gerenciavel {
	void adicionarPessoa(Pessoa pessoa);
    void listarPessoas();
    void atualizarPessoa(int indice, Pessoa pessoa);
    void removerPessoa(int indice);	
}
