package com.indtexbr.consultoriasassessorias.controller;

import com.indtexbr.consultoriasassessorias.domain.dto.PartnerDTO;
import com.indtexbr.consultoriasassessorias.domain.dto.ResultPage;
import com.indtexbr.consultoriasassessorias.exception.FuntimeException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgdamy@raiadrogasil.com on 14/03/2021
 */
@RestController
@Api(tags = "Parceiro")
@RequestMapping("/partners/v1")
public class ParceiroController {

    private static final String NAO_ENCONTRADO = "Nenhuma consultoria ou assessoria localizada";

    @ApiOperation("Gera uma consultoria ou assessoria nova")
    @PostMapping
    public ResponseEntity<String> gerar(@RequestBody PartnerDTO partner) {
        return ResponseEntity.ok("SUCESSO");
    }

    @ApiOperation("Consulta uma lista de consultorias ou assessorias pelos par\u00e2metros, a resposta \u00e9 paginada")
    @GetMapping
    public ResultPage<PartnerDTO> buscar(PartnerDTO filter,
                                                  @RequestParam(value = "page",defaultValue = "0") int page,
                                                  @RequestParam(value = "size", defaultValue = "10") int size){
        return new ResultPage<>(size);
    }

    @ApiOperation(value = "Consulta os detalhes de uma consultoria ou assessoria pelo identificador")
    @GetMapping("{id}")
    public ResponseEntity<Long> buscar(@ApiParam(example = "charlesfix") @PathVariable("id") String id) {
        throw new FuntimeException(NAO_ENCONTRADO, HttpStatus.NOT_FOUND);
    }

    @ApiOperation(value = "Remove uma consultoria ou assessoria pelo identificador")
    @DeleteMapping("{id}")
    public ResponseEntity remover(@ApiParam(example = "charlesfix")  @PathVariable("id") String id) {
        throw new FuntimeException(NAO_ENCONTRADO, HttpStatus.NOT_FOUND);
    }

    @ApiOperation(value = "Altera uma consultoria ou assessoria com o identificador")
    @PatchMapping("{id}")
    public ResponseEntity atualizar(@ApiParam(example = "charlesfix")  @PathVariable("id") String id, @RequestBody PartnerDTO contract) {
        throw new FuntimeException(NAO_ENCONTRADO, HttpStatus.NOT_FOUND);
    }
}
