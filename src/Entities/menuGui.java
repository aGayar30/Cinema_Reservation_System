/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import javax.swing.*;
import java.util.Vector;




public class menuGui extends javax.swing.JFrame {

    
//    public menuGui() {
        
//    dispose();
//    System.out.println("abdelrahman code here!");
//    }
//}
     public menuGui() {
        initComponents();
        initData();
        loadParties();
        
        
        
    }
    
    // initialize application data
    private void initData() {
        //new party
        Vector<Seat> section1Seats = new Vector<>();
        section1Seats.add(new Seat());
        section1Seats.add(new Seat());
        section1Seats.add(new Seat());
        Vector<Section> sections = new Vector<>();
        sections.add(new Section(section1Seats, 7f));
        Vector<Seat> section2Seats = new Vector<>();
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        section2Seats.add(new Seat());
        sections.add(new Section(section2Seats, 15f));
        Theater theater = new Theater(sections);
        PartyTimeInterval timeInterval = new PartyTimeInterval("21-5-2021", "04:00 PM", "06:00 PM");
        new Party(timeInterval, theater, "Age of ultron", 100f);
        
        //new party
        Vector<Seat> section3Seats = new Vector<>();
        section3Seats.add(new Seat());
        section3Seats.add(new Seat());
        section3Seats.add(new Seat());
        section3Seats.add(new Seat());
        section3Seats.add(new Seat());
        section3Seats.add(new Seat());
        section3Seats.add(new Seat());
        section3Seats.add(new Seat());
        Vector<Seat> section4Seats = new Vector<>();
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        section4Seats.add(new Seat());
        Vector<Section> sections5 = new Vector<>();
        sections5.add(new Section(section3Seats, 25f));
        sections5.add(new Section(section4Seats, 20f));
        Theater theater1 = new Theater(sections5);
        PartyTimeInterval timeInterval1 = new PartyTimeInterval("25-2-2021", "03:00 PM", "05:00 PM");
        new Party(timeInterval1, theater1, "The counjuring 3", 90f);
        
         //new party
        Vector<Seat> section6Seats = new Vector<>();
        section6Seats.add(new Seat());
        section6Seats.add(new Seat());
        section6Seats.add(new Seat());
        section6Seats.add(new Seat());
        section6Seats.add(new Seat());
        section6Seats.add(new Seat());
        Vector<Seat> section7Seats = new Vector<>();
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        section7Seats.add(new Seat());
        Vector<Section> sections8 = new Vector<>();
        sections8.add(new Section(section6Seats, 9f));
        sections8.add(new Section(section7Seats, 12f));
        Theater theater2 = new Theater(sections8);
        PartyTimeInterval timeInterval2 = new PartyTimeInterval("15-6-2021", "10:00 PM", "12:00 AM");
        new Party(timeInterval2, theater2, "The Joker", 95f);
        
         //new party
        Vector<Seat> section9Seats = new Vector<>();
        section9Seats.add(new Seat());
        section9Seats.add(new Seat());
        section9Seats.add(new Seat());
        section9Seats.add(new Seat());
        section9Seats.add(new Seat());
        section9Seats.add(new Seat());
        section9Seats.add(new Seat());
        Vector<Seat> section10Seats = new Vector<>();
        section10Seats.add(new Seat());
        section10Seats.add(new Seat());
        section10Seats.add(new Seat());
        section10Seats.add(new Seat());
        section10Seats.add(new Seat());
        section10Seats.add(new Seat());
        section10Seats.add(new Seat());
        section10Seats.add(new Seat());
        section10Seats.add(new Seat());
        Vector<Section> sections11 = new Vector<>();
        sections11.add(new Section(section9Seats, 15f));
        sections11.add(new Section(section10Seats, 20f));
        Theater theater3 = new Theater(sections11);
        PartyTimeInterval timeInterval3 = new PartyTimeInterval("16-6-2021", "7:00 PM", "9:00 PM");
        new Party(timeInterval3, theater3, "Midnight Sun", 100f);
        
    }
    
    private void loadParties() {
        // clear comboboxes
        PartiesCombobox.removeAllItems();
        sectionsCombobox.removeAllItems();
        seatsCombobox.removeAllItems();
        for (Party party: Party.parties) {
            PartiesCombobox.addItem(party.getFilm());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
//        background:
//        try {
//            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\HP\\Downloads\\bckgrnd.jpg")))));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PartiesCombobox = new javax.swing.JComboBox<>();
        idLabel = new javax.swing.JLabel();
        filmLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        moviePriceLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sectionsCombobox = new javax.swing.JComboBox<>();
        seatsCombobox = new javax.swing.JComboBox<>();
        sectionPriceLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cashRadiobtn = new javax.swing.JRadioButton();
        visaRadiobtn = new javax.swing.JRadioButton();
        totalPriceLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Movies");

        PartiesCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartiesComboboxActionPerformed(evt);
            }
        });

        idLabel.setText("#ID");

        filmLabel.setText("Film Label");

        durationLabel.setText("Duration Label");

        moviePriceLabel.setText("Price Label");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cinema Reservation System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(moviePriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PartiesCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(filmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PartiesCombobox, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(filmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(moviePriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(durationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel2.setText("Section");

        sectionsCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionsComboboxActionPerformed(evt);
            }
        });

        seatsCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsComboboxActionPerformed(evt);
            }
        });

        sectionPriceLabel.setText("Price Label");

        jLabel4.setText("Seat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sectionPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sectionsCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seatsCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sectionsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(seatsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sectionPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jLabel3.setText("Payment");

        buttonGroup1.add(cashRadiobtn);
        cashRadiobtn.setSelected(true);
        cashRadiobtn.setText("Cash");

        buttonGroup1.add(visaRadiobtn);
        visaRadiobtn.setText("Visa");

        totalPriceLabel.setText("$ Total Price");

        jButton1.setText("Checkout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visaRadiobtn)
                    .addComponent(jLabel3)
                    .addComponent(cashRadiobtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addComponent(cashRadiobtn)
                .addGap(18, 18, 18)
                .addComponent(visaRadiobtn)
                .addGap(30, 30, 30)
                .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void sectionsComboboxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
//        sectionsCombobox.removeAll();
//        seatsCombobox.removeAll();
        int selectedPartyIndex = PartiesCombobox.getSelectedIndex();
        if (selectedPartyIndex == -1)
            return;
        Party selectedParty = Party.parties.get(PartiesCombobox.getSelectedIndex());
        int selectedSectionIndex = sectionsCombobox.getSelectedIndex();
        if (selectedSectionIndex == -1)
            return;
        Section selectedSection = selectedParty.getTheater().getSections().get(sectionsCombobox.getSelectedIndex());
        sectionPriceLabel.setText("+ " +  String.valueOf(selectedSection.getPrice()) + " EGP");
        seatsCombobox.removeAllItems();
//        System.out.println("loading seats combobox");
//        System.out.println(selectedSection.getSeats());
        // load seats combobox
        for (Seat seat: selectedSection.getAvailableSeats()) {
            seatsCombobox.addItem("Seat " + String.valueOf(seat.getId()));
        }
        float totalPrice = selectedSection.getPrice() + selectedParty.getPrice();
        totalPriceLabel.setText(String.valueOf(totalPrice) + " EGP");
    }                                                

    private void seatsComboboxActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        
    }                                             

    private void PartiesComboboxActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        System.out.println(PartiesCombobox.getSelectedItem());
        int partyIndex = PartiesCombobox.getSelectedIndex();
        if (partyIndex == -1)
            return;
        Party selectedParty = Party.parties.get(partyIndex);
        idLabel.setText( "#id " + String.valueOf(selectedParty.getId()));
        filmLabel.setText(selectedParty.getFilm());
        moviePriceLabel.setText(String.valueOf(selectedParty.getPrice()) + " EGP");
        durationLabel.setText(selectedParty.getTimeInterval().display());
        
//        sectionsCombobox.removeAllItems();
        // load party sections
        sectionsCombobox.removeAllItems();
        seatsCombobox.removeAllItems();
        for (Section section: selectedParty.getTheater().getSections()) {
            sectionsCombobox.addItem("section " + String.valueOf(section.getId()));
        }
        int selectedSectionIndex = sectionsCombobox.getSelectedIndex();
        if (selectedSectionIndex == -1) return;
        Section selectedSection = Section.sections.get(selectedSectionIndex);
        float totalPrice = selectedParty.getPrice() + selectedSection.getPrice();
        totalPriceLabel.setText(String.valueOf(totalPrice) + " EGP");
    }                                               

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String paymentType;
        if (cashRadiobtn.isSelected())
            paymentType = "Cash";
        else
            paymentType = "Visa";
        
        // get selected pary and section
        Party selectedParty = Party.parties.get(PartiesCombobox.getSelectedIndex());
        Section selectedSection = selectedParty.getTheater().getSections().get(sectionsCombobox.getSelectedIndex());
        Seat selectedSeat = selectedSection.getAvailableSeats().get(seatsCombobox.getSelectedIndex());
        System.out.println("Selected Seat");
        System.out.println(selectedSeat);
        float totalPrice = selectedParty.getPrice() + selectedSection.getPrice();
        
        Ticket ticket = new Ticket(totalPrice, selectedSeat, selectedParty.getFilm(), selectedParty.getTheater(), paymentType);
        selectedSeat.setAvailable(false);
        JOptionPane.showMessageDialog(this, ticket.show(selectedSection, totalPrice), "Ticket invoice", JOptionPane.INFORMATION_MESSAGE);
        loadParties();
    }                                        

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Cinema Reservation System");
//        System.out.println("-------------------------");
//        System.out.println("");
//        System.out.println("1. Add Party");
//        System.out.println("2. Show GUI");
//        
//        String choice = scanner.nextLine().trim();
//        if (choice.equals("1")){
//            Party.CreateParty(scanner);
//        }
//            /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReservationForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> PartiesCombobox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cashRadiobtn;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JLabel filmLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel moviePriceLabel;
    private javax.swing.JComboBox<String> seatsCombobox;
    private javax.swing.JLabel sectionPriceLabel;
    private javax.swing.JComboBox<String> sectionsCombobox;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JRadioButton visaRadiobtn;
}
