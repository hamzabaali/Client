package MyClient_;

import Model.CuVi;
import Model.CuVis;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by Saad on 24/04/2015.
 */
public class MyClient {

   
    
    public static CuVis RecupAndParseXmlFromServer()  throws IOException, JAXBException{

        URL url = new URL("http://localhost:8080/pp-1.0-SNAPSHOT/rest/resume");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/xml");

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String apiOutput = br.readLine();
        //System.out.println(apiOutput);
        conn.disconnect();

        JAXBContext jaxbContext = JAXBContext.newInstance(CuVis.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        CuVis listeDeCV = (CuVis) jaxbUnmarshaller.unmarshal(new StringReader(apiOutput));

        return listeDeCV;
    }


    
    
    

    public static void main(String[] args) throws IOException, JAXBException {


      System.out.println(RecupAndParseXmlFromServer().getById(1).toString());


        System.out.println("Done");


    }


}
