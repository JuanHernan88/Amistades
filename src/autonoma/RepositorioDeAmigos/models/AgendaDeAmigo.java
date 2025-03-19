/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.RepositorioDeAmigos.models;

import java.util.ArrayList;
import java.util.List;

/**
 *Modelo para representar un Amigo
 * 
 * @author Juan Esteban Hernández Martínez
 * @since 20250312
 * @version 1.0.0 
 *
 * Clase que representa una agenda de amigos. Permite agregar y buscar amigos.
 */
public class AgendaDeAmigo {
    private List<Amigo> amigos; // Lista de amigos registrados en la agenda.

    /**
     * Constructor de la clase AgendaDeAmigos.
     * Inicializa la lista de amigos.
     */
    public AgendaDeAmigo() {
        this.amigos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo amigo a la agenda si cumple con las validaciones.
     * 
     * @param amigo Objeto Amigo a agregar.
     * @return true si se agregó correctamente, false si el amigo ya existe o si los datos son inválidos.
     */
    public boolean agregarAmigo(Amigo amigo) {
        if (!esValido(amigo)) {
            return false; // No se agregará el amigo si los datos son inválidos.
        }
        if (buscarAmigo(amigo.getEmail()) != null) {
            return false; // No se permite duplicar amigos con el mismo correo.
        }
        amigos.add(amigo);
        return true; // Amigo agregado correctamente.
    }

    /**
     * Busca un amigo en la agenda por su dirección de correo electrónico.
     * 
     * @param email Correo electrónico del amigo a buscar.
     * @return Objeto Amigo si se encuentra, null si no existe.
     */
    public Amigo buscarAmigo(String email) {
        for (Amigo amigo : amigos) {
            if (amigo.getEmail().equals(email)) {
                return amigo; // Retorna el amigo encontrado.
            }
        }
        return null; // Retorna null si el amigo no está registrado.
    }

    /**
     * Muestra información sobre la aplicación.
     */
    public void mostrarAcercaDe() {
        System.out.println("Aplicación: Agenda de Amigos");
        System.out.println("Taller de programación - Universidad UAM");
        System.out.println("Desarrolladores: [Nombres de los integrantes]");
    }

    /**
     * Valida que los datos del amigo sean correctos antes de agregarlo a la agenda.
     * 
     * @param amigo Objeto Amigo a validar.
     * @return true si los datos son válidos, false en caso contrario.
     */
    private boolean esValido(Amigo amigo) {
        return amigo.getNombre() != null && !amigo.getNombre().isEmpty()
                && amigo.getEmail() != null && amigo.getEmail().contains("@")
                && amigo.getTelefono() != null 
                && (amigo.getTelefono().startsWith("606") || amigo.getTelefono().startsWith("30"));
    }
}
