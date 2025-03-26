/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.RepositorioDeAmigos.models;

import autonoma.RepositorioDeAmigos.exceptions.AmigoNoEncontradoException;
import autonoma.RepositorioDeAmigos.exceptions.AmigoYaRegistradoException;
import autonoma.RepositorioDeAmigos.exceptions.DatoInvalidoException;
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
  *
*/
public class AgendaDeAmigo {

    // Lista para almacenar los amigos
    private List<Amigo> amigos;

    /**
     * Constructor de la clase AgendaDeAmigo
     */
    public AgendaDeAmigo() {
        this.amigos = new ArrayList<>();
    }

    /**
     * Agrega un amigo a la agenda despues de validar los datos y verificar que no exista
     * 
     * @param amigo Objeto Amigo a agregar
     * @throws DatoInvalidoException Si los datos del amigo son invalidos
     * @throws AmigoYaRegistradoException Si el amigo ya esta registrado
     */
    public void agregarAmigo(Amigo amigo) throws DatoInvalidoException, AmigoYaRegistradoException {
        validarDatos(amigo);

        if (existeAmigo(amigo.getEmail())) {
            throw new AmigoYaRegistradoException();
        }

        amigos.add(amigo);
    }

    /**
     * Busca un amigo en la agenda por su correo electronico
     * 
     * @param email Correo electronico del amigo a buscar
     * @return Objeto Amigo encontrado
     * @throws AmigoNoEncontradoException Si el amigo no se encuentra en la agenda
     */
    public Amigo buscarAmigo(String email) throws AmigoNoEncontradoException {
        for (Amigo amigo : amigos) {
            if (amigo.getEmail().equals(email)) {
                return amigo;
            }
        }
        throw new AmigoNoEncontradoException();
    }

    /**
     * Muestra informacion sobre la aplicacion
     */
    public void mostrarAcercaDe() {
        System.out.println("Aplicacion: Agenda de Amigos");
        System.out.println("Taller de programacion - Universidad UAM");
        System.out.println("Desarrolladores: Juan Esteban Hernandez Martinez");
    }

    /**
     * Valida que los datos del amigo sean correctos antes de agregarlo a la agenda
     * 
     * @param amigo Objeto Amigo a validar
     * @throws DatoInvalidoException Si algun dato no es valido
     */
    private void validarDatos(Amigo amigo) throws DatoInvalidoException {
        if (amigo.getNombre() == null || amigo.getNombre().isEmpty()) {
            throw new DatoInvalidoException();
        }

        if (amigo.getEmail() == null || !amigo.getEmail().contains("@")) {
            throw new DatoInvalidoException();
        }

        if (amigo.getTelefono() == null || 
            !(amigo.getTelefono().startsWith("606") || amigo.getTelefono().startsWith("30"))) {
            throw new DatoInvalidoException();
        }
    }

    /**
     * Verifica si un amigo ya esta registrado en la agenda por su correo
     * 
     * @param email Correo electronico del amigo
     * @return true si el amigo existe, false en caso contrario
     */
    private boolean existeAmigo(String email) {
        for (Amigo amigo : amigos) {
            if (amigo.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}


