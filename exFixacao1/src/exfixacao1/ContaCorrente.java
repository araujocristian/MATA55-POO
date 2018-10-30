package exfixacao1;

/**
 *
 * @author cristian
 */
public class ContaCorrente {
    private int numConta, digV1, digV2, numAgencia, grau;
    private double saldo, limite, deposito;
    private boolean ativa;
    private String errorMessage = "Conta inativa, a(s) condição(ões) a seguir não foi(ram) obedecida(s): ";

    public ContaCorrente(int numConta, int numAgencia, int grau, double limite, double deposito) {
        switch(grau){
        
            case 0:
                if(deposito <= 100.00) {
                    this.ativa = false;
                    errorMessage+="Deposito menor inicial menor que o mínimo indicado.";
                } else if(limite > 0){
                    this.limite = 0;
                    errorMessage+="Conta basica, limite não pode ser maior que zero.";
                } else {
                    this.ativa = true;
                    this.limite = 0;
                };

                break;
                
            case 1:
                if(deposito <= 200.00) {
                    this.ativa = false;
                    errorMessage+="Deposito menor inicial menor que o mínimo indicado.";
                } else if(limite <= 0){
                    this.limite = 0;
                    errorMessage+="Limite menor que zero.";
                } else {
                    this.ativa = true;
                    this.limite = limite;
                };
                
                break;
            
            case 2:
                if(deposito <= 500.00) {
                    this.ativa = false;
                    errorMessage+="Deposito menor inicial menor que o mínimo indicado.";
                } else if(limite <= 0){
                    this.limite = 0;
                    errorMessage+="Limite menor que zero.";
                } else {
                    this.ativa = true;
                    this.limite = limite;
                };
                
                break;
                
            case 3:
                if(deposito <= 1000.00) {
                    this.ativa = false;
                    errorMessage+="Deposito menor inicial menor que o mínimo indicado.";
                } else if(limite <= 0){
                    this.limite = 0;
                    errorMessage+="Limite menor que zero.";
                } else {
                    this.ativa = true;
                    this.limite = limite;
                };

                break;
                
            default:
                errorMessage+="Grau de conta não existente.";
                this.ativa = false;
                break;
        }
        
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.grau = grau;
        this.deposito = deposito;
        
        this.saldo = deposito;
        
        if(this.ativa){
            this.digV1 = this.calc1DigV();
            this.digV2 = this.calc2DigV();
        } else {
            System.out.println(errorMessage);
        }
    }

    
    private int calc1DigV() {
        int resto1 = numConta%1000;
	int resto2 = numConta%100;
	int resto3 = numConta%10;

	int digito1 = numConta/1000;
	int digito2 = resto1/100;
	int digito3 = resto2/10;
	int digito4 = resto3;
                
        int soma = digito1*1 + digito2*2 + digito3*3 + digito4*4;
        
        int tamanhoNum = Integer.toString(soma).length();
        
        while(tamanhoNum != 1){
            soma -= 9;
            tamanhoNum = Integer.toString(soma).length();
        }
        
        return soma;
    }
    
    private int calc2DigV() {
        int resto1 = numConta%1000;
	int resto2 = numConta%100;
	int resto3 = numConta%10;

	int digito1 = numConta/1000;
	int digito2 = resto1/100;
	int digito3 = resto2/10;
	int digito4 = resto3;
        
        int i = 0;
        
        int soma = digito1*4 + digito2*3 + digito3*2 + digito4*1;
        
        int tamanhoNum = Integer.toString(soma).length();
        
        for(;tamanhoNum != 1;){
            soma -= 9;
            tamanhoNum = Integer.toString(soma).length();
        }
        
        return soma;
    }
    
    public boolean lancOp(double valorOp, char tipoOp){
        if (tipoOp != 'D' || tipoOp != 'C') {
            System.out.println("Operação não reconhecida.");
            return false;
        }
        
        if (tipoOp == 'D'){
            if(Math.abs(saldo - deposito) > limite) {
                System.out.println("Usuário não tem limite.");
                return false;
            } else {
                this.saldo -= valorOp;
                return true;
            }
        }
        
        this.saldo += valorOp;
        return true;
    };

    public void setLimite(double novoLimite) {
        if(novoLimite > 0){
            if(grau == 0) {
                System.out.println("Cliente comum, Limite R$ 0.0.");
            } else {
                if(saldo < 0) {
                    if(novoLimite > Math.abs(saldo)){
                        this.limite = novoLimite;
                    } else {
                        System.out.println("Limite menor que o saldo devedor.");
                    }
                }
            }
        } else {
            System.out.println("Novo limite é negativo ou igual a zero.");
        }
    }
    
    void setGrau(int novoGrau) {
        if(novoGrau == 0 || novoGrau == 1 || novoGrau == 2 || novoGrau == 3) {
            if(novoGrau == 0) {
                if(saldo >= 0 ) {
                    this.grau = novoGrau;
                    this.limite = 0.0;
                } else {
                    System.out.println("Cliente com saldo negativo.");
                }
            }
        } else {
            System.out.println("Grau incorreto.");
        }
    }
    
    public int getNumConta() {
        return numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public int getDigV1() {
        return digV1;
    }

    public int getDigV2() {
        return digV2;
    }

    public int getGrau() {
        return grau;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public boolean isAtiva() {
        return ativa;
    }
}
