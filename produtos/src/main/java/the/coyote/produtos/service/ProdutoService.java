package the.coyote.produtos.service;

import java.util.List;

import org.springframework.stereotype.Service;
import the.coyote.produtos.model.dto.ListaSimplesDeProdutosDTO;
import the.coyote.produtos.model.dto.RequestProdutoDTO;
import the.coyote.produtos.model.dto.ResponseSaveProdutoDTO;


@Service
public interface ProdutoService {

    List<ListaSimplesDeProdutosDTO> getAll(Integer pageNumber, Integer pageSize);

    ResponseSaveProdutoDTO saveProduto(RequestProdutoDTO dto);
}
