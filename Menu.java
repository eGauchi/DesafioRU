package classe;

public class Menu {
    String dia;
    String turno;
    Refeicao refeicao;

    Menu(String dia, String turno, Refeicao refeicao) {
        this.dia = dia;
        this.turno = turno;
        this.refeicao = refeicao;
    }

    public String toString() {
        return "Dia: " + dia + ", Turno: " + turno + ", Refeição: [" + refeicao.toString() + "]";
    }
}
