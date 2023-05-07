/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocasa;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ProjetoCasa {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao, x=0;

        TV objtv = new TV();
        smartTV objSmart = new smartTV();
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite 1 para TV e 2 Para SmartTV 3-Sair.");
            opcao = teclado.nextInt();
            if (opcao==1){
                objtv = new TV();
            }else {
                objSmart = new smartTV();
            }

            if (opcao == 1) {
                if (objtv.status == 0) {
                    System.out.println("A Televisão esta Desligada.");
                } else {
                    System.out.println("A televisão esta Ligada.");
                }
                if (objtv.status==1){
                    System.out.println("O Canal " + objtv.canal);
                    System.out.println("O Volume " + objtv.volume);

                }

                System.out.println("1-Ligar/Desligar.");
                if(objtv.status==1){
                    System.out.println("2-Trocar Canal.");
                    System.out.println("3-Almentar Volume.");
                    System.out.println("4-Diminuir Volume.");
                    System.out.println("5 Escolher outra tv");
                }
                opcao = teclado.nextInt();
                switch (opcao) {
                    case 1:
                        objtv.ligar_desligar();
                        break;
                    case 2:
                        int canal;
                        System.out.println("Qual canao 1,3,5,7,11.");
                        canal = teclado.nextInt();
                        if (canal == 1 || canal == 3 || canal == 5 || canal == 7 || canal == 11) {
                            objtv.trocar_canal(canal);
                        }
                        break;
                    case 3:
                        objtv.aumentar_volume();
                        break;
                    case 4:
                        objtv.diminuir_volume();
                    case 5:
                        break;
                    default:
                        System.out.println("Opção invalida");
                }
            /*if (opcao==1){
                objtv.ligar_desligar();
            } else if (opcao==2) {
                int canal;
                System.out.println("Qual canao 1,3,5,7,11.");
                canal = teclado.nextInt();
                if (canal==1 || canal==3 || canal==5 || canal==7 || canal==11){
                objtv.trocar_canal(canal);
                }else {
                    System.out.println("Sinal fraco ou inexistente");
                }
            } else if (opcao==3) {
                objtv.aumentar_volume();
            } else if (opcao==4) {
                objtv.diminuir_volume();
            }*/
            }else if (opcao==2){
                do {
                if (objSmart.status==0){
                    System.out.println("A televisão esta desligada.");
                }else {
                    System.out.println("A televisão esta ligada.");
                }
                if (objSmart.status==1){
                    System.out.println("O Canal " + objtv.canal);
                    System.out.println("O Volume " + objtv.volume);
                    System.out.println("O volume  "+objSmart.volume);
                    if (objSmart.conectado==false){
                        System.out.println("Esta desconectada.");
                    }else {
                        System.out.println("Esta conectada.");
                    }
                }
                System.out.println("1-Ligar/Desligar.");
                if(objtv.status==1){
                    System.out.println("2-Trocar Canal.");
                    System.out.println("3-Almentar Volume.");
                    System.out.println("4-Diminuir Volume.");
                    System.out.println("5-Conectar");
                    System.out.println("6-Escolher o volume.");
                    System.out.println("7 Escolher outra tv");
                }
                opcao = teclado.nextInt();
                switch (opcao) {
                    case 1:
                        objSmart.ligar_desligar();
                        break;
                    case 2:
                        int canal;
                        System.out.println("Qual canao 1,3,5,7,11.");
                        canal = teclado.nextInt();
                        if (canal == 1 || canal == 3 || canal == 5 || canal == 7 || canal == 11) {
                            objSmart.trocar_canal(canal);
                        }
                        break;
                    case 3:
                        objSmart.aumentar_volume();
                        break;
                    case 4:
                        objSmart.diminuir_volume();
                    case 5:
                        int login, senha;
                        do {
                            System.out.println("Digite seu login de usuario.");
                            login = teclado.nextInt();
                            System.out.println("Digite sua senha.");
                            senha = teclado.nextInt();
                            if (senha == objSmart.senha && login == objSmart.login) {
                                objSmart.conectar(login, senha);
                            } else {
                                System.out.println("Login ou senha incorreta.");
                            }
                        }while (senha != objSmart.senha || login != objSmart.login);
                        break;
                    case 6:
                        int volume;
                        System.out.println("Escolha o volume.");
                        volume= teclado.nextInt();
                        if (volume>=0 && volume<=100){
                            objSmart.aumentarvolume(volume);
                        }else {
                            System.out.println("Volume invalido.");
                        }
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Opção invalida");
                }

                }while (opcao!=7);
            }
        }while (opcao!=3);



        /*
        objSmart.ligar_desligar();
        objSmart.aumentar_volume();
        objSmart.diminuir_volume();
        objSmart.trocar_canal(7);
        objSmart.conectar(123456,987654);
        */
        
        
    }
}
