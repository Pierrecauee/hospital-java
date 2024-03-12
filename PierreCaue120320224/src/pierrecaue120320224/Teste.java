
package pierrecaue120320224;


public class Teste
{
    public static void main(String[] args)
    {
       Paciente paciente1 = new Paciente("leandro",20,"homem"); // aqui insere manualmente os dados do paciente
       Paciente paciente2 = new Paciente("janiio",54,"homem");

    
        paciente1.exibepaciente(); 
        System.out.println("---------------------------------------------------");
        paciente2.exibepaciente(); 
    }
    
}
