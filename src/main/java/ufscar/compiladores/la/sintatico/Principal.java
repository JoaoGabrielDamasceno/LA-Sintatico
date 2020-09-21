package ufscar.compiladores.la.sintatico;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {
        // Preparação do arquivo de saída, args[1] é o caminho do arquivo de saída
        PrintStream out = new PrintStream(new FileOutputStream(args[1])); 
        System.setOut(out);
        try {
            int x = 0;
            // args[0] é o primeiro argumento da linha de comando referente ao arquivo de entrada
            // Cria uma instância do interpretador para a linguagem LA
            CharStream cs = CharStreams.fromFileName(args[0]);
            LALexer lexer = new LALexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LAParser parser = new LAParser(tokens);
            
            //Registrando a classe ErrorListener na main()
            ErrorListener el = new ErrorListener(x);
            parser.addErrorListener(el);
            
            //Chamando o simbolo inicial
            parser.programa();
            System.out.println("Fim da compilacao");  
 
        } catch (IOException ex) {
            
        }catch (ParseCancellationException ex){
            //Erros Lexicos
            System.out.println(ex.getMessage());
            System.out.println("Fim da compilacao");  
        }

    }
}