import java.util.Scanner;


class Bicicleta
{
    int numMarchas, resposta;
    boolean bagageiro;
    Scanner input = new Scanner ( System.in );
    
    public Bicicleta(int marcha, int bagagem, int resp){
        System.out.println("Você possui bicicleta? 1 -> Sim / 2 -> Não.");
        String aresposta = input.next();
        resp = Integer.parseInt(aresposta);
        this.resposta = resp;
        if(resposta == 1){
            System.out.println("Informe o número de marchas da bicicleta: ");
            String march = input.next();
            marcha = Integer.parseInt(march);
            this.numMarchas = marcha;
            System.out.println(" ");
            System.out.println("A bicicleta possui bagageiro? 1 -> Sim / 2 -> Não.");
            String nomep = input.next();
            bagagem = Integer.parseInt(nomep);
            if(bagagem == 1){
            	this.bagageiro = true;
            }else if(bagagem == 2){
            	this.bagageiro = false;
            }else{
                System.out.println("Digite 1 para confirmar ou 2 para negar.");
                System.exit(0);
            }
        }else{
            System.out.println(" ");
        }
    }
    
    public int getresposta(){
        return this.resposta;
    }
    
    public int getmarcha(){
        return this.numMarchas;
    }
    
    
    public boolean getbagagem(){
        return this.bagageiro;
    }
    
    public void imprimirInformacoes(){
        if(this.resposta == 1){
        	System.out.println(" ");
        	System.out.println("A bicicleta possui " + this.getmarcha() + " marchas.");
        	if (bagageiro == true){
        		System.out.println(" ");
        		System.out.println("A bicicleta veio acompanhada com bagageiro. ");
        	}else{
        	  	System.out.println(" ");
        	  	System.out.println("A bicicleta não veio acompanhada com bagageiro. ");
        	}
        }else{
            System.out.println(" ");
        }
    }
    	  

}

class Moto{
	
	  int resposta;
	  boolean partidaEletrica;
	  Scanner input = new Scanner ( System.in );
	  public Moto(){
	  	System.out.println(" ");
	  	System.out.println("Você possui moto? 1 -> Sim / 2 -> Não.");
	  	String aresposta = input.next();
        int resp = Integer.parseInt(aresposta);
        this.resposta = resp;
        if(this.resposta == 1){
            System.out.println("A moto possui partida elétrica? 1 -> Sim / 2 -> Não.");
            String nomep = input.next();
            int partida = Integer.parseInt(nomep);
            if(partida == 1){
            	this.partidaEletrica = true;
            }else if(partida == 2){
            	this.partidaEletrica = false;
            }else{
                System.out.println("Digite 1 para confirmar ou 2 para negar.");
                System.exit(0);
            }
        }else{
            System.out.println(" ");
        }
	  }
	  
	  public boolean getpartida(){
        return this.partidaEletrica;
    }
	  
	  public void imprimirInformacoes(){
    	  System.out.println(" ");
    	  if (this.partidaEletrica == true){
    	  	  System.out.println(" ");
    	  	  System.out.println("A moto veio acompanhada com partida elétrica. ");
    	  }else{
    	  	  System.out.println(" ");
    	  	  System.out.println("A moto não veio acompanhada com partida elétrica. ");
    	  }
    }
	  
}

class Carro extends Moto{
	  
	  int qtdPortas;
	  Scanner input = new Scanner ( System.in );
	  public Carro(){
	      System.out.println(" ");
	      System.out.println("Você possui carro? 1 -> Sim / 2 -> Não.");
	      String aresposta = input.next();
          int resp = Integer.parseInt(aresposta);
          this.resposta = resp;
          if(this.resposta == 1){
    	  	  System.out.println("Informe a quantidade de portas do carro: ");
              String qtd = input.next();
              int quantidade = Integer.parseInt(qtd);
              this.qtdPortas = quantidade;
          }else{
              System.out.println(" ");
          }
	  }
	  
	  public int getportas(){
        return this.qtdPortas;
      }
	
	  public void imprimirInformacoes(){
    	  System.out.println(" ");
    	  Moto moto = new Moto();
    	  System.out.println("O carro possui " + this.	getportas() + " portas.");
    	  System.out.println(" ");
    	  moto.imprimirInformacoes();
      }
}
	  
//Classe automóvel recebe Moto e Carro.
class Automovel extends Carro{
    
    double potenciaDoMotor;
    Scanner input = new Scanner ( System.in );
    
    public Automovel(int potencia){
        System.out.println("Informe a potência do motor do seu automóvel: ");
        String p = input.next();
        potencia = Integer.parseInt(p);
        this.potenciaDoMotor = potencia;
    }
    
    public double getpotencia(){
        return this.potenciaDoMotor;
    }
    
    public void imprimirInformacoes(){
        Carro carro = new Carro();
        System.out.println("A potência do motor é de: " + this.	getpotencia() + " volts.");
        carro.imprimirInformacoes();
    	System.out.println(" ");
    	
    }
    
}



public class Main{    
	public static void main(String[] args) {
	   Bicicleta bike = new Bicicleta(1, 2, 3);
       System.out.println(" ");
       bike.imprimirInformacoes();
       System.out.println(" ");
       Automovel automovel = new Automovel(1);
       automovel.imprimirInformacoes();
	}
}








