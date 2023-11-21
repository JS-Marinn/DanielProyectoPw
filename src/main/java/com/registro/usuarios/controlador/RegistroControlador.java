package com.registro.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.servicio.UsuarioServicio;

/**
 * Controlador para gestionar las solicitudes relacionadas con el registro de usuarios.
 */
@Controller
public class RegistroControlador {

    @Autowired
    private UsuarioServicio servicio;

    /**
     * Maneja la solicitud GET para la ruta "/home".
     *
     * @return La vista correspondiente a la página principal.
     */
    @GetMapping("/home")
    public String home() {
        return "lol/principal";
    }

    /**
     * Maneja la solicitud GET para la ruta "/service".
     *
     * @return La vista correspondiente a la página de servicios.
     */
    @GetMapping("/service")
    public String servicios() {
        return "lol/service";
    }

    /**
     * Maneja la solicitud GET para la ruta "/clinica".
     *
     * @return La vista correspondiente a la página de la clínica.
     */
    @GetMapping("/clinica")
    public String clinica() {
        return "lol/clinic";
    }

    /**
     * Maneja la solicitud GET para la ruta "/".
     *
     * @param modelo El modelo que se utilizará en la vista.
     * @return La vista correspondiente a la página de inicio.
     */
    @GetMapping("/")
    public String verPaginaDeInicio(Model modelo) {
        modelo.addAttribute("usuarios", servicio.listarUsuarios());
        return "index";
    }

    /**
     * Maneja la solicitud GET para la ruta "/login".
     *
     * @return La vista correspondiente a la página de inicio de sesión.
     */
    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }
}
