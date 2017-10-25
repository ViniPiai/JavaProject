package entidade;

public class CavernaDeMineracao {

    private Integer stone = 0;
    private Integer clay = 0;
    private Integer copperOre = 0;
    private Integer tinOre = 0;
    private Integer ironOre = 0;
    private Integer goldOre = 0;
    private Integer diamond = 0;

    public Integer getStone() {
        return stone;
    }

    public void setStone(Integer stone) {
        this.stone = stone;
    }

    public void aumentarStone (Integer stone) {
        this.stone += stone;
    }

    public Integer getClay() {
        return clay;
    }

    public void setClay(Integer clay) {
        this.clay = clay;
    }

    public void aumentarClay(Integer clay) {
        this.clay += clay;
    }

    public Integer getCopperOre() {
        return copperOre;
    }

    public void setCopperOre(Integer copperOre) {
        this.copperOre = copperOre;
    }

    public void aumentarCopperOre(Integer copperOre) {
        this.copperOre += copperOre;
    }

    public Integer getTinOre() {
        return tinOre;
    }

    public void setTinOre(Integer tinOre) {
        this.tinOre = tinOre;
    }

    public void aumentarTinOre(Integer tinOre) {
        this.tinOre += tinOre;
    }

    public Integer getIronOre() {
        return ironOre;
    }

    public void setIronOre(Integer ironOre) {
        this.ironOre = ironOre;
    }

    public void aumentarIronOre(Integer ironOre) {
        this.ironOre += ironOre;
    }

    public Integer getGoldOre() {
        return goldOre;
    }

    public void setGoldOre(Integer goldOre) {
        this.goldOre = goldOre;
    }

    public void aumentarGoldOre(Integer goldOre) {
        this.goldOre += goldOre;
    }

    public Integer getDiamond() {
        return diamond;
    }

    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    public void aumentarDiamond(Integer diamond) {
        this.diamond += diamond;
    }
    
    
}
