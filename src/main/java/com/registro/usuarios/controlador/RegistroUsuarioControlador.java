package com.registro.usuarios.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.usuarios.controlador.dto.UsuarioRegistroDTO;
import com.registro.usuarios.servicio.UsuarioServicio;

/**
 * Controlador para gestionar las solicitudes relacionadas con el registro de usuarios.
 */
@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {

    private UsuarioServicio usuarioServicio;

    /**
     * Constructor que inyecta la dependencia del servicio de usuario.
     *
     * @param usuarioServicio El servicio de usuario a inyectar.
     */
    public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    /**
     * Método que retorna un nuevo objeto UsuarioRegistroDTO para ser utilizado en el formulario de registro.
     *
     * @return Un nuevo objeto UsuarioRegistroDTO.
     */
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
        return new UsuarioRegistroDTO();
    }

    /**
     * Maneja la solicitud GET para la ruta "/registro", mostrando el formulario de registro.
     *
     * @return La vista correspondiente al formulario de registro.
     */
    @GetMapping
    public String mostrarFormularioDeRegistro() {
        return "registro";
    }

    /**
     * Maneja la solicitud POST para la ruta "/registro", registrando una nueva cuenta de usuario.
     *
     * @param registroDTO El objeto DTO que contiene la información del usuario a registrar.
     * @return Redirige a la página de registro con un parámetro de éxito.
     */
    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
        usuarioServicio.guardar(registroDTO);
        return "redirect:/registro?exito";
    }
}
