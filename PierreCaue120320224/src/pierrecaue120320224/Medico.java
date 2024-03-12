/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierrecaue120320224;


public class Medico extends Internacao 
{
    
    private int idadeMedico; 
    private String nomeMedico;
    private String especialidadeMedico;

    
//---------------------------------------------

    //construtor
    public Medico(int idadeMedico, String nomeMedico, String especialidadeMedico) {
        this.idadeMedico = idadeMedico;
        this.nomeMedico = nomeMedico;
        this.especialidadeMedico = especialidadeMedico;
    }
    

   
//---------------------------------------------
    
    

    public int getIdadeMedico() {
        return idadeMedico;
    }

    public void setIdadeMedico(int idadeMedico) {
        this.idadeMedico = idadeMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public void setEspecialidadeMedico(String especialidadeMedico) {
        this.especialidadeMedico = especialidadeMedico;
    }
    
}