public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 36.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }else{
            System.out.println("saldo insuficiente, valor disponível" + 
            "para saque...: R$ " + saldo);
        }
        
        
        
    }
    
}
