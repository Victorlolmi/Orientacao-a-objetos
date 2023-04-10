
package classes;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class ContaAPagar {
    private int id;
    private String codBarras;
    private double valor;

    public ContaAPagar() {
        this.id = -1;
        this.codBarras = "";
        this.valor = 0.0;
    }

    public ContaAPagar(int id, String codBarras, double valor) {
        this.id = id;
        this.codBarras = codBarras;
        this.valor = valor;
    }
    
    
    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("------ Preenchendo os dados da Conta -----");

        System.out.print("Informe o id:");
        this.setId(leitor.nextInt());

        System.out.print("Informe o codBarras:");
        this.setCodBarras(leitor.next());

        System.out.print("Informe o valor da conta:");
        this.setValor(leitor.nextDouble());
                
    }
    
    public void copiar(ContaAPagar outra){
        this.id = outra.getId();
        this.codBarras = outra.getCodBarras();
        this.valor = outra.getValor();    
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Id:" + this.getId());
        System.out.println("CodBarras:" + this.getCodBarras());
        System.out.println("Valor:" + this.getValor());
        System.out.println("------------------------");
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codBarras
     */
    public String getCodBarras() {
        return codBarras;
    }

    /**
     * @param codBarras the codBarras to set
     */
    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
