abstract class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract double calcularSalario();
}

class Gerente extends Funcionario {
    private double bonusAnual;
    private String equipe;

    public Gerente(String nome, String matricula, double bonusAnual, String equipe) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusAnual;
    }
}

class Desenvolvedor extends Funcionario {
    private String[] tecnologias;

    public Desenvolvedor(String nome, String matricula, String[] tecnologias) {
        super(nome, matricula);
        this.tecnologias = tecnologias;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (tecnologias.length * bonusPorTecnologia);
    }
}

class Estagiario extends Funcionario {
    private int horasTrabalhadas;
    private String supervisor;

    public Estagiario(String nome, String matricula, int horasTrabalhadas, String supervisor) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * horasTrabalhadas;
    }

}
