import javax.swing.JLabel;
public class Contador extends Thread {
    private JLabel hr;
    boolean para=true;
    public Contador(JLabel hora) {
        this.hr = hora;
    }
    @Override
    public void run() {
       try {
    	   int segundo = 60; 
           //int hora = 0;
           int minuto = 1;   
           while( para ) {
        	   Thread.sleep(1000);
        	   if( PrincipalTela.isContador() ) {
        		   if( PrincipalTela.isZerado() ) {
        			   segundo = 60;
        	  //         hora = 0;
        	           minuto = 1;
        	           PrincipalTela.setZerado(false);
        		   }
        		     
	            	   segundo--;
	            	   if(minuto==0 && segundo==0) {
	            		   para=false;
	            		 }
	               if( segundo == 0 && !(minuto==0) ){
	                   segundo = 00;
	                   minuto = minuto-1;
	               }
	               
	              	              
	               String timer = //completaComZero(hora) + ":" +
	                              completaComZero(minuto) + ":" +
	                              completaComZero(segundo);
	               this.hr.setText(timer);
	               this.hr.revalidate();
        	   }
           }
       }
       
       catch (InterruptedException ex) {
           ex.printStackTrace();
       }
    }
    private String completaComZero(Integer i) {
        String retorno = null;
        if( i < 10 ) {
            retorno = "0"+i;
        } else {
            retorno = i.toString();
        }
        return retorno;
    }
}