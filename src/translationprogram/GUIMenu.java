/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translationprogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Ryan1
 */
public class GUIMenu
{
    private JFrame frame = new JFrame("Program");
    private JPanel northPanel = new JPanel();
    JPanelGradient centerPanel = new JPanelGradient();
    private JLabel title = new JLabel();
    
    private ArrayList <JTextArea> areaList = new ArrayList<JTextArea>();
    
    private JTextArea questionsAndJokes1 = new JTextArea();
    private JTextArea questionsAndJokes2 = new JTextArea();
    private JTextArea questionsAndJokes3 = new JTextArea();
    private JTextArea questionsAndJokes4 = new JTextArea();
    private JTextArea questionsAndJokes5 = new JTextArea();
    private JTextArea questionsAndJokes6 = new JTextArea();
    private JTextArea questionsAndJokes7 = new JTextArea();
    private JTextArea questionsAndJokes8 = new JTextArea();
    private JTextArea questionsAndJokes9 = new JTextArea();
    private JTextArea questionsAndJokes10 = new JTextArea();
    private JTextArea questionsAndJokes11 = new JTextArea();
    private JTextArea questionsAndJokes12 = new JTextArea();
    
    //First Question
    private JButton firstTranslateToFrenchButton = new JButton();
    private JButton firstTranslateToSpanishButton = new JButton();
    private JButton firstTranslateToEnglishButton = new JButton();
    
    //Second Question
    private JButton secondTranslateToFrenchButton = new JButton();
    private JButton secondTranslateToSpanishButton = new JButton();
    private JButton secondTranslateToEnglishButton = new JButton();
    
    //Third Question
    private JButton thirdTranslateToFrenchButton = new JButton();
    private JButton thirdTranslateToSpanishButton = new JButton();
    private JButton thirdTranslateToEnglishButton = new JButton();
    
    //Fourth Question
    private JButton fourthTranslateToFrenchButton = new JButton();
    private JButton fourthTranslateToSpanishButton = new JButton();
    private JButton fourthTranslateToEnglishButton = new JButton();
    
    //Fifth Question
    private JButton fifthTranslateToFrenchButton = new JButton();
    private JButton fifthTranslateToSpanishButton = new JButton();
    private JButton fifthTranslateToEnglishButton = new JButton();
    
    //Sixth Question
    private JButton sixthTranslateToFrenchButton = new JButton();
    private JButton sixthTranslateToSpanishButton = new JButton();
    private JButton sixthTranslateToEnglishButton = new JButton();
    
    //seventh Question
    private JButton seventhTranslateToFrenchButton = new JButton();
    private JButton seventhTranslateToSpanishButton = new JButton();
    private JButton seventhTranslateToEnglishButton = new JButton();
    
    //eighth Question
    private JButton eighthTranslateToFrenchButton = new JButton();
    private JButton eighthTranslateToSpanishButton = new JButton();
    private JButton eighthTranslateToEnglishButton = new JButton();
    
    //ninth Question
    private JButton ninthTranslateToFrenchButton = new JButton();
    private JButton ninthTranslateToSpanishButton = new JButton();
    private JButton ninthTranslateToEnglishButton = new JButton();
    
    //tenth Question
    private JButton tenthTranslateToFrenchButton = new JButton();
    private JButton tenthTranslateToSpanishButton = new JButton();
    private JButton tenthTranslateToEnglishButton = new JButton();
    
    //Fifth Question
    private JButton eleventhTranslateToFrenchButton = new JButton();
    private JButton eleventhTranslateToSpanishButton = new JButton();
    private JButton eleventhTranslateToEnglishButton = new JButton();
    
    //Sixth Question
    private JButton twelveTranslateToFrenchButton = new JButton();
    private JButton twelveTranslateToSpanishButton = new JButton();
    private JButton twelveTranslateToEnglishButton = new JButton();
    
    private final String RESOURCE_PATH = "resources/MessageBundle";
    private ResourceBundle bundle;

    
    
    public GUIMenu(String lan)
    {
        if(lan.toLowerCase().equals("english"))
        {
            bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        }
        else if(lan.toLowerCase().equals("french"))
        {
            bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        }
        else if(lan.toLowerCase().equals("spanish"))
        {
            bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        }
        
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension (1300,800));
        frame.setLocationRelativeTo(null); 
        frame.setResizable(false);
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);

        addFieldToList();
        addComponentsToMenu();
        setFont();
        setText();
        setActionListener();
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void addFieldToList()
    {
        areaList.add(questionsAndJokes1);
        areaList.add(questionsAndJokes2);
        areaList.add(questionsAndJokes3);
        areaList.add(questionsAndJokes4);
        areaList.add(questionsAndJokes5);
        areaList.add(questionsAndJokes6);
        areaList.add(questionsAndJokes7);
        areaList.add(questionsAndJokes8);
        areaList.add(questionsAndJokes9);
        areaList.add(questionsAndJokes10);
        areaList.add(questionsAndJokes11);
        areaList.add(questionsAndJokes12);
    }

    private void addComponentsToMenu()
    {
        northPanel.add(title);    
        centerPanel.setBackground(new Color(80, 190, 212));
        
        centerPanel.add(firstTranslateToEnglishButton);
        centerPanel.add(firstTranslateToFrenchButton);
        centerPanel.add(firstTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes1);
        
        centerPanel.add(secondTranslateToEnglishButton);
        centerPanel.add(secondTranslateToFrenchButton);
        centerPanel.add(secondTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes2);
        
        
        centerPanel.add(thirdTranslateToEnglishButton);
        centerPanel.add(thirdTranslateToFrenchButton);
        centerPanel.add(thirdTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes3);
       
        
        centerPanel.add(fourthTranslateToEnglishButton);
        centerPanel.add(fourthTranslateToFrenchButton);
        centerPanel.add(fourthTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes4);
        
        centerPanel.add(fifthTranslateToEnglishButton);
        centerPanel.add(fifthTranslateToFrenchButton);
        centerPanel.add(fifthTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes5);
        
        centerPanel.add(sixthTranslateToEnglishButton);
        centerPanel.add(sixthTranslateToFrenchButton);
        centerPanel.add(sixthTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes6);
        
        centerPanel.add(seventhTranslateToEnglishButton);
        centerPanel.add(seventhTranslateToFrenchButton);
        centerPanel.add(seventhTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes7);
        
        
        centerPanel.add(eighthTranslateToEnglishButton);
        centerPanel.add(eighthTranslateToFrenchButton);
        centerPanel.add(eighthTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes8);
        
        
        centerPanel.add(ninthTranslateToEnglishButton);
        centerPanel.add(ninthTranslateToFrenchButton);
        centerPanel.add(ninthTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes9);
        
        centerPanel.add(tenthTranslateToEnglishButton);
        centerPanel.add(tenthTranslateToFrenchButton);
        centerPanel.add(tenthTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes10);
        

        centerPanel.add(eleventhTranslateToEnglishButton);
        centerPanel.add(eleventhTranslateToFrenchButton);
        centerPanel.add(eleventhTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes11);
        
        
        centerPanel.add(twelveTranslateToEnglishButton);
        centerPanel.add(twelveTranslateToFrenchButton);
        centerPanel.add(twelveTranslateToSpanishButton);
        centerPanel.add(questionsAndJokes12);
        
    }
    
    private void setFont()
    {
        title.setFont(new Font("SansSerif Plain", Font.BOLD, 20));       
        
        for(JTextArea temp : areaList)
        {
            temp.setFont(new Font("SansSerif Plain", Font.BOLD, 20));
            temp.setLineWrap(true);
            temp.setWrapStyleWord(true);
            temp.setColumns(60);
            temp.setRows(2);
            temp.setOpaque(false);
        }
        
        firstTranslateToEnglishButton.setText("English");
        firstTranslateToFrenchButton.setText("Francés");
        firstTranslateToSpanishButton.setText("Español");
        
        secondTranslateToEnglishButton.setText("English");
        secondTranslateToFrenchButton.setText("Francés");
        secondTranslateToSpanishButton.setText("Español");
        
        thirdTranslateToEnglishButton.setText("English");
        thirdTranslateToFrenchButton.setText("Francés");
        thirdTranslateToSpanishButton.setText("Español");
        
        fourthTranslateToEnglishButton.setText("English");
        fourthTranslateToFrenchButton.setText("Francés");
        fourthTranslateToSpanishButton.setText("Español");
        
        fifthTranslateToEnglishButton.setText("English");
        fifthTranslateToFrenchButton.setText("Francés");
        fifthTranslateToSpanishButton.setText("Español");
        
        sixthTranslateToEnglishButton.setText("English");
        sixthTranslateToFrenchButton.setText("Francés");
        sixthTranslateToSpanishButton.setText("Español");
        
        seventhTranslateToEnglishButton.setText("English");
        seventhTranslateToFrenchButton.setText("Francés");
        seventhTranslateToSpanishButton.setText("Español");
        
        eighthTranslateToEnglishButton.setText("English");
        eighthTranslateToFrenchButton.setText("Francés");
        eighthTranslateToSpanishButton.setText("Español");
        
        ninthTranslateToEnglishButton.setText("English");
        ninthTranslateToFrenchButton.setText("Francés");
        ninthTranslateToSpanishButton.setText("Español");
        
        tenthTranslateToEnglishButton.setText("English");
        tenthTranslateToFrenchButton.setText("Francés");
        tenthTranslateToSpanishButton.setText("Español"); 
        
        eleventhTranslateToEnglishButton.setText("English");
        eleventhTranslateToFrenchButton.setText("Francés");
        eleventhTranslateToSpanishButton.setText("Español");
        
        twelveTranslateToEnglishButton.setText("English");
        twelveTranslateToFrenchButton.setText("Francés");
        twelveTranslateToSpanishButton.setText("Español");
    }
    
    private void setText()
    {
        title.setText(bundle.getString("welcome_message"));
        questionsAndJokes1.setText(bundle.getString("introduce_yourself"));
        questionsAndJokes1.setEditable(false);
        questionsAndJokes2.setText(bundle.getString("ask_how_someone_is"));
        questionsAndJokes2.setEditable(false);
        questionsAndJokes3.setText(bundle.getString("ask_how_the_family_is"));
        questionsAndJokes3.setEditable(false);
        questionsAndJokes4.setText(bundle.getString("ask_someones_fav_language"));
        questionsAndJokes4.setEditable(false);
        questionsAndJokes5.setText(bundle.getString("where_have_they_visited_and_which_is_best"));
        questionsAndJokes5.setEditable(false);
        questionsAndJokes6.setText(bundle.getString("how_many_languages_can_they_speak"));
        questionsAndJokes6.setEditable(false);
        questionsAndJokes7.setText(bundle.getString("favourite_genre_of_music"));
        questionsAndJokes7.setEditable(false);
        questionsAndJokes8.setText(bundle.getString("favourite_movie_genre"));
        questionsAndJokes8.setEditable(false);
        questionsAndJokes9.setText(bundle.getString("joke_one"));
        questionsAndJokes9.setEditable(false);
        questionsAndJokes10.setText(bundle.getString("joke_one_answer"));
        questionsAndJokes10.setEditable(false);
        questionsAndJokes11.setText(bundle.getString("joke_two"));
        questionsAndJokes11.setEditable(false);
        questionsAndJokes12.setText(bundle.getString("joke_two_answer"));
        questionsAndJokes12.setEditable(false);  
    }
    
    private void setActionListener()
    {
        firstTranslateToEnglishButton.addActionListener(new FirstTranslateToEnglishHandler());
        firstTranslateToFrenchButton.addActionListener(new FirstTranslateToFrenchHandler());
        firstTranslateToSpanishButton.addActionListener(new FirstTranslateToSpanishHandler());
        secondTranslateToEnglishButton.addActionListener(new SecondTranslateToEnglishHandler());
        secondTranslateToFrenchButton.addActionListener(new SecondTranslateToFrenchHandler());
        secondTranslateToSpanishButton.addActionListener(new SecondTranslateToSpanishHandler());
        thirdTranslateToEnglishButton.addActionListener(new ThirdTranslateToEnglishHandler());
        thirdTranslateToFrenchButton.addActionListener(new ThirdTranslateToFrenchHandler());
        thirdTranslateToSpanishButton.addActionListener(new ThirdTranslateToSpanishHandler());
        fourthTranslateToEnglishButton.addActionListener(new FourthTranslateToEnglishHandler());
        fourthTranslateToFrenchButton.addActionListener(new FourthTranslateToFrenchHandler());
        fourthTranslateToSpanishButton.addActionListener(new FourthTranslateToSpanishHandler());
        fifthTranslateToEnglishButton.addActionListener(new FifthTranslateToEnglishHandler());
        fifthTranslateToFrenchButton.addActionListener(new FifthTranslateToFrenchHandler());
        fifthTranslateToSpanishButton.addActionListener(new FifthTranslateToSpanishHandler());
        sixthTranslateToEnglishButton.addActionListener(new SixthTranslateToEnglishHandler());
        sixthTranslateToFrenchButton.addActionListener(new SixthTranslateToFrenchHandler());
        sixthTranslateToSpanishButton.addActionListener(new SixthTranslateToSpanishHandler());
        
        
        
        
        seventhTranslateToEnglishButton.addActionListener(new SeventhTranslateToEnglishHandler());
        seventhTranslateToFrenchButton.addActionListener(new SeventhTranslateToFrenchHandler());
        seventhTranslateToSpanishButton.addActionListener(new SeventhTranslateToSpanishHandler());
        eighthTranslateToEnglishButton.addActionListener(new EighthTranslateToEnglishHandler());
        eighthTranslateToFrenchButton.addActionListener(new EigthTranslateToFrenchHandler());
        eighthTranslateToSpanishButton.addActionListener(new EighthTranslateToSpanishHandler());
        ninthTranslateToEnglishButton.addActionListener(new NinthTranslateToEnglishHandler());
        ninthTranslateToFrenchButton.addActionListener(new NinthTranslateToFrenchHandler());
        ninthTranslateToSpanishButton.addActionListener(new NinthTranslateToSpanishHandler());
        tenthTranslateToEnglishButton.addActionListener(new TenthTranslateToEnglishHandler());
        tenthTranslateToFrenchButton.addActionListener(new TenthTranslateToFrenchHandler());
        tenthTranslateToSpanishButton.addActionListener(new TenthTranslateToSpanishHandler());
        eleventhTranslateToEnglishButton.addActionListener(new EleventhTranslateToEnglishHandler());
        eleventhTranslateToFrenchButton.addActionListener(new EleventhTranslateToFrenchHandler());
        eleventhTranslateToSpanishButton.addActionListener(new EleventhTranslateToSpanishHandler());
        twelveTranslateToEnglishButton.addActionListener(new TwelveTranslateToEnglishHandler());
        twelveTranslateToFrenchButton.addActionListener(new TwelveTranslateToFrenchHandler());
        twelveTranslateToSpanishButton.addActionListener(new TwelveTranslateToSpanishHandler());
    }
    
    private class FirstTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes1.setText(bundle.getString("introduce_yourself"));
        questionsAndJokes1.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class FirstTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes1.setText(bundle.getString("introduce_yourself"));
        questionsAndJokes1.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class FirstTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes1.setText(bundle.getString("introduce_yourself"));
        questionsAndJokes1.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class SecondTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes2.setText(bundle.getString("ask_how_someone_is"));
        questionsAndJokes2.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class SecondTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes2.setText(bundle.getString("ask_how_someone_is"));
        questionsAndJokes2.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class SecondTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes2.setText(bundle.getString("ask_how_someone_is"));
        questionsAndJokes2.setEditable(false);

//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class ThirdTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes3.setText(bundle.getString("ask_how_the_family_is"));
        questionsAndJokes3.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class ThirdTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes3.setText(bundle.getString("ask_how_the_family_is"));
        questionsAndJokes3.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class ThirdTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes3.setText(bundle.getString("ask_how_the_family_is"));
        questionsAndJokes3.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class FourthTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes4.setText(bundle.getString("ask_someones_fav_language"));
        questionsAndJokes4.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class FourthTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes4.setText(bundle.getString("ask_someones_fav_language"));
        questionsAndJokes4.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class FourthTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes4.setText(bundle.getString("ask_someones_fav_language"));
        questionsAndJokes4.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    private class FifthTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes5.setText(bundle.getString("where_have_they_visited_and_which_is_best"));
        questionsAndJokes5.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class FifthTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes5.setText(bundle.getString("where_have_they_visited_and_which_is_best"));
        questionsAndJokes5.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class FifthTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes5.setText(bundle.getString("where_have_they_visited_and_which_is_best"));
        questionsAndJokes5.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    private class SixthTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes6.setText(bundle.getString("how_many_languages_can_they_speak"));
        questionsAndJokes6.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class SixthTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes6.setText(bundle.getString("how_many_languages_can_they_speak"));
        questionsAndJokes6.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class SixthTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes6.setText(bundle.getString("how_many_languages_can_they_speak"));
        questionsAndJokes6.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    private class SeventhTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes7.setText(bundle.getString("favourite_genre_of_music"));
        questionsAndJokes7.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class SeventhTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes7.setText(bundle.getString("favourite_genre_of_music"));
        questionsAndJokes7.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class SeventhTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes7.setText(bundle.getString("favourite_genre_of_music"));
        questionsAndJokes7.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    private class EighthTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes8.setText(bundle.getString("favourite_movie_genre"));
        questionsAndJokes8.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class EigthTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes8.setText(bundle.getString("favourite_movie_genre"));
        questionsAndJokes8.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class EighthTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes8.setText(bundle.getString("favourite_movie_genre"));
        questionsAndJokes8.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class NinthTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes9.setText(bundle.getString("joke_one"));
        questionsAndJokes9.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class NinthTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes9.setText(bundle.getString("joke_one"));
        questionsAndJokes9.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class NinthTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes9.setText(bundle.getString("joke_one"));
        questionsAndJokes9.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class TenthTranslateToEnglishHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes10.setText(bundle.getString("joke_one_answer"));
        questionsAndJokes10.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class TenthTranslateToFrenchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes10.setText(bundle.getString("joke_one_answer"));
        questionsAndJokes10.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class TenthTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes10.setText(bundle.getString("joke_one_answer"));
        questionsAndJokes10.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
     private class EleventhTranslateToEnglishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes11.setText(bundle.getString("joke_two"));
        questionsAndJokes11.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
     
      private class EleventhTranslateToFrenchHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes11.setText(bundle.getString("joke_two"));
        questionsAndJokes11.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
      
      private class EleventhTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes11.setText(bundle.getString("joke_two"));
        questionsAndJokes11.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
      
      private class TwelveTranslateToEnglishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        questionsAndJokes12.setText(bundle.getString("joke_two_answer"));
        questionsAndJokes12.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
      private class TwelveTranslateToFrenchHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        questionsAndJokes12.setText(bundle.getString("joke_two_answer"));
        questionsAndJokes12.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
      
      private class TwelveTranslateToSpanishHandler implements ActionListener
    {     
        @Override
        public void actionPerformed(ActionEvent e) {
        bundle = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("es", "ES"));
        questionsAndJokes12.setText(bundle.getString("joke_two_answer"));
        questionsAndJokes12.setEditable(false);
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

 
    
    public static void main(String[]args)
    {   
        BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.println("Please type in the language you would like:");
            String input = string.readLine();
            
            if(input.toLowerCase().equals("english"))
            {
                new GUIMenu("english");
            }
            else if(input.toLowerCase().equals("french"))
            {
                new GUIMenu("french");
            }
            else if(input.toLowerCase().equals("spanish"))
            {
                new GUIMenu("spanish");
            }
            else
            {
                System.out.println("Please enter English, French or Spanish");
            }   
        }
        catch (IOException e) 
        {
            System.out.println (e.toString());
        }
    }
}
