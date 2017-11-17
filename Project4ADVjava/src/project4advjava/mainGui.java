/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4advjava;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextArea;

/**
 *
 * @author Owner
 * ‘***  Class Name: mainGui
‘***  Class Author: Angelica 
‘******************************************************
‘*** Purpose of the class (Why did you write this class?)
‘***: to create easy access for the user to use our store items GUI
‘******************************************************
‘*** Date 11/171/17
* ‘******************************************************
* 
‘******************************************************
 */
public abstract class mainGui extends JFrame implements ActionListener
{
    
    



//    private final JButton JButton1;
    private JTextField field;//the text field for user input
    private JButton button;//button
    private JLabel label; //holds the components
    private JPanel ThePanel; //this holds the button
    private JTextArea area;
   // private final Container container;
    //private final GridLayout gridLayout1;
    //private final GridLayout gridLayout2;
    
    
    //create an array list of store items
    ArrayList<StoreItem> storeItems;
    
    ArrayList<String> actorsList;
    ArrayList<String> actressesList;
    public void SellView(ArrayList<StoreItem> al) {
        
        storeItems = al;
        //array list is al.
        
        //creating a default list model object of the list (in the gui)
         DefaultListModel listModel;
        
        listModel = new DefaultListModel();
        
        //add the storeItems Array to the listModel object which is the list gui palette
        for(int i = 0; i < storeItems.size(); i++)
        {
            listModel.addElement(storeItems.get(i).printableString());
        }
        
        ViewItems.setModel(listModel);
        
        
      //  ViewItems.addElement();
    }
    
    
    //the array is passed as an argument
    public mainGui() 
    {
        
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

        
        //specify an action for the close button
  
        ButtonHandler handler_button=new ButtonHandler();
        //creates a class for the buttons to be handled
        
        // set flow layout for the frame
    
      
    }


        //this is the class to st up the panel.
        private void buildThepanel()
        {
            
            JPanel thePanel = new JPanel();
            thePanel.setLayout(new FlowLayout());
            this.add(thePanel);

            //the following labels, buttons, and textfields are for the book class.

             // create empty JTextField
            JLabel bookTitleLabel =  new JLabel();
            bookTitleLabel.setLocation(1,40);
            bookTitleLabel.setSize(290,30);
            bookTitleLabel.setText("Book Title");
            JTextField bookTitle = new JTextField(8);
            bookTitle.setHorizontalAlignment(bookTitle.LEFT);
            bookTitle.setSize(100, 30);
            thePanel.add(bookTitle);
            thePanel.add(bookTitleLabel); //add component to the panel


            JLabel bookDateTitle =  new JLabel();
            bookDateTitle.setLocation(0,40);
            bookDateTitle.setSize(290,30);
            bookDateTitle.setHorizontalAlignment(0);
            bookDateTitle.setText("Book Date");
            thePanel.add(bookDateTitle);
            JTextField bookDate = new JTextField(8);
            bookDate.setSize(100, 30);
            thePanel.add(bookDate);


            JLabel bookPurchasePrice =  new JLabel();
            bookPurchasePrice.setText("Book PurchasePrice");
            thePanel.add(bookPurchasePrice);
        //    JTextField bookPurchasePrice = new JTextField(8);
            bookPurchasePrice.setSize(100, 30);
            bookPurchasePrice.getText();
            thePanel.add(bookPurchasePrice);

            JLabel bookAskingPrice =  new JLabel();
            bookAskingPrice.setText("Book AskingPrice");
            thePanel.add(bookAskingPrice);
            JTextField field4 = new JTextField(8);
            field4.setSize(100, 30);
            field4.getText();
            thePanel.add(field4);
            //field1.getText();

            JLabel label5 =  new JLabel();
            label5.setText("Book Author");
            thePanel.add(label5);
            JTextField field5 = new JTextField(8);
            field5.setSize(100, 30);
            field5.getText();
            thePanel.add(field5);
            //field1.getText();

            JLabel label6 =  new JLabel();
            label6.setText("Book Genre");
            thePanel.add(label6);
            JTextField field6 = new JTextField(8);
            field6.setSize(100, 30);
            field6.getText();
            thePanel.add(field6);
            //field1.getText();



            JButton button1 = new JButton();
            button1.setText("Add Book");
            ListenForButton lForButton = new ListenForButton();
            button1.addActionListener(lForButton);

           // add an action listener to the button
            button1.addActionListener(this);

            thePanel.add(button1);

            //the following labels, buttons, and textfields are the painting class


            //create an empty panel
            //create empty JTextField
            JLabel label7 =  new JLabel();
            label7.setLocation(0,0);
            label7.setSize(290,30);
            label7.setVerticalAlignment(0);
            String paintingTitle;
            label7.setText("Painting Title");
           // thePanel.add(label1); //add component to the panel
            JTextField field7 = new JTextField(8);
            field7.setSize(100, 30);
            paintingTitle = field7.getText();
            thePanel.add(field7);//add component to the panel
            

            JLabel label8 =  new JLabel();
            label8.setLocation(0,40);
            label8.setSize(290,30);
            label8.setHorizontalAlignment(0);
            String paintingDate;
            label8.setText("Painting Date");
            thePanel.add(label8);
            JTextField field8 = new JTextField(8);
            field8.setSize(100, 30);
            paintingDate = field8.getText();
            thePanel.add(field8);
            //field1.getText();

            JLabel label9 =  new JLabel();
            label9.setText("Painting PurchasePrice");
            thePanel.add(label9);
            JTextField field9 = new JTextField(8);
            field9.setSize(100, 30);
            int paintingPurchasePrice;
            thePanel.add(field9);


            JLabel label10 =  new JLabel();
            label10.setText("Painting AskingPrice");
            thePanel.add(label10);
            JTextField field10 = new JTextField(8);
            field10.setSize(100, 30);
            int paintingAskingPrice;
            thePanel.add(field10);
            //field1.getText();

            JLabel label11 =  new JLabel();
            label11.setText("Painting Author");
            thePanel.add(label11);
            JTextField field11 = new JTextField(8);
            field11.setSize(100, 30);
            String paintingAuthor;
            paintingAuthor = field11.getText();
            thePanel.add(field11);

            JLabel label12 =  new JLabel();
            label12.setText("Painting Height");
            thePanel.add(label12);
            JTextField field12 = new JTextField(8);
            field12.setSize(100, 30);
            int paintingHeight;
            thePanel.add(field12);
            //field1.getText();

            JLabel label13 =  new JLabel();
            label13.setText("Painting Width");
            thePanel.add(label13);
            JTextField field13 = new JTextField(8);
            field13.setSize(100, 30);
            int paintingWidth;
            thePanel.add(field13);

            JLabel label22 =  new JLabel();
            label22.setText("Painting Media");
            thePanel.add(label22);
            JTextField field22 = new JTextField(8);
            field22.setSize(100, 30);
            String paintingMedia;
            paintingMedia = field22.getText();
            thePanel.add(field22);

         //   storeItems.add(newPaintings);
            JButton button2 = new JButton();
            button2.setText("Add Painting");

            //youtuber Derek Banas suggested an action listener for the button along with dr Woodcock
            button2.addActionListener(lForButton);

            //add an action listener to the button
    //        button1.addActionListener(new ButtonListener());

            thePanel.add(button2);




            //the following buttons, labels, and textfields are for the movie class


            //create another empty panel
            JPanel thePanel3 = new JPanel();
            // create empty JTextField
            JLabel label14 =  new JLabel();
            label14.setLocation(0,0);
            label14.setSize(290,30);
            label14.setVerticalAlignment(0);
            label14.setText("Movie Title");
            thePanel3.add(label14); //add component to the panel
            JTextField field14 = new JTextField(8);
            field14.setSize(100, 30);
            field14.getText();
            thePanel3.add(field14);//add component to the panel
            //field1.getText();

            JLabel label15 =  new JLabel();
            label15.setLocation(0,40);
            label15.setSize(290,30);
            label15.setHorizontalAlignment(0);
            label5.setText("Movie Date");
            thePanel3.add(label15);
            JTextField field15 = new JTextField(8);
            field15.setSize(100, 30);
            field15.getText();
            thePanel3.add(field15);
            //field1.getText();

            JLabel label16 =  new JLabel();
            label16.setText("Movie PurchasePrice");
            thePanel3.add(label16);
            JTextField field16 = new JTextField(8);
            field16.setSize(100, 30);
            field16.getText();
            thePanel3.add(field16);
            //field1.getText();

            JLabel label17 =  new JLabel();
            label17.setText("Movie AskingPrice");
            thePanel3.add(label17);
            JTextField field17 = new JTextField(8);
            field17.setSize(100, 30);
            field17.getText();
            thePanel3.add(field17);
            //field1.getText();

            JLabel label18 =  new JLabel();
            label18.setText("Movie Author");
            thePanel3.add(label18);
            JTextField field18 = new JTextField(8);
            field18.setSize(100, 30);
            field18.getText();
            thePanel3.add(field18);
            //field1.getText();

            JLabel label19 =  new JLabel();
            label19.setText("Movie Actor");
            thePanel3.add(label19);
            JTextField field19 = new JTextField(8);
            field19.setSize(100, 30);
            field19.getText();
            thePanel3.add(field19);
            //field1.getText();

            JLabel label20 =  new JLabel();
            label20.setText("Movie Actress");
            thePanel3.add(label20);
            JTextField field20 = new JTextField(8);
            field20.setSize(100, 30);
            field20.getText();
            thePanel3.add(field20);

            JLabel label21 =  new JLabel();
            label21.setText("Movie Director");
            thePanel3.add(label21);
            JTextField field21 = new JTextField(8);
            field21.setSize(100, 30);
            field21.getText();
            thePanel3.add(field21);


            JButton button3 = new JButton();
            button3.setText("Add Movie");
            button3.addActionListener(lForButton);

            //add an action listener to the button
             //button1.addActionListener(new ButtonListener());

            thePanel.add(button3);

            //here is the sell button
            //this is for the sell and view button/area
            JButton button4 = new JButton();
            button4.setText("Sell");
            button4.setAlignmentX(BOTTOM_ALIGNMENT);
            thePanel.add(button4);
            button4.addActionListener(lForButton);


            //here the user can view their items
            JTextArea area1 = new JTextArea();
            area1.setSize(200,400);
            //ensures that words will go to the next line
            area1.setLineWrap(true);
            area1.setAlignmentX(BOTTOM_ALIGNMENT);
            thePanel.add(area1);

                    this.add(thePanel);
            //        this.add(thePanel2);
            //        this.add(thePanel3);
            //        this.add(thePanel4);        

                    this.setVisible(true);

        }
        
        //this is a private inner class that will handle the event once user click th button
        private class ListenForButton implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
             
               
            }
        }
        
        
         class ButtonHandler implements ActionListener
    {
        @Override
        //here is the actionPerformed method
        public void actionPerformed(ActionEvent event)
        {
            //needed to initialize the button again
            JButton saveBook = new JButton();
            saveBook.setText("Add Book");
            ListenForButton lForButton = new ListenForButton();
            saveBook.addActionListener(lForButton);
            JButton savePainting = new JButton();
            savePainting.setText("Add Painting");
            JButton saveMovie = new JButton();
            saveMovie.setText("Add Movie");
            saveMovie.addActionListener(lForButton);
            JButton sell = new JButton();
            sell.setText("Sell");
            //shows when the button is pushed it will take the users text fields info!
            //if user selects a book
            if(event.getSource()==saveBook)
            {
        
               JTextField bookTitle = new JTextField(8);
               String title = bookTitle.getText();
               
               JTextField bookAuthor = new JTextField(8);
               String author = bookAuthor.getText();
               
               JTextField bookGenre = new JTextField(8);
               String genre = bookGenre.getText();
               
               JTextField bookDate = new JTextField(8);
               String date = bookDate.getText();
               int purchasePrice =0;
               int askingPrice = 0;
               
               try{
                   JTextField bookPurchasePrice = new JTextField(8);
                   purchasePrice = Integer.parseInt(bookPurchasePrice.getText());
                   JTextField bookAskingPrice = new JTextField(8);
                   askingPrice = Integer.parseInt(bookAskingPrice.getText());
               }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Error for price of a movie");
                }
               
               
               
               books newBooks = new books(title, author, date, purchasePrice, askingPrice, genre);
                //String title, String author, String dateAcquired, int purchasePrice,int askingPrice, String genre 
                storeItems.add(newBooks);
            }
            //if user selects a painting
            else if(event.getSource() == savePainting)
            {
               JTextField paintingTitle = new JTextField(8);
               String title = paintingTitle.getText();
               
               JTextField paintingAuthor = new JTextField(8);
               String author = paintingAuthor.getText();
               
               JTextField paintingDate = new JTextField(8);
               String date = paintingDate.getText();
               
               JTextField paintingMedia = new JTextField(8);
               String media = paintingMedia.getText();
               
               int purchasePrice =0;
               int askingPrice = 0;
               int width =0;
               int height = 0;
              
               //here is my try catch to ensure that the user enters a number for the following fields
               try{
                   JTextField paintingPurchasePrice = new JTextField(8);
                   purchasePrice = Integer.parseInt(paintingPurchasePrice.getText());
                   JTextField paintingAskingPrice = new JTextField(8);
                   askingPrice = Integer.parseInt(paintingAskingPrice.getText());
               }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Error for price of painting");
                }
        
        
                try{
                    JTextField paintingHeight = new JTextField(8);
                    height = Integer.parseInt(paintingHeight.getText());
                    JTextField paintingWidth = new JTextField(8);
                    width = Integer.parseInt(paintingWidth.getText());
                }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Error, enter a number for height or weight");
                }
               
               
                paintings newPaintings = new paintings(title, author, date, purchasePrice, askingPrice, width, height, media);
        
                storeItems.add(newPaintings);
                //String title, String author, String dateAcquired, int purchasePrice,int askingPrice, String genre 
            }
            //if user selects a movie
            else if(event.getSource() == saveMovie)
            {   
                
               JTextField movieTitle = new JTextField(8);
               String title = movieTitle.getText();
               
               JTextField movieAuthor = new JTextField(8);
               String author = movieAuthor.getText();
               
               JTextField movieDate = new JTextField(8);
               String date = movieDate.getText();
               
               JTextField movieDirector = new JTextField(8);
               String director = movieDirector.getText();
               
               JTextField movieActors = new JTextField(8);
               String actors = movieActors.getText();
               
               JTextField movieActresses = new JTextField(8);
               String actresses = movieActresses.getText();
               int purchasePrice =0;
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
               //going to turn the actors and actresses list into an array
        
                //create array that is the same size as the list above.
                String[] actorsArray = new String[actorsList.size()];
                actorsArray = actorsList.toArray(actorsArray);
        
                String [] actressesArray = new String[actressesList.size()];
                actressesArray = actressesList.toArray(actressesArray);
        
               
               
               movies newMovies = new movies(title, author, date, askingPrice, purchasePrice, director, actorsArray, actressesArray);
                //String title, String author, String dateAcquired, int purchasePrice,int askingPrice, String genre 
                storeItems.add(newMovies); 
         
            }
            else if(event.getSource() == sell)
            {
                JTextArea ViewItems = new JTextArea();
                ViewItems.setText(" ");
                int elementNum = ViewItems;
                //the selected items will match the array
                //this is my try catch
         
                //if the user selects a negative value (or a list that isnt
                if(elementNum == -1)
                {
                    JOptionPane.showMessageDialog(null, "There no more items to sell");
        
                }
        
                else
                {
                    ArrayList<StoreItem> al = storeItems;
                    //array list is al.
        
                
                //creating a default list model object of the list (in the gui)
                DefaultListModel listModel;
                //add the storeItems Array to the listModel object which is the list gui palette
                for(int i = 0; i < storeItems.size(); i++)
                {   
                    listModel = new DefaultListModel();
                    listModel.addElement(storeItems.get(i).printableString());
                }
        
                ViewItems.setModel(listModel);
        
                    storeItems.get(elementNum).remove();
        
                    //this is removing items off the array list
                    storeItems.remove(elementNum);
        
                    //update the list Item since the item was deleted
                    listModel = new DefaultListModel();
        
                    //add the storeItems Array to the listModel object which is the list gui palette
                    for(int i = 0; i < storeItems.size(); i++)
                    {
                        listModel.addElement(storeItems.get(i).printableString());
                    }
        
                    ViewItems.setModel(listModel);
                }
                
            }
        }
    }
         
        }
