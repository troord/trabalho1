
package turma;


public class TurmaMax {
    
    private Aluno[] alunos = new Aluno[30];
    
    public void novoAluno(int nMec, String nome){
        
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = new Aluno(nMec, nome);
                return;
            }
        }
    }
    
    public void listaAlunos(){
        for(Aluno aluno : alunos){
            if(aluno != null){
            System.out.println(aluno.getInfo());
            }
        }
    }
    
    public void removerAluno(int nMec){
        for (int i = 0; i < alunos.length; i++){
            if(alunos[i] != null && alunos[i].getnMec()== nMec){
                alunos[i] = null;
                return;
            }
        }
    }
    
    public void listaAlunosNome(String nome){
        boolean notFound = true;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null && alunos[i].getNome().contains(nome)){
                System.out.println(i + " - " + alunos[i].getInfo());
                notFound = false;
            }               
        }
        if(notFound){
            System.out.println("Não encontrado nenhum valor");
        }
    }
}
