/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test; 

import Connection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lini Eisha
 */
public class fetch {
     
DBConnect dbcon;
    
    public fetch(){
        dbcon = DBConnect.getInstance();
    }
    
    public ResultSet fetchData() throws SQLException, ClassNotFoundException{
            
    ResultSet result = null;        
    PreparedStatement statement = null;
    
     if (dbcon.isConnected()) 
    {
    Connection connect = dbcon.getCon();
    
    statement = connect.prepareStatement("SELECT * FROM `raw_materials`");
    
    result = statement.executeQuery();
  
    }
    
    return result;
    
    }
    
    
    public ResultSet fetchItems() throws SQLException, ClassNotFoundException{
            
    ResultSet result = null;        
    PreparedStatement statement = null;
    
     if (dbcon.isConnected()) 
    {
    Connection connect = dbcon.getCon();
    
    statement = connect.prepareStatement("SELECT `name` FROM `menu_items`");
    
    result = statement.executeQuery();
  
    }
    
    return result;
    
    }
    
    
    
//    CREATE VIEW determineRaw AS
//SELECT i.item_id, i.name , r.rawID r.name, rd.quantity
//FROM menu_items i , raw_materials r, raw_determine rd
//WHERE rd.rawID = r.rawID AND rd.item_id = i.item_id
    
      public ResultSet getDetweminedRaw() throws SQLException, ClassNotFoundException{
            
    ResultSet result = null;        
    PreparedStatement statement = null;
    
     if (dbcon.isConnected()) 
    {
    Connection connect = dbcon.getCon();
    
    statement = connect.prepareStatement("SELECT `item_name``raw_name``quantity` FROM `items_raw_name`");
    
    result = statement.executeQuery();
  
    }
    
    return result;
    
    }
   
            
            
}



class d {
public static void main(String[] args) throws SQLException, ClassNotFoundException{



//    fetch f = new fetch();
//    //ResultSet r = f.fetchAppetizers();
//    
//    while(r.next()){
//    System.out.println(r.getString("name")+"  :  ");    
//    String in = r.getString("ingredients");
//    String[] raws = in.split(",");
//    for(int i=0;i<raws.length;i++){
//        System.out.println(raws[i].trim());}
    }
}