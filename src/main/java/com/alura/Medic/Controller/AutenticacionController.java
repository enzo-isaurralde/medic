package com.alura.Medic.Controller;

import com.alura.Medic.domain.usuario.DTOAutenticacion;
import com.alura.Medic.domain.usuario.Usuario;
import com.alura.Medic.infra.security.DTOTokenJWT;
import com.alura.Medic.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity iniciarSesion(@RequestBody @Valid DTOAutenticacion datos){
        var autenticationToken = new UsernamePasswordAuthenticationToken(datos.login() , datos.contrasena());
        var autenticacion = manager.authenticate(autenticationToken);

        var tokenJWT = tokenService.generarToken((Usuario) autenticacion.getPrincipal());

        return ResponseEntity.ok(new DTOTokenJWT(tokenJWT));

    }
}
