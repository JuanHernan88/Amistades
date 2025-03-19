/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.RepositorioDeAmigos.models;

/**
 *Modelo para representar un Amigo
 * 
 * @author Juan Esteban Hernández Martínez
 * @since 20250312
 * @version 1.0.0 
 *
 * Clase que representa un amigo con su nombre, teléfono y correo electrónico.
 */
public class Amigo {
    private String nombre;
    private String telefono;
    private String email;

    /**
     * Constructor de la clase Amigo.
     * 
     * @param nombre  Nombre del amigo.
     * @param telefono Número de teléfono del amigo.
     * @param email   Dirección de correo electrónico del amigo.
     */
    public Amigo(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Obtiene el nombre del amigo.
     * 
     * @return Nombre del amigo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de teléfono del amigo.
     * 
     * @return Teléfono del amigo.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Obtiene el correo electrónico del amigo.
     * 
     * @return Correo electrónico del amigo.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Devuelve una representación en cadena del objeto Amigo.
     * 
     * @return Información del amigo en formato de texto.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nTeléfono: " + telefono + "\nEmail: " + email;
    }
}
