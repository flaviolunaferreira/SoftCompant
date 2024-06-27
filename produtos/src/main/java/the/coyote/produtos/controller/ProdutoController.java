package the.coyote.produtos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import the.coyote.produtos.model.dto.ListaSimplesDeProdutosDTO;
import the.coyote.produtos.model.dto.RequestProdutoDTO;
import the.coyote.produtos.model.dto.ResponseSaveProdutoDTO;
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

    
    @PostMapping("/")
    @Operation(summary = "Cadastrar um novo produto.")
    public ResponseEntity<ResponseSaveProdutoDTO> create(@RequestBody RequestProdutoDTO dto) {
        System.out.println("Dados de entrada" + dto);
        return ResponseEntity.ok().body(produtoService.saveProduto(dto));
    }

}
