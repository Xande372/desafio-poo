import java.time.LocalDate;

import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitle("Programação Java");
        curso1.setDescription("Sintaxes básicas");
        curso1.setCourseLoad(60);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitle("Programação C#");
        mentoria1.setDescription("APS.NET");
        mentoria1.setDate(LocalDate.now());
        System.out.println(mentoria1);
    }
}
