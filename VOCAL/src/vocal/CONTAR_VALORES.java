
package vocal;

/**
 *
 * @author  Uziel
 */
public class CONTAR_VALORES {
    
  public static int texto(String txt){ 
       String TXT=txt;
       
       int ai=0;
       int ei=0;
       int ii=0;
       int oi=0;
       int ui=0;
       
       int Ai=0;
       int Ei=0;
       int Ii=0;
       int Oi=0;
       int Ui=0;
     
       
       int contara=0;
       int contare=0;
       int contari=0;
       int contaro=0;
       int contaru=0;
       
       int contarA=0;
       int contarE=0;
       int contarI=0;
       int contarO=0;
       int contarU=0;

       int TA,TE,TI,TO,TU;
       int contarT;
       
       
       ai=TXT.indexOf('a');
       while(ai!=-1)
       {
           contara++;
       ai=TXT.indexOf('a',ai+1);
       }
       
        ei=TXT.indexOf('e');
       while(ei!=-1)
       {
           contare++;
       ei=TXT.indexOf('e',ei+1);
       }

       ii=TXT.indexOf('i');
       while(ii!=-1)
       {
           contari++;
       ii=TXT.indexOf('i',ii+1);
       }
   
       oi=TXT.indexOf('o');
       while(oi!=-1)
       {
           contaro++;
       oi=TXT.indexOf('o',oi+1);
       }
  
       ui=TXT.indexOf('u');
       while(ui!=-1)
       {
           contaru++;
       ui=TXT.indexOf('u',ui+1);
       }
 
       
       Ai=TXT.indexOf('A');
       while(Ai!=-1)
       {
           contarA++;
       Ai=TXT.indexOf('A',Ai+1);
       }
       
        Ei=TXT.indexOf('E');
       while(Ei!=-1)
       {
           contarE++;
       Ei=TXT.indexOf('E',Ei+1);
       }

       Ii=TXT.indexOf('I');
       while(Ii!=-1)
       {
           contarI++;
       Ii=TXT.indexOf('I',Ii+1);
       }
   
       Oi=TXT.indexOf('O');
       while(Oi!=-1)
       {
           contarO++;
       Oi=TXT.indexOf('O',Oi+1);
       }
  
       Ui=TXT.indexOf('U');
       while(Ui!=-1)
       {
           contarU++;
       Ui=TXT.indexOf('U',Ui+1);
       }
       
       TA=contara+contarA;
       TE=contare+contarE;
       TI=contari+contarI;
       TO=contaro+contarO;
       TU=contaru+contarU;
       
        contarT=TA+TE+TI+TO+TU;
        
       VOCAL.jLabel6.setText(String.valueOf("TOLALES A= "+TA));
       VOCAL.jLabel7.setText(String.valueOf("TOLALES E= "+TE));
       VOCAL.jLabel8.setText(String.valueOf("TOLALES I= "+TI));
       VOCAL.jLabel5.setText(String.valueOf("TOLALES O= "+TO));
       VOCAL.jLabel9.setText(String.valueOf("TOLALES U= "+TU));
       
       VOCAL.jLabel3.setText(String.valueOf("VOCALES TOTALES= "+contarT));

      return contarT;
      
  }
  
 
    
    
}
