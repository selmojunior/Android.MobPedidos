package mobpedidos.cursoandroid.junio.mobpedidos.model;

public class Produto {
    private int id;
    private String codigoBarras;
    private String descricao;
    private String unidade;
    private String categoria;
    private String fornecedor;
    private String fabricante;
    private Double estoque;
    private Double estoqueMin;
    private Double estoqueMax;
    private String observacao;

    public int getId() {
        return id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Double getEstoque() {
        return estoque;
    }

    public Double getEstoqueMin() {
        return estoqueMin;
    }

    public Double getEstoqueMax() {
        return estoqueMax;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }

    public void setEstoqueMin(Double estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public void setEstoqueMax(Double estoqueMax) {
        this.estoqueMax = estoqueMax;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
