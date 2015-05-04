package Interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class NewCV extends javax.swing.JFrame {

    private boolean edit;
    private Integer idProduct;

 

    public NewCV() {
        setTitle("Nouveau CV");
        setLocationByPlatform(true);
        setLookAndFeel();
        initComponents();

    }
  private boolean checkEmptyFelds() {

        return !( jTextField3.getText().isEmpty()
                || jTextArea1.getText().isEmpty()
                );

    }
    private boolean checkEmptyFields() {

        return !(nomTextField.getText().isEmpty()
                || prenomTextField.getText().isEmpty()
                || adresseTextField.getText().isEmpty()
                || IdTextField.getText().isEmpty()
                );

    }
public Object[][] getTableData (JTable table) {
    DefaultTableModel dtm = (DefaultTableModel) table.getModel();
    int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
    Object[][] tableData = new Object[nRow][nCol];
    for (int i = 0 ; i < nRow ; i++)
        for (int j = 0 ; j < nCol ; j++)
            tableData[i][j] = dtm.getValueAt(i,j);
    return tableData;
}

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomTextField = new javax.swing.JTextField();
        adresseTextField = new javax.swing.JTextField();
        ajoutercv = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        prenomTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        IdTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nom  *");

        jLabel2.setText("Prenom  *");

        jLabel4.setText("Adresse  *");

        nomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTextFieldActionPerformed(evt);
            }
        });

        adresseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseTextFieldActionPerformed(evt);
            }
        });

        ajoutercv.setMnemonic('A');
        ajoutercv.setText("Ajouter");
        ajoutercv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutercvActionPerformed(evt);
            }
        });

        salirButton.setMnemonic('s');
        salirButton.setText("Annuler");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        prenomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("diplome");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setText("Date");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Ajouter formation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date de formation", "Diplome obtenue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        IdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Id  *");

        jLabel7.setText("Informations personnelles");

        jLabel8.setText("Formations Personnelles");
        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenomTextField)
                            .addComponent(nomTextField)
                            .addComponent(adresseTextField)
                            .addComponent(IdTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(271, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281)
                        .addComponent(ajoutercv, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(242, 242, 242))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomTextField))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prenomTextField)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(adresseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajoutercv, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        getRootPane().setDefaultButton(ajoutercv);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void createXMLCV(String id, String nom,String prenom,String adresse,Object[][] formation){
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
        try {
            docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("CV.CuVi");
		doc.appendChild(rootElement);
                 for(Object[] f : formation){
                 
                     Element formati = doc.createElement("formations");
                     String des = f[1].toString();
                       String d = f[0].toString();  
                      
                       Element date = doc.createElement("date");
		date.appendChild(doc.createTextNode(d));
                formati.appendChild(date);
                 
                Element diplome = doc.createElement("diplome");
		diplome.appendChild(doc.createTextNode(des));
                formati.appendChild(diplome);
                rootElement.appendChild(formati);
                 }
                 
           Element info = doc.createElement("informationPerso");
            Element n = doc.createElement("nom");
		n.appendChild(doc.createTextNode(nom));
                info.appendChild(n);
                
                 Element p = doc.createElement("prenom");
		p.appendChild(doc.createTextNode(prenom));
                info.appendChild(p);
                
	  Element adr = doc.createElement("adresse");
		adr.appendChild(doc.createTextNode(adresse));
                info.appendChild(adr);
                 rootElement.appendChild(info);
               
                Element ib = doc.createElement("id");
		ib.appendChild(doc.createTextNode(id));
                info.appendChild(ib);
                 rootElement.appendChild(info);
               

                
		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer;
                
                
               /* int idd=2;
                idd++;
             String id =""+idd+"";*/
                String xml = "<id>"+id+"</id><informationPerso><nom>"+nom+"</nom><prenom>"+prenom+"</prenom><adresse>"+adresse+"</adresse></informationPerso>";
                String tete="<?xml version=\"1.0\" encoding=\"UTF-8\"?><CV.CuVi>";
               String  fin="</CV.CuVi>";
               // Object[] xmll =  getTableData(jTable1);
                Object[][] formatio =  getTableData(jTable1);
                for(Object[] f : formatio){
                for(int i=0;i<f.length;i++){
                    System.out.println(f[i].toString());
                    String xmll = "<formations><date>"+f[i].toString()+"</date><diplome>"+f[i+1].toString()+"</diplome></formations>";
                i++;
                    xml=xmll+xml;
                 //System.out.println(xml);
                  } 
                          }
                xml= tete  +xml+ fin;
	// String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><CV.CuVi><formations><date>"+f[0].toString()+"</date></formations><informationPerso><nom>"+nomTextField.getText()+"</nom><prenom>"+prenomTextField.getText()+"</prenom><adresse>"+adresseTextField.getText()+"</adresse></informationPerso></CV.CuVi>";
             
             
               URL url = new URL("http://localhost:8080/pp-1.0-SNAPSHOT/rest/resume/ajouter");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/xml");
                
		OutputStream os = conn.getOutputStream();
		os.write(xml.getBytes());
		os.flush();
 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
 
		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}
 
		conn.disconnect();
 
                
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(NewCV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(NewCV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(NewCV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewCV.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 
		
 
		
    }
    public String getStringFromDoc(org.w3c.dom.Document doc)    {
    DOMImplementationLS domImplementation = (DOMImplementationLS) doc.getImplementation();
    LSSerializer lsSerializer = domImplementation.createLSSerializer();
    return lsSerializer.writeToString(doc);   
}
    private void ajoutercvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutercvActionPerformed
        if(checkEmptyFields()){
            String nom = nomTextField.getText();
            String prenom = prenomTextField.getText();
             String adresse = adresseTextField.getText();
             String id=IdTextField.getText();
             Object[][] formation =  getTableData(jTable1);
             
             for(Object[] f : formation){
                 for(int i=0;i<f.length;i++){
                   //  System.out.println(f[i].toString());
                 }
             }
             
             
             createXMLCV(id,nom,prenom, adresse, formation);
            try {
                new ListCV().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(NewCV.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JAXBException ex) {
                Logger.getLogger(NewCV.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_ajoutercvActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
       dispose();
 
       Welcome.w.setVisible(true);
    }//GEN-LAST:event_salirButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
        if(checkEmptyFelds()){
        String Date =  jTextField3.getText();
       String diplome = jTextArea1.getText();
      Object[] row ={Date,diplome};
        DefaultTableModel tb =(DefaultTableModel) jTable1.getModel();
        tb.addRow(row);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void nomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTextFieldActionPerformed

    private void prenomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTextFieldActionPerformed

    private void IdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_IdTextFieldActionPerformed

    private void adresseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresseTextFieldActionPerformed

    private void setLookAndFeel() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdTextField;
    private javax.swing.JTextField adresseTextField;
    private javax.swing.JButton ajoutercv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField nomTextField;
    private javax.swing.JTextField prenomTextField;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}