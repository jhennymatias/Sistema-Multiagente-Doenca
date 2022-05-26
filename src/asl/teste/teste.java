// Internal action code for project aula1

package teste;

import java.util.List;

import jason.*;
import jason.asSemantics.*;
import jason.asSyntax.*;

public class teste extends DefaultInternalAction {

    @Override
    public Object execute(TransitionSystem ts, Unifier un, Term[] args) throws Exception {
        
        checkArguments(args);
        
        Term[] list = args;
       
        int saudavel = 1;//args[0].equals(true) ? 1 : 0; 
        System.out.print(saudavel);
        int doentes = 1;//args[1].equals("True")? 1 : 0;
        int ambiente = 1;//args[2].equals("Aberto")? 1 :0;
        int vacinado = 1;//args[3].equals("True")? 1:0;
        
        double mascara = 0.98;
//        
//        if (args[4].equals("PFF2")) {
//        	mascara = 0.98;
//        }else if(args[4].equals("Pano")) {
//        	mascara = 0.4;
//        }else if(args[4].equals("Cirurgica")) {
//        	mascara = 0.89;
//        }else if(args[4].equals("TNT")){
//        	mascara = 0.78;
//        }
//        
        int positivo = 0;//Integer.parseInt(args[5].toString());
        double result = 0;
        
        
        if( vacinado == 1 && saudavel == 1 && doentes == 0 && ambiente == 1 &&
        		positivo == 0
        	) {
        	
        	result = 0.95*0.50*0.90*0.90*mascara;
        }
        
               
        return un.unifies(args[6], Atom.parse(Double.toString(result)));

        // everything ok, so returns true
       // return true;
    }
}