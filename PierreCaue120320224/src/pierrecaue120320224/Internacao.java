
package pierrecaue120320224;


public class Internacao
{
  private int id;
  private String motivoInternacao;
  Medico medicoResponsavel;
  Enfermeiro enfermeiroResponsavel;

  
//---------------------------------------------

    public Internacao(int id, String motivoInternacao, Medico medicoResponsavel, Enfermeiro enfermeiroResponsavel) {
        this.id = id;
        this.motivoInternacao = motivoInternacao;
        this.medicoResponsavel = medicoResponsavel;
        this.enfermeiroResponsavel = enfermeiroResponsavel;
    }

  
//---------------------------------------------
  
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public Enfermeiro getEnfermeiroResponsavel() {
        return enfermeiroResponsavel;
    }

    public void setEnfermeiroResponsavel(Enfermeiro enfermeiroResponsavel) {
        this.enfermeiroResponsavel = enfermeiroResponsavel;
    }
}
