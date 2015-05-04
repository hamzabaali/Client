package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by baaliham on 16/04/15.
 */

@XmlRootElement(name = "CV.Formation")
public class Formation {

    private String date ;
    private String diplome;

    public String getDate() {
        return date;
    }

    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    public String getDiplome() {
        return diplome;
    }

    @XmlElement
    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    @Override
    public String toString() {
        return "\n\t Formation{" +
                "\n\t date='" + date + '\'' +
                " \n\t diplome='" + diplome + '\'' +
                '}';
    }
    public String datetostring(){
    return" "+date+" ";}
    public String diplometostring(){
    return" "+diplome+" ";}

    public Formation() {
    }

    public Formation(String date, String diplome) {
        this.date = date;
        this.diplome = diplome;
    }

}
