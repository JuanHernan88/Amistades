/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.RepositorioDeAmigos.main;

import autonoma.RepositorioDeAmigos.views.PaginaPrincipal;
import autonoma.RepositorioDeAmigos.models.AgendaDeAmigo;
import autonoma.RepositorioDeAmigos.models.Amigo;

/**
 *
 * @author juan jacobo cañas h
 * @since 26032025
 * @version 1.0.0
 */
public class RepositorioDeAmigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AgendaDeAmigo agendaAmigo = new AgendaDeAmigo();
        PaginaPrincipal paginaPrincipal = new PaginaPrincipal(agendaAmigo);
        paginaPrincipal.setVisible(true);
        
    }
    
}
