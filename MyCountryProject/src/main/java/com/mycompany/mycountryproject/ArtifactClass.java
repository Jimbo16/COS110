/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mycountryproject;

/**
 *
 * @author jimmy
 */
public class ArtifactClass {

    String entryForComboBox;
    String informationText;
    String[] listParts;

    public ArtifactClass(String entryForComboBox, String informationText) {
    System.out.println("EntryforComboBoxhas" + entryForComboBox);
    System.out.println("informationText" + informationText);
        this.entryForComboBox = entryForComboBox;
        this.informationText = informationText;
        listParts = informationText.split("//");
        System.out.println("The array listParts has " + listParts.length);
        for (int index = 0; index < listParts.length; index++) {
            System.out.println("index" + index + "has " + listParts[index]);
        }
    }

    public String getEntryForComboBox() {
        return this.entryForComboBox;
    }

    public String getInformationText() {
        return this.informationText;
    }

    public void setEntryForComboBox(String entryForComboBox) {
        this.entryForComboBox = entryForComboBox;
    }

    public void setInformationText(String informationText) {
        this.informationText = informationText;
    }

    public int getListPartsLength() {
        return this.listParts.length;
    }

    public String getListHeader(int theArrayIndex) {
        int ending = this.listParts[theArrayIndex].indexOf(':');
        return this.listParts[theArrayIndex].substring(0, ending);
   }
    
    public String getListHeaderAssociatedText (int theArrayIndex)
    {
        int ending = this.listParts[theArrayIndex].indexOf(':') + 1;
        return this.listParts [theArrayIndex].substring(ending);
    }


    @Override
    public String toString() {
        return getInformationText();
    }

    ArtifactClass myArtifactClass;
    java.util.ArrayList<ArtifactClass> myArtifactClassList = new java.util.ArrayList<>();
    private javax.swing.DefaultListModel listModel = new javax.swing.DefaultListModel<>();
}
