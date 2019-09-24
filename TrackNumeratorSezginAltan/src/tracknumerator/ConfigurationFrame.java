/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracknumerator;

/**
 *
 * @author sezgin
 */
public class ConfigurationFrame extends javax.swing.JFrame {

    
    final short MAX_TRACK_COUNT = 100;
    private boolean ValidationResult = false;
    private int firstValue = 0;
    private int secondValue = 0;
    private int thirdValue = 0;
    private TrackDisplayFrame displayer;
    
    public ConfigurationFrame() {
        initComponents();
        this.setResizable(false); 
    }
    public ConfigurationFrame(TrackDisplayFrame displayer_) {
        initComponents();
        this.setResizable(false); 
        displayer = displayer_;
    }
    public int getFirstValue(){
        return firstValue;
    }
    public int getSecondValue(){
        return secondValue;
    }
    public int getThirdValue(){
        return thirdValue;
    }
        public boolean getValidationResult (){
        return ValidationResult;
    }


   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Track Sayısı");

        jLabel2.setText("Minimum Adres Değeri(Hex)");

        jLabel3.setText("Maksimum Adres Değeri(Hex)");

        jButton1.setLabel("TAMAM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Konfigürasyonu Giriniz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    boolean firstTextValid = true;
        boolean secondTextValid = true;
        boolean thirdTextValid = true;
        boolean addressValuesConsistent = true;
        
        
        int firstValue = 0;
        int secondValue = 0;
        int thirdValue = 0;
        try{
           firstValue =  Integer.parseInt(jTextField1.getText().trim());
        }catch(NumberFormatException nfe){
            firstTextValid = false;
        }
        try{
            secondValue = Integer.parseInt(jTextField2.getText().trim(),16);
        }catch(NumberFormatException nfe){
            secondTextValid = false;
        }        
        try{
            thirdValue = Integer.parseInt(jTextField3.getText().trim(),16);
        }catch(NumberFormatException nfe){
            thirdTextValid = false;
        }
        if(firstValue<0){
            firstTextValid = false;
        }
        if(secondValue < 0){
            secondTextValid = false;
        }
        if(thirdValue<0){
            thirdTextValid = false;
        }
        if(secondTextValid&&thirdTextValid&& secondValue>thirdValue){
            addressValuesConsistent = false;
        }
        String warning = "";
        
        if(!firstTextValid){
            warning = "Geçerli bir track sayısı giriniz.";
        }else if(firstValue>MAX_TRACK_COUNT){
            warning ="Track sayısı en fazla 100 olmalıdır.";
        }
        else if(!secondTextValid){
            warning ="Lütfen geçerli bir hex başlangıç adresi giriniz.";
        }else if(!thirdTextValid){
            warning ="Lütfen geçerli bir hex bitiş adresi giriniz.";
        }else if(!addressValuesConsistent){
             warning ="Son adres ilk adresten küçük olmamalıdır.";
        }
        
        
        
        if(firstTextValid && secondTextValid&&thirdTextValid&&addressValuesConsistent){
            this.firstValue = firstValue;
            this.secondValue = secondValue;
            this.thirdValue = thirdValue;
            ValidationResult = true;
            this.setVisible(false);
            displayer.DisplayTrack(this);
        }else{
            WarningDialog warningDialog = new WarningDialog(this, false,warning);
            warningDialog.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}