package application;

public class Teste {
public static void IMC(float a,float p){
    float ind;
    ind=p/(a*a);
    
}
public static int menu(){
    int r;
    r=Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null,"1-IMC\n2-Calculadora FLEX\n3-Areas de trinaglos\n4-Connversao de medidas\n5-Conversao de unidade dee terreno:"));
    return r;
}
public static void main(String[] args) {
        int op;
        float r,alt,ps;
        op=menu();
    switch (op) {
        case 1:
            alt=Float.parseFloat(javax.swing.JOptionPane.showInputDialog(null,"Altura:"));
            ps=Float.parseFloat(javax.swing.JOptionPane.showInputDialog(null,"Peso:"));
            IMC(alt,ps);
            break;
        case 2:
            javax.swing.JOptionPane.showMessageDialog(null,"2");
            break;
        case 3:
            javax.swing.JOptionPane.showMessageDialog(null,"3");
            break;
        case 4:
            javax.swing.JOptionPane.showMessageDialog(null,"4");
            break;
        case 5:
            javax.swing.JOptionPane.showMessageDialog(null,"5");
            break;
        default:
            break;
    }
    }
    
}
