package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by baaliham on 16/04/15.
 */
@XmlRootElement(name = "CV.CuVis")
public class CuVis {




    ArrayList<CuVi> cuVis ;


    public ArrayList<CuVi> getCuVis() {
        return cuVis;
    }

    @XmlElement
    public void setCuVis(ArrayList<CuVi> cuVis) {
        this.cuVis = cuVis;
    }

    public CuVis(ArrayList<CuVi> cuVis) {
        this.cuVis = cuVis;
    }

    public void add(CuVi cuVi){
        this.cuVis.add(cuVi);
    }
    public CuVis() {
        this.cuVis = new ArrayList<CuVi>();
    }

    public CuVi getById(int i) {

        for(CuVi el : cuVis){
            if(el.getId() == i ) return el;
        }
        return null;

    }
}
