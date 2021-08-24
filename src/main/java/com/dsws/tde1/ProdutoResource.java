package com.dsws.tde1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produto consultar(@PathVariable("id") int id) {

        return produtoRepository.getById(id);
    }

    @PostMapping
    public Produto incluir(@RequestBody Produto p) {
        return produtoRepository.save(p);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable("id") int id, @RequestBody Produto p) {
        Produto produto = produtoRepository.getById(id);

        produto.setNome(p.getNome());
        produto.setAnoFabricacao(p.getAnoFabricacao());
        produto.setEan(p.getEan());
        produtoRepository.save(produto);

        return produto;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable("id") int id) {
        produtoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
