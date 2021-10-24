package br.com.alura.bootcamp.livraria.controller;

import br.com.alura.bootcamp.livraria.dto.LivrosPorAutorDto;
import br.com.alura.bootcamp.livraria.service.RelatorioService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/relatorios")
@Api(tags = "Relatório")
public class RelatorioController {

    @Autowired
    private RelatorioService service;

    @GetMapping("/livraria")
    public List<LivrosPorAutorDto> relatorioLivrosPorAutor() {

        return service.relatorioLivrosPorAutor();
    }

}
