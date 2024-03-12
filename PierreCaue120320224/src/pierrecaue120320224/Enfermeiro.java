
package pierrecaue120320224;


public class Enfermeiro 
{
   private String nomeEnfermeiro;
   private int idadeEnfermeiro;

   
//---------------------------------------------
   //construtor
    public Enfermeiro(String nomeEnfermeiro, int idadeEnfermeiro) {
        this.nomeEnfermeiro = nomeEnfermeiro;
        this.idadeEnfermeiro = idadeEnfermeiro;
    }

//---------------------------------------------
   
   public String getNomeEnfermeiro() {
        return nomeEnfermeiro;
    }

    public void setNomeEnfermeiro(String nomeEnfermeiro) {
        this.nomeEnfermeiro = nomeEnfermeiro;
    }

    public int getIdadeEnfermeiro() {
        return idadeEnfermeiro;
    }

    public void setIdadeEnfermeiro(int idadeEnfermeiro) {
        this.idadeEnfermeiro = idadeEnfermeiro;
    }
    
}
