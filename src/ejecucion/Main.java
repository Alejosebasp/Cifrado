/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;

import dao.Dao;
import data.Asset;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import servicios.Servicio;
import ui.UI;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, NullPointerException {
        
        UI ui = new UI();
        ui.menu();
    }
    
}
