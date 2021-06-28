import javax.swing.JOptionPane;
public class Conta 
{

    public String agencia = "000-20-X";
    public String nroConta = "1234-0002-B";
    public float saldo = 6000;

        public float verificarSaldo()
        {
            return +this.saldo;
        }

        public void realizarDeposito(float valor)
        {      
            if(valor > 0)
            {
                this.saldo += valor;
                JOptionPane.showMessageDialog(null, "R$"+valor, "VALOR ADICIONADO", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ocorreu um erro,\ntente novamente", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        }

        public void realizarSaque(float valor)
        {
            if(valor <= saldo)
            {
                this.saldo -= valor;
                JOptionPane.showMessageDialog(null, "R$"+valor, "VALOR RETIRADO", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ocorreu um erro,\ntente novamente.", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        }    
}
