package atvfix5;

/**
 *
 * @author cristian.araujo
 */
public class AtvFix5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LivroDidatico ld1 = new LivroDidatico("Livro de Hist", "Autor", "Editora", "Resumo hahaha", 546.00, "Historia");
        Revista r1 = new Revista("Revista Olhe", "Editora C",20.05,"5 meses");
        Revista r2 = new Revista("Revista Face", "Editora C",20.05,"5 meses");
        
        System.out.println(r1.verificarMesmaEditora(r2));
        
        System.out.println(ld1.consultarResumo());
        
        System.out.println("---------------------");
        
        System.out.println(ld1.toString());
    }

    
}
