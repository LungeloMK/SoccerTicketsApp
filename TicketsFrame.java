
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TicketsFrame extends JFrame {
    
    //Panels
    private JPanel mainPnl;
    private JPanel headingsPnl;
    private JPanel customerDetailsPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel ticketsDetailsPnl;
    private JPanel homeTeamPnl;
    private JPanel awayteamPnl;
    private JPanel costPricePnl;
    private JPanel numTicketsPnl;
    private JPanel totAmountPnl;
    private JPanel buttonsPnl;
    private JPanel combinedDetailsPnl;
    
    //Labels
    private JLabel headingsLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel homeTeamLbl;
    private JLabel awayTeamLbl;
    private JLabel costPriceLbl;
    private JLabel numTicketsLbl;
    private JLabel totAmountLbl;
      
    //text Field
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField homeTeamTxtFld;
    private JTextField awayTeamTxtFld;
    private JTextField costPriceTxtFld;
    private JTextField totAmountTxtFld;
    
    //Buttons
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    // slide
    private JSlider numTicketsSld;

    public TicketsFrame()  {
        
        setTitle("Ticket sales");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setSize(500, 200);
        
        // headings Panel
      headingsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
      headingsLbl = new JLabel("Soccer Match Tickets");
      headingsLbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD+Font.ITALIC,40));
      headingsLbl.setForeground(Color.CYAN);
      headingsPnl.add(headingsLbl);
      
      // name row
      namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
      nameLbl = new JLabel("Name:     ");
      nameTxtFld = new JTextField(15);
      namePnl.add(nameLbl);
      namePnl.add(nameTxtFld);
      
      //surname row
      surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
      surnameLbl = new JLabel("Surname: ");
      surnameTxtFld = new JTextField(15);
      surnamePnl.add(surnameLbl);
      surnamePnl.add(surnameTxtFld);
      
      // customer details Panel
      customerDetailsPnl = new JPanel(new GridLayout(2,1));
      customerDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Customer details"));
      customerDetailsPnl.add(namePnl);
      customerDetailsPnl.add(surnamePnl);
      
      // home team row
      homeTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
      homeTeamLbl = new JLabel("Home team: ");
      homeTeamTxtFld = new JTextField(15);
      homeTeamPnl.add(homeTeamLbl);
      homeTeamPnl.add(homeTeamTxtFld);
      
      // away team row
      awayteamPnl= new JPanel(new FlowLayout(FlowLayout.LEFT));
      awayTeamLbl = new JLabel("Away team: ");
      awayTeamTxtFld = new JTextField(15);
      awayteamPnl.add(awayTeamLbl);
      awayteamPnl.add(awayTeamTxtFld);
      
      // cost price row
      costPricePnl= new JPanel(new FlowLayout(FlowLayout.LEFT));
      costPriceLbl = new JLabel("Cost price:R ");
      costPriceTxtFld = new JTextField(15);
      costPricePnl.add(costPriceLbl);
      costPricePnl.add(costPriceTxtFld);
      
      // number of tickets row
      numTicketsPnl= new JPanel(new FlowLayout(FlowLayout.LEFT));
      numTicketsLbl = new JLabel("Number of tickets required: ");
      numTicketsSld = new JSlider();
      numTicketsPnl.add(numTicketsLbl);
      numTicketsPnl.add(numTicketsSld);
      
      // total amount due row
      totAmountPnl= new JPanel(new FlowLayout(FlowLayout.LEFT));
      totAmountLbl = new JLabel("Total amount due:R ");
      totAmountTxtFld = new JTextField("To be calculated later.", 20);
      totAmountPnl.add(totAmountLbl);
      totAmountPnl.add(totAmountTxtFld);
      
      //Tickets deatails
      ticketsDetailsPnl = new JPanel(new GridLayout(5,1));
      ticketsDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Tickets details"));
      ticketsDetailsPnl.add(homeTeamPnl);
      ticketsDetailsPnl.add(awayteamPnl); 
      ticketsDetailsPnl.add(costPricePnl); 
      ticketsDetailsPnl.add(numTicketsPnl); 
      ticketsDetailsPnl.add(totAmountPnl); 
      
      //buttons panel
       buttonsPnl= new JPanel(new FlowLayout(FlowLayout.CENTER));
       buyBtn = new JButton("Buy");
       clearBtn = new JButton("Clear");
       exitBtn = new JButton("Exit");
       buttonsPnl.add(buyBtn);
       buttonsPnl.add(clearBtn);
       buttonsPnl.add(exitBtn);
       
       // Combined Details Panel
       combinedDetailsPnl = new JPanel(new GridLayout(2,1));
       combinedDetailsPnl.add(customerDetailsPnl);
       combinedDetailsPnl.add(ticketsDetailsPnl);
       
       // main panel
       mainPnl = new JPanel(new BorderLayout());
       mainPnl.add(headingsPnl,BorderLayout.NORTH);
       mainPnl.add(combinedDetailsPnl,BorderLayout.CENTER);
       mainPnl.add(buttonsPnl,BorderLayout.SOUTH);
       
       // Jframe Panel
        add(mainPnl);
        
        setVisible(true);
    }
   
}
