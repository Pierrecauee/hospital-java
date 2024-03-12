/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierrecaue120320224;


public class Paciente 
{
    private String nome;
    private int idade;
    private String sexo;

    
    
//---------------------------------------------
  //construtor
    public Paciente(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
   
   
//---------------------------------------------
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void exibepaciente()
    { 
        System.out.println("nome do paciente: " + nome);
        System.out.println("idade do paciente: " + idade);
        System.out.println("sexo do paciente: " + sexo);

    }
}
