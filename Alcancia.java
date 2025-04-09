import java.util.Scanner;

public class Alcancia
{
    public int contMnd100 = 0, contMnd200 = 0, contMnd500 = 0, contMnd1000 = 0, total;
    Scanner teclado = new Scanner (System.in);
    
    public Alcancia(){

    }

    public Alcancia(int contMnd100, int contMnd200, int contMnd500, int contMnd1000, int total){
        this.contMnd100 = contMnd100;
        this.contMnd100 = contMnd200;
        this.contMnd100 = contMnd500;
        this.contMnd100 = contMnd1000;
        this.total = total;
    }

    //Start GetterSetterExtension Source Code

    /**GET Method Propertie contMnd100*/
    public int getContMnd100(){
        return this.contMnd100;
    }//end method getContMnd100

    /**SET Method Propertie contMnd100*/
    public void setContMnd100(int contMnd100){
        this.contMnd100 = contMnd100;
    }//end method setContMnd100

    /**GET Method Propertie contMnd200*/
    public int getContMnd200(){
        return this.contMnd200;
    }//end method getContMnd200

    /**SET Method Propertie contMnd200*/
    public void setContMnd200(int contMnd200){
        this.contMnd200 = contMnd200;
    }//end method setContMnd200

    /**GET Method Propertie contMnd500*/
    public int getContMnd500(){
        return this.contMnd500;
    }//end method getContMnd500

    /**SET Method Propertie contMnd500*/
    public void setContMnd500(int contMnd500){
        this.contMnd500 = contMnd500;
    }//end method setContMnd500

    /**GET Method Propertie contMnd1000*/
    public int getContMnd1000(){
        return this.contMnd1000;
    }//end method getContMnd1000

    /**SET Method Propertie contMnd1000*/
    public void setContMnd1000(int contMnd1000){
        this.contMnd1000 = contMnd1000;
    }//end method setContMnd1000

    /**GET Method Propertie total*/
    public int getTotal(){
        return this.total;
    }//end method getTotal

    /**SET Method Propertie total*/
    public void setTotal(int total){
        this.total = total;
    }//end method setTotal
    
    /**Metodo de acceso a la propiedad teclado*/
    public Scanner getTeclado(){
        return this.teclado;
    }//end method getTeclado

    /**Metodo de modificación a la propiedad teclado*/
    public void setTeclado(Scanner teclado){
        this.teclado = teclado;
    }//end method setTeclado
    
    //End GetterSetterExtension Source Code

}//End class