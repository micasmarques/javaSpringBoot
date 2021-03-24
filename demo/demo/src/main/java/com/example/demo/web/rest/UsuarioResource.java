package com.example.demo.web.rest;

import com.example.demo.service.UsuarioService;
import com.example.demo.service.dto.UsuarioDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
@Slf4j
public class UsuarioResource {
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody UsuarioDTO usuarioDTO){
        log.debug("Requisição REST para salvar um usuario: {}", usuarioDTO);
        usuarioService.criar(usuarioDTO);
        return ResponseEntity.ok().build();
    }
}