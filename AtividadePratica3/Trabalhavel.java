interface Trabalhavel {
    void trabalhar();
    void relatarProgresso();
}

import java.util.ArrayList;

public class SistemaGerenciamentoFuncionarios {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public Funcionario buscarFuncionario(String termoBusca) {
    for (Funcionario funcionario : funcionarios) {
        if (funcionario.getNome().equalsIgnoreCase(termoBusca) || funcionario.getMatricula().equalsIgnoreCase(termoBusca)) {
            return funcionario;
        }
    }
    return null;
}

}