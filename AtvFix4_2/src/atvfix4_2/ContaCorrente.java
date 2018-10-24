package atvfix4_2;

/**
 *
 * @author ime
 */
public class ContaCorrente {
    private String num;
    private int digV;
    private double saldo;
    
    private static int numContas;

    public ContaCorrente(String num, int digV) {
        this.num = num;
        this.digV = digV;
        this.saldo = 0;
        
        this.numContas++;
    }
    
    public void creditar(double valor){
        this.saldo += valor;
    }
    
    public void debitar(double valor){
        this.saldo -= valor;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getDigV() {
        return digV;
    }

    public void setDigV(int digV) {
        this.digV = digV;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getNumContas() {
        return numContas;
    }

    public static void setNumContas(int numContas) {
        ContaCorrente.numContas = numContas;
    }
    
    
}
