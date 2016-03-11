/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;

/**
 *
 * @author Nuria
 */
public class buzon {
    ArrayList<correo> buzonCorreo = new ArrayList();
    
public int numeroDeCorreos(){
    return buzonCorreo.size();
   

}

public void engade(correo c){
      buzonCorreo.add(c);
}

public boolean porLer(){
    int a=0;
    for (int i = 0; i <buzonCorreo.size(); i++){
        if (buzonCorreo.get(i).isLeido()==false){
            a=a+1;
        }
    }System.out.println("Hay " +a+ " correos por leer");
    return true;
}

public String amosaPrimerNoLeido(){
   for(int i =0; i <buzonCorreo.size(); i++){
      if(buzonCorreo.get(i).isLeido()== false){
            buzonCorreo.set(i, new correo(buzonCorreo.get(i).contido,true));
            return (buzonCorreo.get(i).contido);
               
       }
    }return"Todolos mensaxes estan leidos";
}
public String amosa (int k){
try{
    if(buzonCorreo.get(k).isLeido()== false){
        buzonCorreo.set(k, new correo(buzonCorreo.get(k).contido,true));
        return (buzonCorreo.get(k).contido);         
  }else {
        return (buzonCorreo.get(k).contido); 
    }
}catch(Exception error1){
    return "El correo que has escogido no existe";
}

}
public void elimina(int k ) throws Exception {
    buzonCorreo.remove(k);
}
}
