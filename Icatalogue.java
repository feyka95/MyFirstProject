/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.Catalogue;
import java.util.List;

/**
 *
 * @author Faika
 */
public interface Icatalogue {
    public void ajoutercat(Catalogue cat);
    public void deletecat(Catalogue cat);
    public List listercat();
    public void Updatecat(int idcat,String des);
    
}
