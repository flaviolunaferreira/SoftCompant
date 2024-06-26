package the.coyote.comuns.model.enumeration;

public enum UnidadeMedida {

        // Peso
        QUILOGRAMA("Quilograma", "kg"),
        GRAMA("Grama", "g"),
        MILIGRAMA("Miligrama", "mg"),
        TONELADA("Tonelada", "t"),
    
        // Volume
        LITRO("Litro", "L"),
        MILILITRO("Mililitro", "mL"),
        CENTILITRO("Centilitro", "cL"),
        GALAO("Galão", "gal"),
    
        // Comprimento
        METRO("Metro", "m"),
        CENTIMETRO("Centímetro", "cm"),
        MILIMETRO("Milímetro", "mm"),

    
        // Quantidade
        UNIDADE("Unidade", "un"),
        DUZIA("Dúzia", "dz"),
        CENTENA("Centena", "ct"),
        MILHAR("Milhar", "mil");
    
        private final String nome;
        private final String simbolo;
    
        UnidadeMedida(String nome, String simbolo) {
            this.nome = nome;
            this.simbolo = simbolo;
        }
    
        public String getNome() {
            return nome;
        }
    
        public String getSimbolo() {
            return simbolo;
        }

}
