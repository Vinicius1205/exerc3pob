import java.util.Scanner;

class Aluno
{
    private String nome;
    private int idade;
    private String matricula;

    public Aluno(String nome,int idade,String matricula) {
        this.nome=nome;
        this.idade=idade;
        this.matricula=matricula;
    }
    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public String getMatricula()
    {
        return matricula;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nome do aluno:");
        String nome=scanner.nextLine();
        System.out.println("idade do aluno:");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a matrícula do aluno:");
        String matricula = scanner.nextLine();
        Aluno aluno=new Aluno(nome,idade,matricula);
        System.out.println("Nome:"+aluno.getNome()+ ", Idade: "+aluno.getIdade()+", Matrícula: " +aluno.getMatricula());
        scanner.close();
    }
}
