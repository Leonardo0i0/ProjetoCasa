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
public class smartTV extends TV{
    int modo,login=123456, senha=987654;
    boolean conectado=false;
    
    void conectar(int l, int s){
        if (status==1){
           if (login == l && senha == s){
              conectado=true;
           }
        }
    };
     void ligar_desligar(){
      super.ligar_desligar();
      if (status == 0){
            conectado=false;
      }else{
            modo=1;
      }
    }

     int trocar_canal(int ncanal){
        if (status==1 && modo ==1){
            return super.trocar_canal(ncanal);
        }
        return -1;
     }
        void aumentarvolume(int volume){
         if (status==1){
             if(volume<=100){
                 this.volume=volume;
             }
         }
        }
}
