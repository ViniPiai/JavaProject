
package entidade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Status {

    private Integer HP=100;
    private Integer comida=100;
    private Integer higiene=100;
    private Integer disposicao=100;
    private Integer felicidade=100;
    private String nome;
    public Timer t;
    private Float dinheiro = (float)1500;
    private Integer stamina =100;

    public Integer getHP() {
        return HP;
    }

    public void aumentarHP(Integer HP) {
        this.HP += HP;
        if(this.HP>100){
            this.HP=100;
        }
    }
    
    public void diminuirHP(Integer HP) {
        this.HP -= HP;
        if(this.HP<0){
            this.HP = 0;
        }
    }
    
    public Integer getComida() {
        return comida;
    }

    public void aumentarComida(Integer comida) {
        this.comida += comida;
        if(this.comida>100){
            this.comida=100;
        }
    }
    
    public void diminuirComida(Integer comida) {
        this.comida -= comida;
        if(this.comida<0){
            this.comida =0;
        }
    }
        
    public Integer getHigiene() {
        return higiene;
    }

    public void aumentarHigiene(Integer higiene) {
        this.higiene += higiene;
        if(this.higiene>100){
            this.higiene=100;
        }
    }
    
    public void diminuirHigiene(Integer higiene) {
        this.higiene -= higiene;
        if(this.higiene<0){
            this.higiene=0;
        }
    }
    
    public Integer getDisposicao() {
        return disposicao;
    }

    public void aumentarDisposicao(Integer disposicao) {
        this.disposicao += disposicao;
        if(this.disposicao>100){
            this.disposicao=100;
        }
    }
    
    public void diminuirDisposicao(Integer disposicao) {
        this.disposicao -= disposicao;
        if(this.disposicao<0){
            this.disposicao=0;
        }
    }

    public Integer getFelicidade() {
        return felicidade;
    }

    public void aumentarFelicidade(Integer felicidade) {
        this.felicidade += felicidade;
        if(this.felicidade>100){
            this.felicidade=100;
        }
    }

    public void diminuirFelicidade(Integer felicidade) {
        this.felicidade -= felicidade;
        if(this.felicidade<0){
            this.felicidade=0;
        }
    }
    
    @Override
    public String toString() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getDinheiro() {
        return dinheiro;
    }

    public void aumentarDinheiro(Float dinheiro) {
        this.dinheiro += dinheiro;
    }
    
    public void diminuirDinheiro(Float dinheiro) {
        this.dinheiro -= dinheiro;
    }
    
    public Integer getStamina() {
        return stamina;
    }

    public void aumentarStamina(Integer stamina) {
        this.stamina += stamina;
        if(this.stamina >100){
            this.stamina = 100;
        }
    }
    
    public void diminuirStamina(Integer stamina) {
        this.stamina -= stamina;
        if(this.stamina<0){
            this.stamina=0;
        }
    }
    public void verificarStatus(){
        if(getHP()<=0){
            JOptionPane.showMessageDialog(null, "Você deixou o "+toString()+" morrer."
                    + "\nO seu jogo chegou ao fim. \nObrigado por jogar!");
            System.exit(0);
        }
    }
    
    
}
