package com.indtexbr.consultoriasassessorias.controller;

import com.indtexbr.consultoriasassessorias.domain.dto.ContractDTO;
import com.indtexbr.consultoriasassessorias.domain.dto.ResultPage;
import com.indtexbr.consultoriasassessorias.exception.FuntimeException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.format.annotation.DateTimeFormat;
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

import java.util.Date;

/**
 * @author lgdamy@raiadrogasil.com on 14/03/2021
 */
@RestController
@Api(tags = "Contrato")
@RequestMapping("/contracts/v1")
public class ContratoController {

    private static final String NAO_ENCONTRADO = "Nenhum contrato localizado";

    @ApiOperation("Gera uma contrato novo")
    @PostMapping
    public ResponseEntity<Long> gerarNova(@RequestBody ContractDTO contract) {
        return ResponseEntity.ok(10L);
    }

    @ApiOperation("Consulta uma lista de contratos pela data de cria\u00e7\u00e3o ou data de expira\u00e7\u00e3o, a resposta \u00e9 paginada")
    @GetMapping
    public ResultPage<ContractDTO> buscarContratos(@RequestParam(value = "from", required = false) @DateTimeFormat(pattern = "ddMMyyyy") Date from,
                                                   @RequestParam(value = "to", required = false) @DateTimeFormat(pattern = "ddMMyyyy") Date to,
                                                   @RequestParam(value = "page",defaultValue = "0") int page,
                                                   @RequestParam(value = "size", defaultValue = "10") int size,
                                                   @RequestParam(value = "providerId", required = false) String providerId){
        return new ResultPage<>(size);
    }

    @ApiOperation(value = "Consulta os detalhes de um contrato pelo identificador")
    @GetMapping("{id}")
    public ResponseEntity<Long> buscaContrato(@ApiParam(example = "10") @PathVariable("id") Long id) {
        throw new FuntimeException(NAO_ENCONTRADO, HttpStatus.NOT_FOUND);
    }

    @ApiOperation(value = "Remove um contrato pelo identificador")
    @DeleteMapping("{id}")
    public ResponseEntity removeContrato(@ApiParam(example = "10") @PathVariable("id") Long id) {
        throw new FuntimeException(NAO_ENCONTRADO, HttpStatus.NOT_FOUND);
    }

    @ApiOperation(value = "Altera um contrato com o identificador")
    @PatchMapping("{id}")
    public ResponseEntity atualizaContrato( @ApiParam(example = "10") @PathVariable("id") Long id, @RequestBody ContractDTO contract) {
        throw new FuntimeException(NAO_ENCONTRADO, HttpStatus.NOT_FOUND);
    }
}
