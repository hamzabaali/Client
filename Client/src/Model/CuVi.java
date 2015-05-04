
package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "CV.CuVi")
public class CuVi {

    private int id;
    private InformationPerso informationPerso;
    private ArrayList<Formation> formations;

    public InformationPerso getInformationPerso() {
        return informationPerso;
    }

    @XmlElement
    public void setInformationPerso(InformationPerso informationPerso) {
        this.informationPerso = informationPerso;
    }

    public ArrayList<Formation> getFormations() {
        return formations;
    }

    @XmlElement
    public void setFormations(ArrayList<Formation> formations) {
        this.formations = formations;
    }
    @XmlElement
    public void setId(int id){
        this.id = id;
}

    @Override
    public String toString() {
        return "\n\t Le Cv :" +
                "\n\t id = " + id +
                "\n\t informationPerso=" + informationPerso +
                "\n\t formations=" + formations ;
    }

    public CuVi() {
    }
    public int getId() { return id;}
    public CuVi(Integer id, InformationPerso informationPerso, ArrayList<Formation> formations) {
        this.id = id;
        this.informationPerso = informationPerso;
        this.formations = formations;
    }
    
    
    
}