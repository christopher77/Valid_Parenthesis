
package validarparentesis;

import java.util.Stack;

/**
 *
 * @author maxro
 */
public class Iniciar {
    private String cadena;
    private Stack<Character> pila_de_parentesis = new Stack<Character>();
    
    public Iniciar(String cadena){
        this.cadena = cadena;
    }
    
    public boolean emparejar()
    {
        char[] arreglo_donde_buscar=cadena.toCharArray();
        for(int i=0;i<arreglo_donde_buscar.length;i++)
        {
            if(arreglo_donde_buscar[i]=='(')
            {
                pila_de_parentesis.push(arreglo_donde_buscar[i]);
            }
            else if(arreglo_donde_buscar[i]==')')
            {
                if(!pila_de_parentesis.empty()&& pila_de_parentesis.peek() != ')')
                {
                    pila_de_parentesis.pop();
                }else{
                    pila_de_parentesis.push(arreglo_donde_buscar[i]);
                }
            }
        }
        return pila_de_parentesis.empty();
    }
    
}
