package the.coyote.comuns.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import the.coyote.comuns.model.entity.ProdutoEntity;

@Repository
public interface ProdutoRepository extends PagingAndSortingRepository<ProdutoEntity, Long> {

}
