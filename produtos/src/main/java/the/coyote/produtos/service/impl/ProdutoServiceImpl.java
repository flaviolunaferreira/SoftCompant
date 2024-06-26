package the.coyote.produtos.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import the.coyote.comuns.model.dto.Produtos.ListaSimplesDeProdutosDTO;
import the.coyote.comuns.repository.ProdutoRepository;
import the.coyote.produtos.service.ProdutoService;


@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<ListaSimplesDeProdutosDTO> getAll(Integer pageNumber, Integer pageSize) {
        if (pageSize > 50) pageSize = 50;

        PageRequest pagina = PageRequest.of(pageNumber, pageSize);

        return produtoRepository.findAll(pagina).stream().map(produto -> new ListaSimplesDeProdutosDTO(produto)).collect(Collectors.toList());
    }

}
