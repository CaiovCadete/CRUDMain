package CRUDMain;

import java.util.ArrayList;
import java.util.List;

public class CRUDArray implements Gerenciavel {
    private List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    @Override
    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (int i = 0; i < pessoas.size(); i++) {
                System.out.println(i + " : " + pessoas.get(i).getNome() + " - " + pessoas.get(i).getDocumento());
            }
        }
    }

    @Override
    public void atualizarPessoa(int indice, Pessoa pessoa) {
        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.set(indice, pessoa);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    @Override
    public void removerPessoa(int indice) {
        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        CRUDArray crud = new CRUDArray();

        PessoaFisica pf1 = new PessoaFisica("Joana", "123.456.789-11");
        PessoaJuridica pj1 = new PessoaJuridica("Empresa XYZ", "12.345.678/9111-22");

        crud.adicionarPessoa(pf1);
        crud.adicionarPessoa(pj1);

        crud.listarPessoas();

        pf1.setNome("Nova Joana");
        crud.atualizarPessoa(0, pf1);

        crud.removerPessoa(1);

        crud.listarPessoas();
    }
}
