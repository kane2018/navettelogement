/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import modele.Chambre;

/**
 *
 * @author tall
 */
public interface ServiceChambre {

    public String ajouter(Chambre c);

    public List<Chambre> listeChambres();
}