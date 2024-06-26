package the.coyote.produtos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import the.coyote.comuns.model.dto.Produtos.ListaSimplesDeProdutosDTO;
import the.coyote.produtos.service.ProdutoService;


@RestController
@RequestMapping("api/v1/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;
   
    @GetMapping("/")
    @Operation(summary = "Lista reduzida dos produtos cadastrados.")
    public ResponseEntity<List<ListaSimplesDeProdutosDTO>> get(@RequestParam Integer pageNumber, @RequestParam Integer pageSize ) {
        try {    
            return ResponseEntity.ok().body(produtoService.getAll(pageNumber, pageSize));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
