/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.view;
import gamadesktop.Depurador;
import gamadesktop.modelo.to.Cargo;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author andre
 */
public class CargoJFrame extends javax.swing.JFrame {
    private static final Depurador dep = Depurador.getDepurador();
    private DefaultListModel<Cargo> listaModelo = new DefaultListModel<Cargo>();
    /**
     * Creates new form CargoJFrame
     */
    public CargoJFrame() {
        initComponents();
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
        cargojTextField1 = new javax.swing.JTextField();
        inserejButton1 = new javax.swing.JButton();
        removejButton2 = new javax.swing.JButton();
        recuperajButton = new javax.swing.JButton();
        editarjButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cargosjList1 = new javax.swing.JList<Cargo>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cargo:");

        cargojTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        inserejButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inserejButton1.setText("Insere Novo Cargo");

        removejButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removejButton2.setText("Remove Cargo");

        recuperajButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        recuperajButton.setText("Recupera Cargos");

        editarjButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editarjButton4.setText("Edita Cargo");
        editarjButton4.setEnabled(false);

        cargosjList1.setFont(new java.awt.Font("Tahoma", 0, 18));
        cargosjList1.setModel(listaModelo);
        jScrollPane1.setViewportView(cargosjList1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Lista de Cargos");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Cadastro de Cargos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserejButton1)
                    .addComponent(removejButton2)
                    .addComponent(recuperajButton)
                    .addComponent(editarjButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cargojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cargojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inserejButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removejButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recuperajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarjButton4))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

   public void colocaCargo(Cargo c){
       dep.log("Colcoa cargo "+c+ " no painel"); 
       cargojTextField1.setText(c.getNomeCargo());
   }
   public void insereCargoLista(Cargo c){
       dep.log("Insere cargo "+c+ " na lista do painel"); 
       listaModelo.addElement(c);
   }
   public void limpaCargoLista(){
       dep.log("Limpando lista do painel");
       listaModelo.clear();
   }
   public Cargo obterCargoDigitado(){
       String cargo = cargojTextField1.getText();
       Cargo c = new Cargo(cargo);
       dep.log("Obtem cargo "+c+ " digitado no painel");
       return c;
   }
   public void adicionaInsereCargoListener(ActionListener l){
       inserejButton1.addActionListener(l);       
   }
   public void adicionaRemoveCargoListener(ActionListener l){
       removejButton2.addActionListener(l);
   }
   public void adicionaEditarCargoListener(ActionListener l){
       editarjButton4.addActionListener(l);
   }
   public void acidionaRecupararCargosListener(ActionListener l){
       recuperajButton.addActionListener(l);
   }
   
   
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cargojTextField1;
    private javax.swing.JList<Cargo> cargosjList1;
    private javax.swing.JButton editarjButton4;
    private javax.swing.JButton inserejButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton recuperajButton;
    private javax.swing.JButton removejButton2;
    // End of variables declaration//GEN-END:variables
}
