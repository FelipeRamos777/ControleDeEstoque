/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
public class servicos {
    static ArrayList<servicos>Salvar = new ArrayList<servicos>();
    private String cod;
    private String desc;
    private String TProd;
    private int precoun;
    private int Qtdeproduto;
    
    


public servicos(){};

    public static ArrayList<servicos> getSalvar() {
        return Salvar;
    }

    public static void setSalvar(ArrayList<servicos> Salvar) {
        servicos.Salvar = Salvar;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

      public String getdesc() {
        return desc;
    }

    public void setdesc(String desc) {
        this.desc = desc;
    }
    public String getTProd() {
        return TProd;
    }

    public void setTProd(String TProd) {
        this.TProd = TProd;
    }

    public int getPrecoun() {
        return precoun;
    }

    public void setPrecoun(int precoun) {
        this.precoun = precoun;
    }

    public int getQtdeproduto() {
        return Qtdeproduto;
    }

    public void setQtdeproduto(int Qtdeproduto) {
        this.Qtdeproduto = Qtdeproduto;
    }

   







}