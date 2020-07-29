public class Fecha
{
    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int dia,int mes,int anyo){
        this.dia = dia;
        this.mes= mes;
        this.anyo=anyo;
    }

    public int dia(){
        return dia;
    }

    public int mes(){
        return mes;
    }

    public int anyo(){
        return anyo;
    }

    public int comparar(Fecha otro){
        int comp;
        if(dia() == otro.dia() && mes() == otro.mes() && anyo() == otro.anyo()){
            comp = 0;
        }
        else{
            if(anyo() < otro.anyo()){
                comp = 1;
            }
            else{
                if(mes() < otro.mes()){
                    comp = 1;
                }
                else{
                    if(dia() < otro.dia())
                        comp = 1;
                    else
                        comp = -1;
                }
            }
        }
        return comp;
    }
}