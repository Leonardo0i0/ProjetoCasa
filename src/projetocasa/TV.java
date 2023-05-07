/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocasa;

/**
 *
 * @author Aluno
 */
public class TV {
    int status=0, volume=0, canal=1;
    
    void ligar_desligar(){

      if (status == 0){
            status = 1;
      }else{
            status = 0;
      }
    }

    void aumentar_volume(){
             if(status==1){
                     if(volume<100){
                             volume++;
                     }
             }
     }

     void diminuir_volume(){
             if(status==1){
                     if(volume>0){
                             volume--;
                     }
             }
     };

     int trocar_canal(int ncanal){
        if(status==1){
            if(ncanal==1 || ncanal==3 || ncanal==5 || ncanal==7 || ncanal==11){
                    canal=ncanal;
                    return ncanal;
            }
        }
        return -1;
     }
}
