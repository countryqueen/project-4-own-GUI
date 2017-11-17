/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4advjava;

import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
/**
 *
 * @author Owner
 * ‘******************************************************
‘***  Class Name: NewGui
‘***  Class Author Angelic
‘******************************************************
‘*** Purpose of the class : to recreate a better gui from mainGUI
‘***
‘******************************************************
‘*** Date 11/17/17
‘******************************************************

 */
public class NewGui extends JFrame
{
    

    private final JButton bookView;
    private final JButton movieView;
    private final JButton paintingView;
    private final JButton itemView;
    private final Container firstPane;
    private JTextField field;//the text field for user input
    private JButton button;//button
    private JLabel label;
    private JPanel ThePanel; //this holds the button
    private JTextArea area;
    private Container pane;
     //create an array list of store items
    ArrayList<StoreItem> storeItems;
    
    ArrayList<String> actorsList;
    ArrayList<String> actressesList;
    
    
    //the array is passed as an argument
    
    
    //constructor
    public NewGui()
    {        
        super("Buttons");
        FlowLayout experimentLayout = new FlowLayout();
        JPanel thePanel = new JPanel();
        thePanel.setLayout(new FlowLayout());
        this.add(thePanel);

        storeItems = new ArrayList<StoreItem>();
        //array list is al.
       
        //creating a default list model object of the list (in the gui)
         DefaultListModel listModel;
        
        actorsList = new ArrayList<>();
        actressesList = new ArrayList<>();
        // Define the size of the frame
        this.setSize(1000, 1000);
        
        
        // Define if the user can resize the frame (true by default)
        this.setResizable(false);

        // Define how the frame exits (Click the Close Button)
        // Without this Java will eventually close the app

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //container is initialized
        firstPane = new Container();
        
        //here is the first set of buttons
        bookView = new JButton("Book");
        bookView.setPreferredSize(new Dimension(100,100));
        thePanel.add(bookView);
        
        movieView = new JButton("Movie");
        movieView.setPreferredSize(new Dimension(100,100));
        thePanel.add(movieView);
        
        paintingView = new JButton("Painting");
        paintingView.setPreferredSize(new Dimension(100,100));
        thePanel.add(paintingView);
        
        
        itemView = new JButton("Sell/View");
        itemView.setPreferredSize(new Dimension(100,100));
        thePanel.add(itemView);
        
        //create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        bookView.addActionListener(handler);
        
        ButtonReceiver receiver = new ButtonReceiver();
        movieView.addActionListener(receiver);

        ButtonListener listener = new ButtonListener();
        paintingView.addActionListener(listener);
        
        ButtonCaller caller = new ButtonCaller();
        itemView.addActionListener(caller);
        
        //here are the textfields and labels for the painting class
                JLabel pt =  new JLabel();
                pt.setText("painting title");
                thePanel.add(pt);
               JTextField paintingTitle = new JTextField(8);
               String title = paintingTitle.getText();
               thePanel.add(paintingTitle);
               
               JLabel pa =  new JLabel();
               pa.setText("painting author");
               thePanel.add(pa);
               JTextField paintingAuthor = new JTextField(8);
               String author = paintingAuthor.getText();
               thePanel.add(paintingAuthor);
               
               
                JLabel pd =  new JLabel();
                pd.setText("painting date"); 
                thePanel.add(pd);
               JTextField paintingDate = new JTextField(8);
               String dateAcquired = paintingDate.getText();
               thePanel.add(paintingDate);
               
               JLabel pm =  new JLabel();
               pm.setText("media");
               thePanel.add(pm);
               JTextField paintingMedia = new JTextField(8);
               String media = paintingMedia.getText();
               thePanel.add(paintingMedia);
               
               JLabel ppp =  new JLabel();
               ppp.setText("painting purchase price");
               thePanel.add(ppp);
               JTextField paintingPurchasePrice = new JTextField(8);
               thePanel.add(paintingPurchasePrice);
               
               JLabel pap =  new JLabel();
               pap.setText("painting asking price");
               thePanel.add(pap);
               JTextField paintingAskingPrice = new JTextField(8);
               thePanel.add(paintingPurchasePrice);
               
               JLabel pw =  new JLabel();
               pw.setText("painting width");
               thePanel.add(pw);
               JTextField paintingWidthPrice = new JTextField(8);
               thePanel.add(paintingWidthPrice);
               
               
               JLabel ph =  new JLabel();
               ph.setText("painting height");
               thePanel.add(ph);
               JTextField paintingHeightPrice = new JTextField(8);
               thePanel.add(paintingHeightPrice);
               
               int purchasePrice = 0;
               int askingPrice = 0;
               int width = 0;
               int height = 0;
               try{
                   purchasePrice = Integer.parseInt(paintingPurchasePrice.getText());
                   
                   askingPrice = Integer.parseInt(paintingAskingPrice.getText());
               }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Error for price of a painting");
                }
               
               try{
                   width = Integer.parseInt(paintingWidthPrice.getText());
                   height = Integer.parseInt(paintingHeightPrice.getText());
               }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Error for dimensions of a painting");
                }
       
        //String title, String author, String dateAcquired, int purchasePrice, int askingPrice, int width, int height, String media
                paintings newPaintings = new paintings(title, author, dateAcquired, purchasePrice, askingPrice, width, height, media);
        
                
    }
//    
//    ‘***  Method Name: ButtonHandler
//‘***  Method Author (i.e. Your name)
//‘******************************************************
//‘*** Purpose of the Method create actionListener for the button for books
//‘*** Method Inputs:
//‘*** void methods
//‘******************************************************
//‘*** Date 11/171/17
//‘******************************************************

        //inner class for button event handling
    //book button
        private class ButtonHandler implements ActionListener
        {

            //handle button event
            @Override
            public void actionPerformed(ActionEvent event)
            {
                
                //if user selects a book
            if(event.getSource()==bookView)
            {
        
               JTextField bookTitle = new JTextField(8);
               String title = bookTitle.getText();
               
               
               JTextField bookAuthor = new JTextField(8);
               String author = bookAuthor.getText();
               
               JTextField bookGenre = new JTextField(8);
               String genre = bookGenre.getText();
               
               JTextField bookDate = new JTextField(8);
               String date = bookDate.getText();
               int purchasePrice = 0;
               int askingPrice = 0;
               try{
                   JTextField bookPurchasePrice = new JTextField(8);               
                   purchasePrice = Integer.parseInt(bookPurchasePrice.getText());
                   JTextField bookAskingPrice = new JTextField(8);
                   askingPrice = Integer.parseInt(bookAskingPrice.getText());
               }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Error for price of a book");
                }
               
               
               
               books newBooks = new books(title, author, date, purchasePrice, askingPrice, genre);
                //String title, String author, String dateAcquired, int purchasePrice,int askingPrice, String genre 
                storeItems.add(newBooks);
            }
            }
        }
        
        //    
//    ‘***  Method Name: ButtonHandler
//‘***  Method Author (i.e. Your name)
//‘******************************************************
//‘*** Purpose of the Method create actionListener for the button for movies
//‘*** Method Inputs:
//‘*** void methods
//‘******************************************************
//‘*** Date 11/171/17
//‘******************************************************
        
        //inner class for button event handling
        //movie button
        private class ButtonReceiver implements ActionListener
        {
            //handle button event
            @Override
            public void actionPerformed(ActionEvent event)
            {
                JPanel thePanel = new JPanel();
                
                JTextField movieTitle = new JTextField(8);
               String title = movieTitle.getText();
               thePanel.add(movieTitle);
               
               
               JTextField movieAuthor = new JTextField(8);
               String author = movieAuthor.getText();
               
               JTextField movieDirector = new JTextField(8);
               String director = movieDirector.getText();
               
               JTextField movieDate = new JTextField(8);
               String date = movieDate.getText();
               int purchasePrice = 0;
               int askingPrice = 0;
               try{
                   JTextField moviePurchasePrice = new JTextField(8);               
                   purchasePrice = Integer.parseInt(moviePurchasePrice.getText());
                   JTextField movieAskingPrice = new JTextField(8);
                   askingPrice = Integer.parseInt(movieAskingPrice.getText());
               }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Error for price of a movie");
                }
               
                //instantiating the movies. creatin a object of type movies that can be stored.
                movies newMovies = new movies(title, author, date, askingPrice, purchasePrice, director); 
                storeItems.add(newMovies);
            }
        }
        
        
        //    
//    ‘***  Method Name: ButtonHandler
//‘***  Method Author (i.e. Your name)
//‘******************************************************
//‘*** Purpose of the Method create actionListener for the button for paintings
//‘*** Method Inputs:
//‘*** void methods
//‘******************************************************
//‘*** Date 11/171/17
//‘******************************************************
        //inner class for button event handling
        //painting button
        private class ButtonListener implements ActionListener
        {

        private StoreItem newPaintings;
            //handle button event
            @Override
            public void actionPerformed(ActionEvent event)
            {
               //this button saves the information from the paintings textfields
//               int purchasePrice = 0;
//               int askingPrice = 0;
//               int width = 0;
//               int height = 0;
//               try{
//                   purchasePrice = Integer.parseInt(paintingPurchasePrice.getText());
//                   
//                   askingPrice = Integer.parseInt(paintingAskingPrice.getText());
//               }catch(NumberFormatException e)
//                {
//                    JOptionPane.showMessageDialog(null, "Error for price of a painting");
//                }
//               
//               try{
//                   width = Integer.parseInt(paintingWidthPrice.getText());
//                   height = Integer.parseInt(paintingHeightPrice.getText());
//               }catch(NumberFormatException e)
//                {
//                    JOptionPane.showMessageDialog(null, "Error for dimensions of a painting");
//                }
//               //String title, String author, String dateAcquired, int purchasePrice, int askingPrice, int width, int height, String media
//             //   paintings newPaintings = new paintings(title, author, dateAcquired, purchasePrice, askingPrice, width, height, media);
//        
                storeItems.add(newPaintings);
                
            }
        }
        
        //    
//    ‘***  Method Name: ButtonHandler
//‘***  Method Author (i.e. Your name)
//‘******************************************************
//‘*** Purpose of the Method create actionListener for the button for selling
//‘*** Method Inputs:
//‘*** void methods
//‘******************************************************
//‘*** Date 11/171/17
//‘******************************************************
        
        //view sell button
        //inner class for button event handling
        private class ButtonCaller implements ActionListener
        {
            //handle button event
            @Override
            //the following code below commented out were giving me issues.
            public void actionPerformed(ActionEvent event)
            {
//                int elementNum = ViewItems.getSelectedIndex();
        //the selected items will match the array
         //this is my try catch
         
         //if the user selects a negative value (or a list that isnt
//        if(elementNum == -1)
//        {
//            JOptionPane.showMessageDialog(null, "There no more items to sell");
//        
//        }
//        
//        else
//        {
//        
//        storeItems.get(elementNum).remove();
//        
//        //this is removing items off the array list
//        storeItems.remove(elementNum);
//        
//        //update the list Item since the item was deleted
////          listModel = new DefaultListModel();
////        
////        //add the storeItems Array to the listModel object which is the list gui palette
////        for(int i = 0; i < storeItems.size(); i++)
////        {
////            listModel.addElement(storeItems.get(i).printableString());
////        }
////        
//       ViewItems.setModel(listModel);
//        }
    
                
            }
        }
        
}
