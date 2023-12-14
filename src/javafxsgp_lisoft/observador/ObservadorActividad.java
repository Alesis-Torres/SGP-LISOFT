/*
*Autor: Mongeote Tlachy Daniel
*Fecha de creación: 20/11/2023
*Fecha de modificación: 20/11/2023
*Descripción: Interfaz para comunicar cuando se ha creado una nueva actividad.
*/
package javafxsgp_lisoft.observador;

public interface ObservadorActividad {
    public void operacionExitosa(String tipoOperacion, String nombre);
}
