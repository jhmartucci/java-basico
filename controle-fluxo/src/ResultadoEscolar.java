public class ResultadoEscolar {
    public static void main(String[] args) {
        
       /* int nota = 5;

        if(nota >= 7){
            System.out.println("Aprovado");
        }else if(nota >= 5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }*/

        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : 
        nota >=5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
    
}
